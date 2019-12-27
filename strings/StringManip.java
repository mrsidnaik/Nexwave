package strings;

public class StringManip {

	public static void main(String[] args) {
		String str = "this is a line of text";
		String st="text";
		int len=st.length()-1;
		char[] ch= str.toCharArray();
		for(int i=0; i<str.length();++i)
		{
			if(ch[i]=='t')
			{
				if(str.substring(i, i+len).equals(st))
				{
					System.out.println("Start Length : "+ i + "End length "+(i+len));
				}
			}
		}
	}

}
