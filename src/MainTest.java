import java.util.MissingFormatArgumentException;

import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class MainTest {

	
	public static void main(String[] args) {
		//Node root= new Node(7);
		DeppestNode binaryTree=new DeppestNode();
		binaryTree.insert(2);
		binaryTree.insert(7);
		binaryTree.insert(5);
		binaryTree.insert(4);
		binaryTree.insert(0);
		binaryTree.insert(8);
		binaryTree.insert(1);
		binaryTree.insert(-1);
		binaryTree.insert(-2);
		binaryTree.insert(-3);
		binaryTree.insert(9);
		binaryTree.insert(10);

	
		//System.out.println(root.value);
		binaryTree.print();
	System.out.println(binaryTree.depth_me);
	System.out.println(binaryTree.elem);
	
	PrintLevelOrder pl=new PrintLevelOrder();
	System.out.println("level order......");
	pl.printLevelOrder(binaryTree.root);
	System.out.println("printing minimum level sum");
	pl.printMiniMumHeightLeafSum(binaryTree.root);
	}
}
