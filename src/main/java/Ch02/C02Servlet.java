package Ch02;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// a태그는 get 방식! -> doGet
@WebServlet("/WEBINFTest2.do")

public class C02Servlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//Forword
		req.getRequestDispatcher("/WEB-INF/02test.jsp").forward(req, resp);
	}

}
