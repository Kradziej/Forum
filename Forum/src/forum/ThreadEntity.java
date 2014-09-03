package forum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="threads")
public class ThreadEntity {
	
	@Id
	@Column(name="threadID")
	private Integer threadId;
	@Column(name="topic", length = 100)
	private String topic;
	@Column(name="threadsOrder")
	private Integer order;
	
	
	// for bumping
	ThreadEntity(Integer threadId, String topic) {
		
		this.threadId = threadId;
		this.topic = topic;
		this.order = 0;
	}

	ThreadEntity(Integer threadId, String topic, Integer order) {
		
		this.threadId = threadId;
		this.topic = topic;
		this.order = order;
	}

	
	// GETTERS SETTERS
	

	public Integer getThreadId() {
		return threadId;
	}


	public void setThreadId(Integer threadId) {
		this.threadId = threadId;
	}


	public String getTopic() {
		return topic;
	}


	public void setTopic(String topic) {
		this.topic = topic;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

}
