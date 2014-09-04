package forum;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class PageView {
	
	
	public List<ThreadEntity> threads;
	public Map<Integer, PostTree<PostEntity>> bottomReplies;
	private static Integer maxReplies = 3;
	private static Integer threadsPerPage = 8;
	
	@EJB private PostService cont;
	@EJB private ManageThreadsDAO manageThreads;
	
	
	public PageView() {
		
		bottomReplies = new HashMap<>();
	}
	
	// pageNumber is from 0 to up
	public void getPageThreads(Integer pageNumber) {
		
		threads = manageThreads.getThreadsByOrder(pageNumber * threadsPerPage, threadsPerPage - 1);
		System.out.println(threads.get(1).getTopic());
	}

	
	
	// GETTERS / SETTERS
	
	
	public void setCont(PostService cont) {
		this.cont = cont;
	}

	public void setManageThreads(ManageThreadsDAO manageThreads) {
		this.manageThreads = manageThreads;
	}
	
	

}
