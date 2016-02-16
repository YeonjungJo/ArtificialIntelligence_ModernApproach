package chapter3.treesearch.nodes;

public interface ITree {

	public Node getRootNode();

	public void addChildNode(Node parentNode , Node childNode);

	public Node getNode(String id);
	
	public int getMaximumDepth();
}
