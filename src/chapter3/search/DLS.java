package chapter3.search;

import java.util.LinkedList;

import chapter3.nodes.Node;
import chapter3.nodes.Tree;

public class DLS implements ISearch{

	protected LinkedList<Node> dls;
	protected int limit;
	
	public DLS() {
		this.limit = 0;
		dls = new LinkedList<>();
	}

	public DLS(int i) {
		this.limit = i;
		dls = new LinkedList<>();
	}

	@Override
	public void start(Tree t) {
		System.out.println("-- DEPTH_LIMITED_SEARCH START ; DEPTH LIMIT IS " + limit + "--");
		search(t);
		System.out.println("-- SEARCH END --\n");
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