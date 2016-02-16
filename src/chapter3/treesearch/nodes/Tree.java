package chapter3.treesearch.nodes;

public class Tree implements ITree{

	private Node root;

	public Tree(String rootId) {
		root = new Node(rootId);
	}

	@Override
	public Node getRootNode() {
		return root;
	}

	@Override
	public void addChildNode(Node parentNode, Node childNode) {
		parentNode.addChildNode(childNode);
	}
}
