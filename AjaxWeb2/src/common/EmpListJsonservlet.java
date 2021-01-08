package common;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/empListJson")
public class EmpListJsonservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EmpListJsonservlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 웹페이지에 표현

		EmpDAO dao = new EmpDAO();
		List<EmployeeVO> list = dao.getEmpList();
		int i = 1;
		String jsonFile = "[";
		for (EmployeeVO emp : list) {
			jsonFile += "{";
			jsonFile += "\"id\":"+emp.getEmployeeid(); // key : value 형식으로 해야함!
			jsonFile += ",\"firstName\":\""+emp.getFirstName()+"\"";
			jsonFile += ",\"lastName\":\""+emp.getLastName()+"\"";
			jsonFile +=",\"email\":\""+emp.getEmail()+"\"";
			jsonFile +=",\"phoneNumber\":\""+emp.getPhoneNumber()+"\"";
			jsonFile +=",\"jobID\":"+emp.getJobID();
			jsonFile += ",\"HireDate\":\""+emp.getHireDate()+"\"";
			jsonFile += "}"; //마지막데이터만 ',' 추가(조건문으로!)
			if(list.size() != i++) { //list.size ->list에 들어있는 사이즈만큼
				jsonFile +=",";
			}
		}
		jsonFile += "]";

		response.getWriter().append(jsonFile);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
