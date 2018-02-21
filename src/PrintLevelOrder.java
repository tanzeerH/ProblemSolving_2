import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.text.AbstractDocument.LeafElement;

public class PrintLevelOrder {

	public void printLevelOrder(Node root)
	{
		Queue<Node> queue=new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			Node node=queue.poll();
			System.out.println(node.value);
			if(node.leftChild!=null)
				queue.add(node.leftChild);
			if(node.rightChild!=null)
				queue.add(node.rightChild);
		}
	}
	public void printMiniMumHeightLeafSum(Node root)
	{
		HashMap<Integer,Integer> objectMap=new HashMap<>();
		

	Queue<Node> queue=new LinkedList<>();
	queue.add(root);
	int height=0;
	objectMap.put(root.hashCode(), height);
	int min_leaf_height=-1;
	int sum=0;
	while(!queue.isEmpty())
	{
		Node node=queue.poll();
		int curHeght=objectMap.get(node.hashCode());
		//System.out.println(node.value);
		if(node.leftChild!=null)
		{
			queue.add(node.leftChild);
			objectMap.put(node.leftChild.hashCode(),curHeght++);
		}
		if(node.rightChild!=null)
		{
			queue.add(node.rightChild);
			objectMap.put(node.rightChild.hashCode(),curHeght++);
		}
		if(node.leftChild==null && node.rightChild == null && min_leaf_height==-1)
		{
			min_leaf_height=objectMap.get(node.hashCode());
		}
		if(min_leaf_height !=-1 && curHeght>min_leaf_height)
			break;
		if(curHeght==min_leaf_height && node.leftChild==null && node.rightChild == null)
			sum+=node.value;
	}
	System.out.println("sum: "+sum+" height: "+min_leaf_height);
}
	
}
