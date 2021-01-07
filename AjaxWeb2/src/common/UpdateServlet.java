package common;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UpdateServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("empId");
		String fName=request.getParameter("fName");
		String lName=request.getParameter("lName");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String jobId=request.getParameter("jobId");
		String salary=(request.getParameter("salary"));
		
		System.out.println(id+','+fName+','+lName+','+email+','+phone+','+jobId+','+salary);
		id = id == null ? "0" : id;
		
//		document.getElementById("empId").childNodes[1].firstChild.nodeValue=document.getElementById("lName").value
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
