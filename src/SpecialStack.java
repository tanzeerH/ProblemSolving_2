import java.util.Stack;

// program for special stack. returnMin returns min of a stack in o(1) time and o(n) memory.
public class SpecialStack {

	class Elem
	{
		int number;
		Elem prev_elem=null;
		Elem prev_min=null;
		public Elem(int n) {
			number=n;
		}
	}
	public static Elem head=null;
	public static Elem cur_min=null;
	public void insert(int n)
	{
		if(head == null)
		{
			head=new Elem(n);
			cur_min=head;
			return;
		}
		Elem elem=new Elem(n);
		if(elem.number<=cur_min.number)
		{
			
			cur_min=elem;
		}
		elem.prev_min=cur_min;
		elem.prev_elem=head;
		head=elem;
	}
	public int pop()
	{
		if(head == null)
		{
			System.out.println("Empty");
			return Integer.MIN_VALUE;
			//throw new Exception();
		}
		int num=head.number;
		
		cur_min=head.prev_min;
		head = head.prev_elem;
		return num;
	}
	public int returnMin()
	{
		if(cur_min != null)
			return cur_min.number;
		else return Integer.MIN_VALUE;
	}
	public static void main(String[] args) {
		
		SpecialStack specialStack=new SpecialStack();
		specialStack.insert(3);
		specialStack.insert(5);
		specialStack.insert(7);
		System.out.println("min: "+specialStack.returnMin());
		specialStack.insert(2);
		specialStack.insert(1);
		
		System.out.println("min: "+specialStack.returnMin());
		System.out.println(specialStack.pop());
		System.out.println(specialStack.pop());
		System.out.println(specialStack.pop());
		System.out.println(specialStack.pop());

	}
}
