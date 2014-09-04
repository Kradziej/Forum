package forum;

import java.util.Iterator;

public class PostTreeIter<T> implements Iterator<PostTree<T>> {

	enum ProcessStages {
		ProcessParent, ProcessChildCurNode, ProcessChildSubNode
	}

	private PostTree<T> PostTree;

	public PostTreeIter(PostTree<T> PostTree) {
		this.PostTree = PostTree;
		this.doNext = ProcessStages.ProcessParent;
		this.childrenCurNodeIter = PostTree.getChildren().iterator();
	}

	private ProcessStages doNext;
	private PostTree<T> next;
	private Iterator<PostTree<T>> childrenCurNodeIter;
	private Iterator<PostTree<T>> childrenSubNodeIter;

	@Override
	public boolean hasNext() {

		if (this.doNext == ProcessStages.ProcessParent) {
			this.next = this.PostTree;
			this.doNext = ProcessStages.ProcessChildCurNode;
			return true;
		}

		if (this.doNext == ProcessStages.ProcessChildCurNode) {
			if (childrenCurNodeIter.hasNext()) {
				PostTree<T> childDirect = childrenCurNodeIter.next();
				childrenSubNodeIter = childDirect.iterator();
				this.doNext = ProcessStages.ProcessChildSubNode;
				return hasNext();
			}

			else {
				this.doNext = null;
				return false;
			}
		}
		
		if (this.doNext == ProcessStages.ProcessChildSubNode) {
			if (childrenSubNodeIter.hasNext()) {
				this.next = childrenSubNodeIter.next();
				return true;
			}
			else {
				this.next = null;
				this.doNext = ProcessStages.ProcessChildCurNode;
				return hasNext();
			}
		}

		return false;
	}

	@Override
	public PostTree<T> next() {
		return this.next;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}