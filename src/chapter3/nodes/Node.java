package chapter3.nodes;

import java.util.LinkedList;

public class Node implements INode {

	private final String id;
	private int cost = 1;
	private int depth = -1;
	private LinkedList<Node> childList;

	public Node(String id) {
		this.id = id;
	}

	public Node(String id, int depth) {
		this.id = id;
		this.depth = depth;
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

	@Override
	public int getDepth() {
		return depth;
	}

	@Override
	public void setDepth(int depth) {
		this.depth = depth;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}
}
