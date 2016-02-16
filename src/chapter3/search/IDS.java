package chapter3.search;

import chapter3.nodes.Tree;

public class IDS extends AbstractDLS implements ISearch {

	@Override
	public void start(Tree t) {
		System.out.println("-- ITERATIVE_DEEPNING_SEARCH START --");
		for (int i = 0; i <= t.getMaximumDepth(); i++) {
			System.out.println("CURRENT DEPTH IS \" " + i + " \"");
			setLimit(i);
			search(t);
		}
		System.out.println("-- SEARCH END --\n");
	}
}