
public class DeppestNode {

	Node root=null;
	int depth_me=0;
	int elem=0;
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
		printInorder(root,0);
	}
	private void printInorder(Node root, int depth)
	{
		if(root != null)
		{
			if(depth>depth_me)
			{
				elem=root.value;
				depth_me=depth;
				
			}
			if(root.leftChild != null)
			{
				printInorder(root.leftChild,depth+1);
				
			}
			
			System.out.println("("+root.value+" "+ root.element_below+")");
			
			
			// System.out.println("node print val: "+" "+ root.hashCode());
			if(root.rightChild != null)
			{
				printInorder(root.rightChild,depth+1);
				
			}
			
			
			
			//printInorder(root.rightChild);
		}
	}
}
