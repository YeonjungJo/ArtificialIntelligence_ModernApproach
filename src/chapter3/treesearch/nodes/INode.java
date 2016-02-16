package chapter3.treesearch.nodes;

import java.util.LinkedList;

public interface INode {

	public String getId();

	public void addChildNode(Node node);

	public LinkedList<Node> getChildList();

}
