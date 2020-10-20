package sakila.dao;

import java.sql.*;

import sakila.query.StatsQuery;
import sakila.vo.Stats;
import skaila.commons.DBUtil;

public class StatsDao {
	// 합
	public long totalCount(Connection conn) throws Exception {
		
		long totalcount=0;
		PreparedStatement stmt = conn.prepareStatement(StatsQuery.TOTAL_COUNT);
		ResultSet rs = stmt.executeQuery();
		if(rs.next()) {
			totalcount = rs.getLong("sum(cnt)");
		}
		System.out.println(totalcount);
		return totalcount; 
	}
	
	// rs.next()가 있으면 update 없으면 insert
	public Stats selectDay(Connection conn, Stats stats) throws Exception {
		Stats returnStats = null;
		PreparedStatement stmt = conn.prepareStatement(StatsQuery.SELECT_DAY);
		stmt.setString(1, stats.getDay());
		System.out.println(stmt + "<-- day_stmt");
		ResultSet rs = stmt.executeQuery();
		if(rs.next()) {
			returnStats = new Stats();
			returnStats.setDay(rs.getString("day"));
			returnStats.setCnt(rs.getLong("cnt"));
		}
		System.out.println(returnStats.getCnt() + "<-- getCnt");
		return returnStats; 
	}
	
	// false
	public void insertStats(Connection conn, Stats stats) throws Exception {
		PreparedStatement stmt = conn.prepareStatement(StatsQuery.INSERT_STATS);
		stmt.setString(1, stats.getDay());
		System.out.println(stmt + "<-- in_stmt");
		stmt.executeUpdate();
	}
	
	// true
	public void updateStats(Connection conn, Stats stats) throws Exception {
		PreparedStatement stmt = conn.prepareStatement(StatsQuery.UPDATE_STATS);
		stmt.setString(1, stats.getDay());
		System.out.println(stmt + "<-- up_stmt");
		stmt.executeUpdate();
	}
}