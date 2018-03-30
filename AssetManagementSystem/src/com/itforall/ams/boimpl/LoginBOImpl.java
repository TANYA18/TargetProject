package com.itforall.ams.boimpl;


import com.itforall.ams.bo.loginbo;
import com.itforall.ams.connection.CreateConnection;
import com.itforall.ams.daoimpl.LoginDAOImpl;
import com.itforall.ams.exceptions.InvalidPassword;
import com.itforall.ams.exceptions.InvalidUsername;
import com.itforall.ams.vo.LoginVO;

/**
 * @author TK048537
 *
 */
public class LoginBOImpl implements loginbo {
	boolean flag;
	
	@Override
	public boolean LoginBO(LoginVO vo) throws InvalidUsername, InvalidPassword {
		// TODO Auto-generated method stub
		boolean valid = false;
		String password = vo.getPassword();
		String username = vo.getUsername();
		
		//System.out.println(vo.getPassword() + " is password and username is - " +  vo.getUsername());
		
		int a = 0;
		for (int i = 0; i<vo.getPassword().length(); i++)
		{
			if(Character.isUpperCase(password.charAt(i)))
			{
				a++;
			}
			if(Character.isLowerCase(password.charAt(i)))
			{
				a++;
			}
			if(Character.isDigit(password.charAt(i)))
			{
				a++;
			}
		}
			if(a >= 3)
			{
				valid = true;
			}
			
			System.out.println(vo.getPassword() + " is password and username is - " +  vo.getUsername());
			
			if(valid == false)
			{
				flag = false;
				throw new InvalidPassword("Invalid Password");
			}
			else if(username.length() < 5)
			{
				flag = false;
				throw new InvalidUsername("Invalid Username. Enter valid username");
			}
			else if(vo.getPassword().length() < 6)
			{
				flag = false;
				throw new InvalidPassword("Invalid Password");
			}
			else
			{
				LoginDAOImpl loginDAO = new LoginDAOImpl();
				flag = loginDAO.loginDAO(vo);
			}
			
	
		
		return flag;
	}

}
