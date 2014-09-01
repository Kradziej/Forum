package forum;

import javax.ejb.Local;

@Local
public interface ManagePostsDAO {
	
	void createPost(Post post, Integer threadId);
	void deletePost(Integer postId);
	void editPost(String msg);
	void changeTopic(String topic);
}
