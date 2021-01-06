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
		
//		if(dao.boardList(vo)) {
//			let t = document.createElement(table);
//			  t.setAttribute(border, 1);
//			  let tr = document.createElement(tr);
//			  for(let i=0; i<=10; i++){
//				  let td= document.createElement(td);
//			      let title= document.querySelectorAll('input[name="title"]')[0].value
//		          td.append(title);
//			      tr.append(td);
//			      let content = document.getElementById('content').value;
//			      td.append(title);
//			      tr.append(td);
//			      let writer = document.getElementById('writer').value;
//			      td.append(title);
//			      tr.append(td);
//				  t.append(tr);
//			  }
//			  show.append(t);
//    	}else{
//    		response.getWriter().append("<h1>NG</h1>");
//    	}; 
		      
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
