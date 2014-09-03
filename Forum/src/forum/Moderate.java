package forum;

public interface Moderate extends Post {
	
	void createPost(Integer postID, Integer parentPostID, String posterName, String message, String[] imageName, String[] imageID);
	void editPost(Integer postID, String message, String posterName, String[] imageName, String[] imageID);
	void editThread(Integer threadID, String topic, String message, String posterName, String[] imageName, String[] imageID);
}
