package forum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="thread_structure")
public class ThreadStructureEntity {
	
	@Id
	@Column(name="postID")
	private Integer postId;
	@Column(name="childPostID")
	private Integer childPostId;
	
	
	
	public ThreadStructureEntity(Integer postId, Integer childPostId) {
		this.postId = postId;
		this.childPostId = childPostId;
	}
	
	
	//GETTERS / SETTERS
	
	
	public Integer getPostId() {
		return postId;
	}
	public void setPostId(Integer postId) {
		this.postId = postId;
	}
	public Integer getParentPostId() {
		return childPostId;
	}
	public void setParentPostId(Integer childPostId) {
		this.childPostId = childPostId;
	}
	

}
