package forum;

public interface ManageThreadsDAO {
	
	void createThread(PostEntity post);
	void deleteThread(Integer threadId);
	void changeTopic(String topic);
}
