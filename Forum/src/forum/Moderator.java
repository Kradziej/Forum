package forum;

public class Moderator extends AnonymousPoster implements Moderate {
	
	

	@Override
	public void editPost(Integer postID, String message, String posterName,
			String[] imageName, String[] imageID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editThread(Integer threadID, String topic, String message,
			String posterName, String[] imageName, String[] imageID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createPost(Integer postID, Integer parentPostID,
			String posterName, String message, String[] imageName,
			String[] imageID) {
		// TODO Auto-generated method stub
		
	}

}
