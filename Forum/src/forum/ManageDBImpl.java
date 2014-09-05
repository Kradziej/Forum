package forum;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
@Local(ManageDAO.class)
public class ManageDBImpl implements ManageDAO {

	
	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public void createPost(PostEntity post, Integer parentPostId) {
		
		em.persist(post);
		em.flush();
		ThreadStructureEntity struct = new ThreadStructureEntity();
		struct.setChildPostId(post.getPostId());
		struct.setPostId(parentPostId);
		em.persist(struct);
		
	}

	@Override
	public void createThread(PostEntity post) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePost(Integer postId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteThread(Integer threadId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ThreadEntity> getThreadsByOrder(int bottomOrder, int topOrder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer[] getThreadTopTree(int threadId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editPost(String msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeTopic(String topic) {
		// TODO Auto-generated method stub
		
	}

	
	
}
