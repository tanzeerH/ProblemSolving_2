import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.Set;


public class FirstNonDuplicateInSinglePass {

	static String input="abaaccdcb";
	public static void main(String[] args) {
		
		int len=input.length();
		Set<Character> orderset= new LinkedHashSet<Character>();
		HashSet<Character> mSet=new HashSet<>();
		for(int i = 0;i<len;i++)
		{
			if(mSet.contains(input.charAt(i)))
			{
				orderset.remove(input.charAt(i));
			}
			else{
				orderset.add(input.charAt(i));
				mSet.add(input.charAt(i));
			}
		}
		for(Character c: orderset)
		{
			System.out.println(c);
			break;
		}
	}
}
