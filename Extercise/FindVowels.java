package Extercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FindVowels {
	
	static int counter =0;
	static Map<String,Integer> map = new HashMap<>();
	ArrayList<String> list = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	
	public static void addWord()
	{
		int count;
		boolean flag =true;
		String s;
		System.out.println("Enter words and type exit to quit");
		
		while(flag == true)
		{
			
			s=sc.nextLine();
			if (s.equalsIgnoreCase("exit"))
			{
				flag = false;
				selectWord(s);
				break;
			}
			else
			{	
				count = 0; 
				count = countVowel(s);
				addMap(count, s);
			}

		}
	}
	
	
	public static void addMap(int count, String s)
	{
		map.put(s,count);
	}
	
	public static int countVowel(String s)
	{
		int count =0;
		for(int i=0;i<s.length();++i)
		{
			if(s.charAt(i)=='A'||s.charAt(i)=='a'||s.charAt(i)=='E'||s.charAt(i)=='e'||s.charAt(i)=='I'||s.charAt(i)=='i'||s.charAt(i)=='O'||s.charAt(i)=='o'||s.charAt(i)=='U'||s.charAt(i)=='u')
					{
						count++;
					}
		}
		return count;
	}
	
	public static void findWord(String s)
	{	
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) 
		{
			String key = it.next();
			if(key.equalsIgnoreCase(s))
					{
						int value = map.get(key);
						System.out.println("Word : "+key+" Vowel Count = "+value);
						
					}
		}
			
	}
	
	public static void selectWord(String S)
	{
		System.out.println("Input the word to search :");
		String sr = sc.nextLine();
		findWord(sr);
		
	}
	

	public static void main(String[] args) {
		addWord();

	}

}
