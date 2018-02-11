import javax.crypto.CipherInputStream;

public class RecursiveDuplicateRemover {

	private static String input="ABCCBCBA";
	public static void main(String[] args) {
		
		System.out.println(removeDulplicate(input));
	}
	private static String removeDulplicate(String input)
	{
		if(input.length()==0)
			return "-1";
		StringBuilder stringBuild=new StringBuilder();
		boolean isRemovedAny=false;
		for(int i= 0 ;i <input.length()-1;i++){
			if(input.charAt(i)== input.charAt(i+1))
			{
				isRemovedAny=true;
				i++;
			}
			else{
				stringBuild.append(input.charAt(i));
			}
				
		}
		int len=input.length();
		if(input.length()>1)
			if(input.charAt(len-1)!= input.charAt(len-2))
				stringBuild.append(input.charAt(len-1));
		System.out.println(stringBuild.toString());
		if(isRemovedAny)
			return removeDulplicate(stringBuild.toString());
		else
			return input;
		
	}
}

