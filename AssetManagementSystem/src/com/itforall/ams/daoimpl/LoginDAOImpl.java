package com.itforall.ams.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.Cookie;

import com.itforall.ams.connection.CreateConnection;
import com.itforall.ams.constants.SuccessConstants;
import com.itforall.ams.dao.LoginDAO;
import com.itforall.ams.exceptions.InvalidPassword;
import com.itforall.ams.exceptions.InvalidUsername;
import com.itforall.ams.vo.LoginVO;

/**
 * @author TK048537
 *
 */
public class LoginDAOImpl implements LoginDAO {
	boolean flag;
	Connection con;
	PreparedStatement ps;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.itforall.ams.dao.LoginDAO#login(com.itforall.ams.vo.LoginVO)
	 */
	public boolean loginDAO(LoginVO vo) throws InvalidUsername, InvalidPassword {
		// TODO Auto-generated method stub
		boolean flag = false;
		Cookie cookie;
		CreateConnection getConnectionObj = new CreateConnection();
		con = getConnectionObj.getConnection();
		try {
			ps = con.prepareStatement(SuccessConstants.LOGIN);
			ps.setString(1, vo.getUsername());
			ps.setString(2, vo.getPassword());
			ResultSet result = ps.executeQuery();
			if (result != null) {
				flag = true;
			} else {
				flag = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		CreateConnection.closeConnection();
		return flag;

	}

}
