package forum;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


@Stateless
@Local(ManageThreadsDAO.class)
public class ManageThreadsImpl implements ManageThreadsDAO {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public void createThread(PostEntity post) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteThread(Integer threadId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<ThreadEntity> getThreadsByOrder(int bottomOrder, int topOrder) {
		
		TypedQuery<ThreadEntity> query = em.createNamedQuery("ThreadEntity.threadsByOrder", ThreadEntity.class);
		query.setParameter("bottom", bottomOrder).setParameter("top", topOrder);
		return query.getResultList();
		
	}

	@Override
	public Integer[] getThreadTopTree(int threadId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void changeTopic(String topic) {
		// TODO Auto-generated method stub
		
	}

}
