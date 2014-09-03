package forum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="threads_structure")
public class ThreadsStructureEntity {
	
	@Id
	@GeneratedValue
	@Column(name="postID")
	private Integer postId;
	@Column(name="parentPostID")
	private Integer parentPostId;
	
	
	
	public ThreadsStructureEntity(Integer postId, Integer parentPostId) {
		this.postId = postId;
		this.parentPostId = parentPostId;
	}
	
	
	//GETTERS / SETTERS
	
	
	public Integer getPostId() {
		return postId;
	}
	public void setPostId(Integer postId) {
		this.postId = postId;
	}
	public Integer getParentPostId() {
		return parentPostId;
	}
	public void setParentPostId(Integer parentPostId) {
		this.parentPostId = parentPostId;
	}
	

}
