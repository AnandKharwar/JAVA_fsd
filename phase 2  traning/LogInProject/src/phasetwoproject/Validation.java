package phasetwoproject;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Validation extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		
		String s1 = req.getParameter("userId");
		String s2 = req.getParameter("passward");
		String s3="Anand";
		String s4="12345";
		PrintWriter pw= resp.getWriter();
		if(s1.contentEquals(s3) && s2.contentEquals(s4))
		{
			
			pw.println("User Validated");
		}
		else
		{
			
			pw.println("User Not validated");
	}

}
}