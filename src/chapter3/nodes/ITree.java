package chapter3.nodes;

public interface ITree {

	public Node getRootNode();

	public Node getNode(String id);
	
	public int getMaximumDepth();

	void addChildNode(Node parentNode, Node childNode);
}
