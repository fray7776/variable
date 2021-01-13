package common;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetSchedules")
public class GetScheduleServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GetScheduleServ() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpDAO dao=new EmpDAO();
		List<Schedule> sd= dao.getScheduleList();
		PrintWriter out = response.getWriter();
		int cnt=1;
		String json = "[";
		for(Schedule sdList : sd) {
			json +="{";
			json += "\"title\":\""+sdList.getTitle()+"\"";
			json += ",\"start\":\""+sdList.getStartData()+"\"";
			json += ",\"end\":\""+sdList.getEndData()+"\"";
			json += ",\"url\":\""+sdList.getUrl()+"\"";
			json +="}";
			
			if(sd.size() != cnt++) {
				json +=",";
			}
		}
		json += "]";
		out.print(json);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
