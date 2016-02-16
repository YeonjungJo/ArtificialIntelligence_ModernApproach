package chapter3.search;

import java.util.LinkedList;

import chapter3.nodes.Node;
import chapter3.nodes.Tree;

public abstract class AbstractDLS {

	protected LinkedList<Node> dls;
	protected int limit;

	public AbstractDLS() {
		dls = new LinkedList<>();
		limit = 0;
	}
	
	public void setLimit(int limit) {
		this.limit = limit;
	}

	public void search(Tree t){
		dls.add(t.getRootNode());
		while (!dls.isEmpty()) {
			expand();
			printCurrentState();
		}
	}

	public void expand() {
		Node n = visit();
		if (n.getChildList() == null || n.getDepth() == limit) return;
		for (int i = n.getChildList().size() - 1; i >= 0; i--) {
			dls.addFirst(n.getChildList().get(i));
		}
	}

	public Node visit() {
		Node n = dls.getFirst();
		System.out.print("Visit : " + String.format("%5s", n.getId()) + "  |  ");
		dls.removeFirst();
		return n;
	}

	public void printCurrentState() {
		for (int i = 0; i < dls.size(); i++) {
			System.out.print(dls.get(i).getId() + " -> ");
		}
		System.out.println("бс");
	}
}