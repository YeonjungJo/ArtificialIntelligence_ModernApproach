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
		System.out.println("-- BREADTH_FIRST_SEARCH START --");
		bfs.add(t.getRootNode());
		while (!bfs.isEmpty()) {
			expand();
			printCurrentState();
		}
		
		System.out.println("-- SEARCH END --\n");
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
		System.out.print("Visit : " + String.format("%5s", n.getId()) + "  |  ");
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