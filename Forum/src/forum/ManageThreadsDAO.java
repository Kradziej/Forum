package forum;

public interface ManageThreadsDAO {
	
	void createThread(Post post);
	void deleteThread(Integer threadId);
	void changeTopic(String topic);
}
