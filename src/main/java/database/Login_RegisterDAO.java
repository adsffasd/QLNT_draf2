package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Login_Register;

public class Login_RegisterDAO implements DAOInterface<Login_Register> {
	public ArrayList<Login_RegisterDAO> data = new ArrayList<>();

	@Override
	public ArrayList<Login_Register> selectAll() {
		ArrayList<Login_Register> ketQua = new ArrayList<Login_Register>();
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();

			// Bước 2: tạo ra đối tượng statement
			String sql = "SELECT * FROM login_register";
			PreparedStatement st = con.prepareStatement(sql);

			// Bước 3: thực thi câu lệnh SQL
			System.out.println(sql);
			ResultSet rs = st.executeQuery();

			// Bước 4:
			while (rs.next()) {
				String user = rs.getString("user");
				String password = rs.getString("password");

				Login_Register lr = new Login_Register(user, password);
				ketQua.add(lr);
			}

			// Bước 5:
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}

	@Override
	public Login_Register selectById(Login_Register t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(Login_Register t) {
		int ketQua = 0;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();

			// Bước 2: tạo ra đối tượng statement
			String sql = "INSERT INTO login_register (user, password) " + " VALUES (?,?)";

			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getUser());
			st.setString(2, t.getPassword());

			// Bước 3: thực thi câu lệnh SQL
			ketQua = st.executeUpdate();

			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}

	@Override
	public int insertAll(ArrayList<Login_Register> arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Login_Register t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAll(ArrayList<Login_Register> arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Login_Register t) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean checkUser(String user) {
		boolean ketQua = false;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();

			// Bước 2: tạo ra đối tượng statement
			String sql = "SELECT * FROM login_register WHERE user=?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, user);

			// Bước 3: thực thi câu lệnh SQL
			System.out.println(sql);
			ResultSet rs = st.executeQuery();

			// Bước 4:
			while (rs.next()) {
				ketQua = true;
			}

			// Bước 5:
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}

	public Login_Register usernameAndPassword(Login_Register t) {
		Login_Register ketQua = null;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();

			// Bước 2: tạo ra đối tượng statement
			String sql = "SELECT * FROM login_register WHERE user=? and password=?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getUser());
			st.setString(2, t.getPassword());

			// Bước 3: thực thi câu lệnh SQL
			ResultSet rs = st.executeQuery();

			// Bước 4:
			while (rs.next()) {
				String user = rs.getString("user");
				String password = rs.getString("password");
				ketQua = new Login_Register(user, password);
			}

			// Bước 5:
			JDBCUtil.closeConnection(con);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ketQua;
	}

}
