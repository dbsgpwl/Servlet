package Ch01;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
//상속관계 만들어주면 서블릿 파일이 됨
@WebServlet("/Servlet1.do") //url정보 
public class C01ServletTest extends HttpServlet{

	
	@Override  //함수실행시 단 한번 호출
	public void init() throws ServletException {
		System.out.println("INIT 함수 호출");
		System.out.println("!!!!");
	}
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("Service 함수 호출");
		System.out.println("!!!!");
		System.out.println("!!!!");
		
	}

	@Override //코드 수정, 삭제
	public void destroy() {
		System.out.println("Destroy 함수 호출");
		System.out.println("!!");
	}

	

}
