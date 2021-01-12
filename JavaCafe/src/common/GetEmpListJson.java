package common;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetEmpList")
public class GetEmpListJson extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GetEmpListJson() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		EmpDAO dao = new EmpDAO();
		List<EmployeeVO> list = dao.getEmpList();
		PrintWriter out=response.getWriter();
		String json = "[";
		int cnt=1;
		for(EmployeeVO emp : list) {
			json +="{";
			json +="\"empId\":\""+emp.getEmployeeid()+"\"";
			json +=",\"firstName\":\""+emp.getFirstName()+"\"";
			json +=",\"LastName\":\""+emp.getLastName()+"\"";
			json +="}";
			if(list.size() != cnt++) {
				json +=",";
			}
		}
		json +="]";
		out.print(json);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
