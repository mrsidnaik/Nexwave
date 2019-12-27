package strings;

public class StringManip2 {

	public static void main(String[] args) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html>");
		buffer.append("<head><title>My Web Page</title></head>");
		buffer.append("<body>");
		buffer.append("<h1>Thsi is my web profile<>/h1");
		buffer.append("</body></html>");
		
		System.out.println(buffer.toString());
		
		String s ="Namanx";
		System.out.println(checkPalin(s));
		
		System.out.println(checkAll("Hellodhjklsx"));

	}
	
	public static boolean checkPalin(String s)
	{
		StringBuffer str = new StringBuffer(s);
		return(str.equals(str.reverse()));
				
	}
	
	public static int checkAll(String str)
	{
		int len = str.length();
		String s= str.toLowerCase();
		int ctr=0;
		char[] ch= new char[26];
		for(char i='a';i<='z';++i)
		{
			for(int j=0;j<len;++j)
			{
				if(s.contains(i+""))
				{
					ctr++;
				}
			}
		}
		return ctr;
	}

}
