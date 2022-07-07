package Ch02;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/WEBINFTest.do")
public class C01Servlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("TEST");
		
		//Forward방식
		RequestDispatcher dis = req.getRequestDispatcher("/WEB-INF/test.jsp");
		dis.forward(req, resp);
		
	}
	//Form 요청
	//- doPost(), doGet()받아서 처리
	
	//일반 요청
	//- Service () 처리
	
	
	
}
