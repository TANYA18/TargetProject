/**
 * 
 */
package com.itforall.ams.dao;

import com.itforall.ams.exceptions.InvalidPassword;
import com.itforall.ams.exceptions.InvalidUsername;
import com.itforall.ams.vo.LoginVO;

/**
 * @author TK048537
 *
 */
public interface LoginDAO {
	boolean loginDAO(LoginVO vo) throws InvalidUsername, InvalidPassword;
}
