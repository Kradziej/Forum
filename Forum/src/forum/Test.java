package forum;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private ManagePostsDAO managePostsDAO;
       
    public Test() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Random rand = new Random();
		Integer n;
		
		try {
			n = Integer.parseInt(request.getParameter("losowa"));
		} catch (NumberFormatException e) {
			System.out.println("Not a number");
			n = rand.nextInt(100);
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<html><body>losowa liczba: " + n + "</body></html>");
		
		Post p = new Post("ss", "aa", "asds", "sas");
		managePostsDAO.createPost(p, 0);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	

	public ManagePostsDAO getManagePostsDAO() {
		return managePostsDAO;
	}

	public void setManagePostsDAO(ManagePostsDAO managePostsDAO) {
		this.managePostsDAO = managePostsDAO;
	}
	
	
	

}
