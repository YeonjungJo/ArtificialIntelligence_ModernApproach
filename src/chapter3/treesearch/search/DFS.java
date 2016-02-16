package chapter3.treesearch.search;

import java.util.LinkedList;

import chapter3.treesearch.nodes.Node;
import chapter3.treesearch.nodes.Tree;

public class DFS implements ISearch {

	private LinkedList<Node> dfs;

	public DFS() {
		dfs = new LinkedList<>();
	}

	@Override
	public void search(Tree t) {
		System.out.println("-- DEPTH_FIRST_SEARCH START --");
		dfs.add(t.getRootNode());
		while (!dfs.isEmpty()) {
			expand();
			printCurrentState();
		}
		System.out.println("-- SEARCH END --\n");
	}

	@Override
	public void expand() {
		Node n = visit();
		if (n.getChildList() == null) return;
		for (int i = n.getChildList().size() - 1; i >= 0; i--) {
			dfs.addFirst(n.getChildList().get(i));
		}
	}

	@Override
	public Node visit() {
		Node n = dfs.getFirst();
		System.out.print("Visit : " + String.format("%5s", n.getId()) + "  |  ");
		dfs.removeFirst();
		return n;
	}

	@Override
	public void printCurrentState() {
		for (int i = 0; i < dfs.size(); i++) {
			System.out.print(dfs.get(i).getId() + " -> ");
		}
		System.out.println("бс");
	}
}
