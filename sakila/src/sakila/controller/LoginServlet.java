package sakila.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import sakila.service.StaffService;
import sakila.service.StatsService;
import sakila.vo.Staff;
import sakila.vo.Stats;

@WebServlet({"/","/LoginServlet"})
public class LoginServlet extends HttpServlet {
	private StatsService statsService;
	private StaffService staffService;
	// 로그인 폼
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(session.getAttribute("loginStaff") != null) {
			response.sendRedirect(request.getContextPath()+"/auth/IndexServlet");
			return;
		}
		statsService = new StatsService();
		Map<String, Object> map = statsService.getStats();
		
		Stats stats = new Stats();
		stats =(Stats)map.get("returnStats");
		long totalCount = (long)map.get("totalCount");
		request.setAttribute("stats",stats);
		request.setAttribute("totalCount", totalCount);
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	// 로그인 액션
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		staffService = new StaffService();
		Staff staff = new Staff();
		String email = request.getParameter("email");
		System.out.println(email + "<-- Servlet_email");
		String password = request.getParameter("password");
		System.out.println(password + "<-- Servlet_password");
		staff.setEmail(email);
		staff.setPassword(password);
		Staff returnStaff= staffService.getStaffByKey(staff);
		
		HttpSession session = request.getSession();
		if(returnStaff != null) {
			System.out.println("로그인 성공");
			session.setAttribute("loginStaff", returnStaff);
			response.sendRedirect(request.getContextPath()+"/auth/IndexServlet");
			return;
		}
		System.out.println("로그인 실패");
		response.sendRedirect(request.getContextPath()+"/LoginServlet");
	}
}