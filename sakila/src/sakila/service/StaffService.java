package sakila.service;

import java.sql.Connection;
import java.sql.SQLException;

import sakila.dao.StaffDao;
import sakila.vo.Staff;
import skaila.commons.DBUtil;

public class StaffService {
	private StaffDao staffDao;
	public Staff getStaffByKey(Staff staff) {
		Staff returnStaff = null;
		
		Connection conn = null;
		
		try {
			DBUtil dbUtil = new DBUtil();
			conn = dbUtil.getConnection();
			conn.setAutoCommit(false);
			System.out.println("db»Æ¿Œ ");
			staffDao = new StaffDao();
			
			returnStaff = staffDao.selectStaffByKey(conn, staff);
			conn.commit();
		}catch(Exception e) {
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
		return returnStaff;
	}
}
