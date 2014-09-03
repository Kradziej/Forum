package forum;


public class AnonymousPoster implements Post {
	
	
	@Override
	public void createPost(Integer parentPostID, String posterName,
			String message, String[] imageName, String[] imageID) {
	
		
	}

	@Override
	public void createPost(Integer parentPostID, String posterName,
			String message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createThread(String topic, String posterName, String message,
			String[] imageName, String[] imageID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePost(Integer postID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteThread(Integer threadID) {
		// TODO Auto-generated method stub
		
	}

}
