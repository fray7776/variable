package common;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetEmpDataset")
public class GetEmpDataset extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GetEmpDataset() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		EmpDAO dao=new EmpDAO();
		List <EmployeeVO> list= dao.getEmpList();
		int cnt=1;
		String json="[";
		for(EmployeeVO emp : list) {
			json +="{";
			json += "\"EmployeeId\":"+emp.getEmployeeid()+"";
			json += ",\"FirstName\":\""+emp.getFirstName()+"\"";
			json += ",\"LastName\":\""+emp.getLastName()+"\"";
			json += ",\"Email\":\""+emp.getEmail()+"\"";
			json += ",\"HireDate\":\""+emp.getHireDate()+"\"";
			json += ",\"Salary\":"+emp.getSalary()+"";
			json +="}";
			if(list.size() != cnt++) {
				json+=",";
			}
		}
		json +="]";
		response.getWriter().append(json);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
