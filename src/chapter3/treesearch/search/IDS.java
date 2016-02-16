package chapter3.treesearch.search;

import java.util.LinkedList;

import chapter3.treesearch.nodes.Node;
import chapter3.treesearch.nodes.Tree;

public class IDS implements ISearch {

	private LinkedList<Node> ids;
	private int currentLimit;

	public IDS() {
		ids = new LinkedList<>();
		currentLimit = 0;
	}

	@Override
	public void search(Tree t) {
		System.out.println("-- ITERATIVE_DEEPNING_SEARCH START --");
		while (currentLimit <= t.getMaximumDepth()) {
			System.out.println("CURRENT DEPTH IS \" " + currentLimit + " \"");

			ids.add(t.getRootNode());
			while (!ids.isEmpty()) {
				expand();
				printCurrentState();
			}

			currentLimit++;
		}
		System.out.println("-- SEARCH END --\n");
	}

	@Override
	public void expand() {
		Node n = visit();
		if (n.getChildList() == null || n.getDepth() >= currentLimit) return;
		for (int i = n.getChildList().size() - 1; i >= 0; i--) {
			ids.addFirst(n.getChildList().get(i));
		}
	}

	@Override
	public Node visit() {
		Node n = ids.getFirst();
		System.out.print("Visit : " + String.format("%5s", n.getId()) + "  |  ");
		ids.removeFirst();
		return n;
	}

	@Override
	public void printCurrentState() {
		for (int i = 0; i < ids.size(); i++) {
			System.out.print(ids.get(i).getId() + " -> ");
		}
		System.out.println("бс");
	}
}