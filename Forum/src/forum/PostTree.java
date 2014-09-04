package forum;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PostTree<T> implements Iterable<PostTree<T>> {

	private T data;
	private PostTree<T> parent;
	private List<PostTree<T>> children;
	private List<PostTree<T>> elementsIndex;

	public boolean isRoot() {
		return parent == null;
	}

	public boolean isLeaf() {
		return children.size() == 0;
	}
	

	public PostTree(T data) {
		this.data = data;
		this.children = new LinkedList<PostTree<T>>();
		this.elementsIndex = new LinkedList<PostTree<T>>();
		this.elementsIndex.add(this);
	}

	public PostTree<T> addChild(T child) {
		PostTree<T> childNode = new PostTree<T>(child);
		childNode.parent = this;
		this.children.add(childNode);
		this.registerChildForSearch(childNode);
		return childNode;
	}

	public int getLevel() {
		if (this.isRoot())
			return 0;
		else
			return parent.getLevel() + 1;
	}

	private void registerChildForSearch(PostTree<T> node) {
		elementsIndex.add(node);
		if (parent != null)
			parent.registerChildForSearch(node);
	}

	public PostTree<T> findPostTree(Comparable<T> cmp) {
		for (PostTree<T> element : this.elementsIndex) {
			T elData = element.data;
			if (cmp.compareTo(elData) == 0)
				return element;
		}

		return null;
	}

	@Override
	public String toString() {
		return data != null ? data.toString() : "[data null]";
	}

	@Override
	public Iterator<PostTree<T>> iterator() {
		PostTreeIter<T> iter = new PostTreeIter<T>(this);
		return iter;
	}

	public T getData() {
		return data;
	}

	public PostTree<T> getParent() {
		return parent;
	}

	public List<PostTree<T>> getChildren() {
		return children;
	}

}