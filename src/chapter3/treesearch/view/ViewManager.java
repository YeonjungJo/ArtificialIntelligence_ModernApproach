package chapter3.treesearch.view;

import javax.swing.JFrame;

public class ViewManager {

	private TreePanel tree;
	
	public ViewManager() {
		tree = new TreePanel();
		
		JFrame frame = new JFrame("Tree Search Test");
		frame.setSize(500, 500);
		frame.add(tree);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
