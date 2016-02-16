package chapter3.treesearch.controller;

import java.util.LinkedList;

import chapter3.treesearch.nodes.Node;
import chapter3.treesearch.nodes.Tree;

public class BreadthFirstSearch implements ISearch {

	private LinkedList<Node> bfs;

	public BreadthFirstSearch() {
		bfs = new LinkedList<>();
	}

	@Override
	public void search(Tree t) {
		bfs.add(t.getRootNode());
		while (!bfs.isEmpty()) {
			expand();
		}
	}

	@Override
	public void expand() {
		Node n = bfs.getFirst();
		System.out.println(n.getId());
		bfs.removeFirst();
		if(n.getChildList() == null) return;
		bfs.addAll(n.getChildList());
	}
}