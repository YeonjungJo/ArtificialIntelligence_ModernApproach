package chapter3.treesearch.search;

import java.util.LinkedList;

import chapter3.treesearch.nodes.Node;
import chapter3.treesearch.nodes.Tree;

public class BFS implements ISearch {

	private LinkedList<Node> bfs;

	public BFS() {
		bfs = new LinkedList<>();
	}

	@Override
	public void search(Tree t) {
		bfs.add(t.getRootNode());
		while (!bfs.isEmpty()) {
			expand();
			printCurrentState();
		}
	}

	@Override
	public void expand() {
		Node n = visit();
		if (n.getChildList() == null) return;
		bfs.addAll(n.getChildList());
	}

	@Override
	public Node visit() {
		Node n = bfs.getFirst();
		System.out.println("Visit : " + n.getId());
		bfs.removeFirst();
		return n;
	}

	@Override
	public void printCurrentState() {
		for (int i = 0; i < bfs.size(); i++) {
			System.out.print(bfs.get(i).getId() + " -> ");
		}
		System.out.println("бс");
	}
}