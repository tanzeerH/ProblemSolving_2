import java.util.Stack;

public class PatternExpansion {

	static String pattern="a2[bc2[c]]d";
	public static void main(String[] args) {
		
		Stack<Character> stack=new Stack<>();
		StringBuffer stringBuffer=new StringBuffer();
				
		int len=pattern.length();
	
		for(int i= 0;i<len;i++)
		{
			Character c=pattern.charAt(i);
			String str="";
			if(c == ']')
			{
				
				while(stack.peek()!= '[')
				{
					str+=stack.pop();
				}
				stack.pop();
				Character repeat=stack.peek();
				if(repeat>47 && repeat<57)
				{
					stack.pop();
				  int r=repeat-48;
				 
				  for(int j = 0 ;j<r-1;j++)
				  {
					  str+=str;
				  }
				  System.out.println(str);
				  for(int j= 0 ;j<str.length();j++)
				  {
					  stack.push(str.charAt(j));
				  }
					
				}
			}
			else
				stack.push(c);
		}
		//System.out.println(str);
	}
}
