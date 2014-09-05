package forum;

import java.util.List;

public interface ManageDAO {
	
	//void createPost(PostEntity post, Integer threadId, Integer parentPostId);
	void createPost(PostEntity post, Integer parentPostId);
	void createThread(PostEntity post);
	void deletePost(Integer postId);
	void deleteThread(Integer threadId);
	// get all threads from bottom to top order
	List<ThreadEntity> getThreadsByOrder(int bottomOrder, int topOrder);
	Integer[] getThreadTopTree(int threadId);
	
	//Mod functions
	void editPost(String msg);
	void changeTopic(String topic);

	
	

	

}
