package chapter3.treesearch.nodes;

import java.util.LinkedList;

import chapter3.treesearch.util.WarningMessage;

public class Tree implements ITree {

	private Node root;
	private int maximumDepth = 0;

	public Tree(String rootId) {
		root = new Node(rootId, 0);
	}

	@Override
	public Node getRootNode() {
		return root;
	}

	@Override
	public void addChildNode(Node parentNode, Node childNode) {
		if (parentNode == null) {
			WarningMessage.warning(WarningMessage.DO_NOT_EXIST_PARENT_NODE, childNode.getId());
			parentNode = root;
		}
		
		if (getNode(childNode.getId()) != null){
			WarningMessage.warning(WarningMessage.ALREADY_EXIST_NODE, childNode.getId());
			return;
		}

		if (childNode.getDepth() < 0) {
			int childDepth = parentNode.getDepth() + 1;
			childNode.setDepth(childDepth);
			maximumDepth = childDepth > maximumDepth ? childDepth : maximumDepth;
		}

		parentNode.addChildNode(childNode);
	}

	@Override
	public Node getNode(String id) {
		LinkedList<Node> nodeList = new LinkedList<Node>();
		nodeList.add(root);

		while (!nodeList.isEmpty()) {
			Node n = nodeList.getFirst();
			if (n.getId().equals(id)) return n;
			nodeList.removeFirst();
			if (n.getChildList() != null) nodeList.addAll(n.getChildList());
		}
		return null;
	}

	@Override
	public int getMaximumDepth() {
		return maximumDepth;
	}
}