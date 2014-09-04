package forum;

import java.util.HashMap;
import java.util.Map;

import javax.ejb.EJB;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class ThreadViewAjax {
	
	// ID of top thread
	Integer top;
	// ID of bottom thread
	Integer bottom;
	Map<Integer, Thread> threadTree;
	Map<Integer, Thread> bottomThreadTree;
	//top structure of thread tree
	Integer[] topTree;
	
	//from settings
	private static Integer replyPostsOnPage;
	
	@EJB private PostService cont;
	@EJB private ManageThreadsDAO manageThreads;
	
	
	public ThreadViewAjax() {
		threadTree = new HashMap<>();
	}

	
	public void init() {
		
		
	}

	
	Map<Integer, Thread> getBottomPost(Integer threadId) {
		
		if(!cont.isNewContribution())
			return bottomThreadTree;
		
		// SORT SOMEWHERE??
		Integer[] topTree = manageThreads.getThreadTopTree(threadId); 
		return threadTree;
		
		
	}
	
	
	
	
	// GETTERS / SETTERS
	
	
	public void setManageThreads(ManageThreadsDAO manageThreads) {
		this.manageThreads = manageThreads;
	}
	
	
	
	
	

}
