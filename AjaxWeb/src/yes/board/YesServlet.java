package yes.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.board.BoardVO;

/**
 * Servlet implementation class YesServlet
 */
@WebServlet("/YesServlet")
public class YesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public YesServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String writer = request.getParameter("writer");
		
		YesVO vo = new YesVO();
		vo.setTitle(title);
		vo.setContent(content);
		vo.setWriter(writer);
		
		YesDAO dao = new YesDAO();
		
		if(dao.insertBoard(vo)) {
			response.getWriter().append("<h1>OK</h1>");
		}else {
			response.getWriter().append("<h1>NG</h1>");
		};
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
