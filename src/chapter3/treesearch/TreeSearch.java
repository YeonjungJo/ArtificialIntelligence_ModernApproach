package chapter3.treesearch;

import chapter3.treesearch.nodes.Node;
import chapter3.treesearch.nodes.Tree;
import chapter3.treesearch.search.BFS;
import chapter3.treesearch.search.DFS;
import chapter3.treesearch.search.DLS;
import chapter3.treesearch.search.IDS;

public class TreeSearch {
	private Tree tree;

	public TreeSearch() {
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
		
		new BFS().search(tree);
		new DFS().search(tree);
		new IDS().search(tree);
		new DLS(2).search(tree);
	}

	public static void main(String[] args) {
		new TreeSearch();
	}
}