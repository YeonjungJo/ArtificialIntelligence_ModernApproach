package chapter3.treesearch.controller;

import chapter3.treesearch.nodes.Tree;
import chapter3.treesearch.view.ViewManager;

public class TreeSearch {
	private ViewManager viewManager;
	private Tree tree;

	public TreeSearch() {
		viewManager = new ViewManager();
		tree = new Tree("ROOT");
	}

	public static void main(String[] args) {
		new TreeSearch();
	}
}