package forum;

import java.util.List;

public interface ManageThreadsDAO {
	
	void createThread(PostEntity post);
	void deleteThread(Integer threadId);
	// get all threads from bottom to top order
	List<ThreadEntity> getThreadsByOrder(int bottomOrder, int topOrder);
	Integer[] getThreadTopTree(int threadId);
	void changeTopic(String topic);
}
