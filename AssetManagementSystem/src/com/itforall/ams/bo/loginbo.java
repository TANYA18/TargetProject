package com.itforall.ams.bo;
import com.itforall.ams.exceptions.InvalidPassword;
import com.itforall.ams.exceptions.InvalidUsername;
import com.itforall.ams.vo.LoginVO;

/**
 * @author TK048537
 *
 */
public interface loginbo {
	
	boolean LoginBO(LoginVO vo) throws InvalidUsername, InvalidPassword;
	
}
