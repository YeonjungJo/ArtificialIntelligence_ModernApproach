package chapter3.treesearch.controller;

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
		dfs.add(t.getRootNode());
		while (!dfs.isEmpty()) {
			expand();
			printCurrentState();
		}
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
		System.out.println("Visit : " + n.getId());
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
