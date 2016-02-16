package chapter3.treesearch.search;

import java.util.LinkedList;

import chapter3.treesearch.nodes.Node;
import chapter3.treesearch.nodes.Tree;

public class DLS implements ISearch {

	private LinkedList<Node> dls;
	private int depthLimit;

	public DLS(int limit) {
		dls = new LinkedList<>();
		this.depthLimit = limit;
	}
	
	public void setDepthLimit(int i){
		this.depthLimit = i;
	}

	@Override
	public void search(Tree t) {
		System.out.println("-- DEPTH_LIMITED_SEARCH START ; DEPTH LIMIT IS " + depthLimit + "--");
		dls.add(t.getRootNode());
		while (!dls.isEmpty()) {
			expand();
			printCurrentState();
		}
		System.out.println("-- SEARCH END --\n");
	}

	@Override
	public void expand() {
		Node n = visit();
		if (n.getChildList() == null || n.getDepth() >= depthLimit) return;
		for (int i = n.getChildList().size() - 1; i >= 0; i--) {
			dls.addFirst(n.getChildList().get(i));
		}
	}

	@Override
	public Node visit() {
		Node n = dls.getFirst();
		System.out.print("Visit : " + String.format("%5s", n.getId()) + "  |  ");
		dls.removeFirst();
		return n;
	}

	@Override
	public void printCurrentState() {
		for (int i = 0; i < dls.size(); i++) {
			System.out.print(dls.get(i).getId() + " -> ");
		}
		System.out.println("бс");
	}
}