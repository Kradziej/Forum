package forum;

import java.util.HashMap;
import java.util.Map;

public class Thread {
	
	private Integer parentPost;
	private Integer bottomPost;
	//Settings
	//private static int maxDepth;
	private PostTree<PostEntity> threadStructure; 
	
	Thread(PostEntity thread) {
		
		threadStructure = new PostTree<PostEntity>(thread);
		this.parentPost = thread.getPostId();
	}
	
	
	void loadThreadStructure() {
		
		
	}

	
	
}
