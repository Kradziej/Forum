package forum;

import javax.ejb.Local;

public interface ManagePostsDAO {
	
	void createPost(PostEntity post, Integer threadId);
	void test(ThreadEntity th);
	void test2();
	void deletePost(Integer postId);
	void editPost(String msg);
}
