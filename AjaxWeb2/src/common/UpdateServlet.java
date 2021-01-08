package common;

import java.io.IOException;
import java.util.List;

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
		EmpDAO dao = new EmpDAO();
		List<EmployeeVO> list = dao.getEmpList();
		String xml = "<dataset>";
		for(EmployeeVO emp : list) {
		xml +="<record>";
		xml +="<empId>"+emp.getEmployeeid()+"</empId>"
			  + "<firstName>"+emp.getFirstName()+"</firstName>"
			  + "<lastName>"+emp.getLastName()+"</lastName>"
			  + "<email>"+emp.getEmail()+"</email>"
			  + "<phoneNumber>"+emp.getPhoneNumber()+"</phoneNumber>"
			  + "<hireDate>"+emp.getHireDate()+"</hireDate>"
			  + "<jobID>"+emp.getJobID()+"</jobID>"
			  + "<salary>"+emp.getSalary()+"</salary>";
		xml +="</record>";
		}
		xml +="</dataset>";
		
		String fName=request.getParameter("fName");
		String lName=request.getParameter("lName");
		String email=request.getParameter("email");
		String phone=request.getParameter("phone");
		String jobId=request.getParameter("jobId");
		String salary=(request.getParameter("salary"));
		
		EmployeeVO vo = new EmployeeVO();
		vo.setFirstName(fName);
		vo.setLastName(lName);
		vo.setEmail(email);
		vo.setPhoneNumber(phone);
		vo.setJobID(jobId);
		vo.setSalary(Integer.parseInt(salary));
		
		String id = request.getParameter("empId");
		int employeeId= Integer.parseInt(id);
		vo.setEmployeeid(employeeId);
		
		EmpDAO dao1 = new EmpDAO();
		if(dao1.deleteEmp(vo)) {
			response.getWriter().append("<h1>OK</h1>");
		}else {
			response.getWriter().append("<h1>NG</h1>");
		}
		/*
		 * EmpDAO dao1 = new EmpDAO(); List<EmployeeVO> v1 = dao1.updateEmp(vo); String
		 * result = "<result>"; result ="<empId>" + v1.getEmployeeid() + "</empId>";
		 * result ="<fName>" + v1.getFirstName() + "</fName>"; result ="<lName>" +
		 * v1.getLastName() + "</lName>"; result ="<email>" + v1.getEmail() +
		 * "</email>"; result ="<phone>" + v1.getPhoneNumber() + "</phone>"; result
		 * ="<hDate>" + v1.getHireDate() + "</hDate>"; result ="<jId>" + v1.getJobID() +
		 * "</jId>"; result ="<salary>" + v1.getSalary() + "</salary>"; result =
		 * "</result>";
		 */
		
		response.getWriter().append(xml);
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
