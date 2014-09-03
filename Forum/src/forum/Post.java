package forum;

public interface Post {
	
	void createPost(Integer parentPostID, String posterName, String message, String[] imageName, String[] imageID);
	void createPost(Integer parentPostID, String posterName, String message);
	void createThread(String topic, String posterName, String message, String[] imageName, String[] imageID);
	void deletePost(Integer postID);
	void deleteThread(Integer threadID);
	
}
