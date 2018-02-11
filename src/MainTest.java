import java.util.MissingFormatArgumentException;

public class MainTest {

	
	public static void main(String[] args) {
		//Node root= new Node(7);
		DeppestNode binaryTree=new DeppestNode();
		binaryTree.insert(2);
		binaryTree.insert(7);
		binaryTree.insert(5);
		binaryTree.insert(3);
		binaryTree.insert(0);
		binaryTree.insert(8);
		binaryTree.insert(1);
		binaryTree.insert(-1);
		binaryTree.insert(-2);
		binaryTree.insert(-3);

	
		//System.out.println(root.value);
		binaryTree.print();
	System.out.println(binaryTree.depth_me);
	System.out.println(binaryTree.elem);
	}
}
