package sakila.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import sakila.dao.StatsDao;
import sakila.vo.Stats;
import skaila.commons.DBUtil;

public class StatsService {
	private StatsDao statsDao;
	
	private Stats getToday() {
		Calendar today = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
		String day = formater.format(today.getTime());
		Stats stats = new Stats();
		stats.setDay(day);
		System.out.println(stats.getDay());
		return stats;
	}
	
	// ���� �湮�� �� dao�޼��� ȣ�� Stats + �� �湮�� �� dao�޼��� ȣ�� int -> Map
	public Map<String, Object> getStats() {
		Map<String, Object> map = new HashMap<String, Object>();
		statsDao = new StatsDao();
		Stats returnStats = null;
		Connection conn = null;
		try {
			DBUtil dbUtil = new DBUtil();
			conn = dbUtil.getConnection();
			conn.setAutoCommit(false);
			
			Stats stats = this.getToday();
			returnStats= statsDao.selectDay(conn, stats);
			System.out.println(returnStats.getCnt());
			long totalCount = statsDao.totalCount(conn); // daoȣ��
			System.out.println(totalCount);
			map.put("returnStats",returnStats);
			map.put("totalCount", totalCount);
			
			conn.commit();
		} catch(Exception e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return map;
	}
	
	public void countStats() {
		statsDao = new StatsDao();
		Connection conn = null;
		try {
			DBUtil dbUtil = new DBUtil();
			conn = dbUtil.getConnection();
			conn.setAutoCommit(false);
			Stats stats = this.getToday();
			System.out.println(stats.getDay());
			if(statsDao.selectDay(conn, stats) == null) {
				statsDao.insertStats(conn, stats);
			} else {
				statsDao.updateStats(conn, stats);
			}
			conn.commit();
		} catch (Exception e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}