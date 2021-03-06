package chapter3;

import chapter3.nodes.Node;
import chapter3.nodes.Tree;
import chapter3.search.*;

public class UniformedSearch {
	private Tree tree;

	public UniformedSearch() {
		tree = new Tree("ROOT");
		tree.addChildNode(tree.getRootNode(), new Node("2"));
		tree.addChildNode(tree.getRootNode(), new Node("3"));
		tree.addChildNode(tree.getNode("2"), new Node("4"));
		tree.addChildNode(tree.getNode("2"), new Node("5"));
		tree.addChildNode(tree.getNode("2"), new Node("6"));
		tree.addChildNode(tree.getNode("3"), new Node("7"));
		tree.addChildNode(tree.getNode("3"), new Node("8"));
		tree.addChildNode(tree.getNode("3"), new Node("9"));
		tree.addChildNode(tree.getNode("4"), new Node("10"));
		tree.addChildNode(tree.getNode("4"), new Node("11"));
		tree.addChildNode(tree.getNode("4"), new Node("12"));
		
		new BFS();
		new BFS().start(tree);
//		new DFS().start(tree);
//		new DLS(2).start(tree); // depth limit가 존재하는 depth-first search
//		new IDS().start(tree);  // depth limit가 증가하는 depth-limited search
	}

	public static void main(String[] args) {
		new UniformedSearch();
	}
}