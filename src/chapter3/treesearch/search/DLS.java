package chapter3.treesearch.search;

import chapter3.treesearch.nodes.Tree;

public class DLS extends AbstractDLS implements ISearch{

	public DLS(int i) {
		this.limit = i;
	}

	@Override
	public void start(Tree t) {
		System.out.println("-- DEPTH_LIMITED_SEARCH START ; DEPTH LIMIT IS " + limit + "--");
		search(t);
		System.out.println("-- SEARCH END --\n");
	}
}