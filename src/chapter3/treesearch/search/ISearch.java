package chapter3.treesearch.search;

import chapter3.treesearch.nodes.Node;
import chapter3.treesearch.nodes.Tree;

public interface ISearch {

	public void search(Tree t);

	public void expand();

	public Node visit();

	public void printCurrentState();
}
