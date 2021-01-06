package common;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteEmpServ")
public class DeleteEmpServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteEmpServ() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//localhost/AjaxWeb/deleteEmp?empid=210 이렇게 페이지 호출할때, 210번을 받아서 delete하겠다는..

		String id = request.getParameter("empId");//화면삭제시 넘겨주는 파라미터
		id = id == null ? "0" : id;
		int employeeId= Integer.parseInt(id); //문자로 된 id를 int로 바꿔줌, null값이 발생하면 paseint로 못받아서 아래와 같이 해야함
		EmployeeVO vo=new EmployeeVO();
		vo.setEmployeeid(employeeId);
		
		EmpDAO dao = new EmpDAO();
		if(dao.deleteEmp(vo)) {
			response.getWriter().append("<h1>OK</h1>");
		}else {
			response.getWriter().append("<h1>NG</h1>");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
