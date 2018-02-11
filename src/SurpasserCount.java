
public class SurpasserCount {

	Node root=null;
	public void insert(int value)
	{
		if( root == null)
		{
			root = new Node(value);
			return;
		}
		
		insertInBinaryTree(root, value);
		
	}
	private void insertInBinaryTree(Node root,int value)
	{
		
		if(value<root.value)
		{
			if(root.leftChild== null)
				root.leftChild=new Node(value);
			else 
			{
				
				insertInBinaryTree(root.leftChild, value);
			}
		}
		else
		{
			root.element_below++;
			if(root.rightChild ==  null)
			   root.rightChild=new Node(value);
			else
			{
				
				insertInBinaryTree(root.rightChild, value);
			}
		}
		
	}
	public void print()
	{
		printInorder(root);
	}
	private void printInorder(Node root)
	{
		if(root != null)
		{
			if(root.leftChild != null)
			{
				printInorder(root.leftChild);
				
			}
			
			System.out.println("("+root.value+" "+ root.element_below+")");
			
			
			// System.out.println("node print val: "+" "+ root.hashCode());
			if(root.rightChild != null)
			{
				printInorder(root.rightChild);
				
			}
			
			
			
			//printInorder(root.rightChild);
		}
	}
}
