package forum;

public interface Post {
	
	void createPost();
	void createThread();
	void deletePost(Integer postID);
	void deleteThread(Integer threadID);
	
}
