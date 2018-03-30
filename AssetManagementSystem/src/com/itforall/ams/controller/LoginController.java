package com.itforall.ams.controller;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.itforall.ams.boimpl.LoginBOImpl;
import com.itforall.ams.constants.SuccessConstants;
import com.itforall.ams.exceptions.InvalidPassword;
import com.itforall.ams.exceptions.InvalidUsername;
import com.itforall.ams.helperfunctions.Md5HashGenerate;
import com.itforall.ams.vo.LoginVO;

/**
 * Servlet implementation class LoginController
 */
@WebServlet(description = "Controller which will help to login into the asset management system", urlPatterns = { "/LoginController" })
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		LoginVO vo = new LoginVO();
		vo.setUsername(request.getParameter("username"));
		/*try {
			vo.setPassword(Md5HashGenerate.HashGenerator(request.getParameter("password")));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		vo.setPassword(request.getParameter("password"));
		
		LoginBOImpl loginBo = new LoginBOImpl();
		boolean flag;
		
		RequestDispatcher rd;
		try
		{
			flag = loginBo.LoginBO(vo);
			if(flag)
			{
				HttpSession s = request.getSession();
				s.setAttribute("username", vo.getUsername());
				rd = request.getRequestDispatcher(SuccessConstants.USERLOGINSUCCESS);
				rd.forward(request, response);
			}
		}
		catch(InvalidUsername e)
		{
			request.setAttribute("invalidUserName", e.getMessage());
			rd = request.getRequestDispatcher("Failure.jsp");
			rd.forward(request, response);
		}
		catch(InvalidPassword e)
		{
			request.setAttribute("invalidPassword", e.getMessage());
			rd = request.getRequestDispatcher("Failure.jsp");
			rd.forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
