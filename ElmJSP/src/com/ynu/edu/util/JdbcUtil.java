package com.ynu.edu.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * @ClassName SaveUserInfoServlet
 * @Description 用户信息
 * @Author Echo-Nie
 * @Date 2024/12/9 14:29
 * @Version V1.0
 */
public class JdbcUtil {

    static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
            String url = "jdbc:mysql://localhost:3306/eshop?serverTimezone=Asia/Shanghai&characterEncoding=utf-8&useSSL=false&allowPublicKeyRetrieval=true";
            String username = "root";
            String password = "mysql123";
            conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if (conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
