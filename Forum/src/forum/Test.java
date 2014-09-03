package forum;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Random;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.enterprise.context.RequestScoped;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/test")
public class Test extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private static int order = 0;
	
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
			n = rand.nextInt(10000);
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<html><body>losowa liczba: " + n + "</body></html>");
		
		//Post p = new Post("ssłążąśćz", "そうですよねわわわ", "ąąłłłasds", "sas");
		//managePostsDAO.createPost(p, 0);
		
		ThreadEntity th = new ThreadEntity(n, "", order);
		managePostsDAO.test(th);
		order++;
		
		if(request.getParameter("orderUp").equals("1"))
			managePostsDAO.test2();
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
