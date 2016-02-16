package chapter3.treesearch.nodes;

import java.util.LinkedList;

public class Node implements INode{

	private final String id;
	private LinkedList<Node> childList;

	public Node(String id) {
		this.id = id;
	}
	
	@Override
	public String getId() {
		return id;
	}

	@Override
	public void addChildNode(Node childNode) {
		if (childList == null) {
			childList = new LinkedList<>();
		}
		childList.add(childNode);
	}

	@Override
	public LinkedList<Node> getChildList() {
		return childList;
	}
}
