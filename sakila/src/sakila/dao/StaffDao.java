package sakila.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import sakila.query.StaffQuery;
import sakila.vo.Staff;

public class StaffDao {
	public Staff selectStaffByKey(Connection conn, Staff staff) throws Exception{
		Staff returnStaff = null;
		PreparedStatement stmt = conn.prepareStatement(StaffQuery.SELECT_STAFF_BY_KEY);
		stmt.setString(1, staff.getEmail());
		System.out.println(stmt + "<-- email");
		stmt.setString(2, staff.getPassword());
		System.out.println(stmt + "<-- password");
		ResultSet rs = stmt.executeQuery();
		if(rs.next()) {
			returnStaff = new Staff();
			returnStaff.setStaff_id(rs.getInt("staff_id"));
			System.out.println(returnStaff.getStaff_id() + "<-- staff_id");
			returnStaff.setUsername(rs.getString("username"));
			System.out.println(returnStaff.getUsername() + "<--- username");
		}
		return returnStaff;
	}
}
