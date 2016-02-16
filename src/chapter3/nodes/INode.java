package chapter3.nodes;

import java.util.LinkedList;

public interface INode {

	public String getId();

	public void addChildNode(Node node);

	public LinkedList<Node> getChildList();

	public void setDepth(int depth);

	public int getDepth();

	public void setCost(int cost);

	public int getCost();

}
