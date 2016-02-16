package chapter3.treesearch.search;

import chapter3.treesearch.nodes.Tree;

public class DFS extends AbstractDLS implements ISearch{

	public DFS() {
		setLimit(Integer.MAX_VALUE);
	}

	@Override
	public void start(Tree t) {
		System.out.println("-- DEPTH_FIRST_SEARCH START --");
		search(t);
		System.out.println("-- SEARCH END --\n");
	}
}