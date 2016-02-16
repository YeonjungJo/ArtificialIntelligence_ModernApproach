package chapter3.treesearch.nodes;

public interface ITree {

	public Node getRootNode();

	public Node getNode(String id);
	
	public int getMaximumDepth();

	void addChildNode(Node parentNode, Node childNode);
}
