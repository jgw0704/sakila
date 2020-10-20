package skaila.commons;

import java.sql.*;

public class DBUtil {
		public Connection getConnection() throws Exception {
		
		String dbaddr = "jdbc:mariadb://localhost:3306/sakila";
		String dbid = "root";
		String dbpw = "java1004";
	
		Connection conn = DriverManager.getConnection(dbaddr, dbid, dbpw);
		return conn;
	}
}