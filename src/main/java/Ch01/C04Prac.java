package Ch01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/PostTest1.do")

public class C04Prac extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userid=req.getParameter("userid");
		String email=req.getParameter("email");
		String addr1=req.getParameter("addr1");
		String addr2=req.getParameter("addr2");
		
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		out.println("USERID : "+userid+"<br>");
		out.println("email : "+email+"<br>");
		out.println("addr1 : "+addr1+"<br>");
		out.println("addr2 : "+addr2);
		
	
	}
	//서블릿 파일 만들기
	//doPost 함수 오버라이딩하기 
	
	//Form 으로 부터 요청이 들어오면 해당 파라미터를 브라우저로 전송
	//Form에서 전송하는 내용은 
	//userid, email, addr1, addr2 
	
	//03Form.jsp 만들어서 실행
}
