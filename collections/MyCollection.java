package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

@SuppressWarnings("unused")
public class MyCollection {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("Sid");
		v.add("Sam");
		v.add("Pc");
		
		int x = v.size();
		
		for(int i=0; i<x;++i)
		{
			System.out.println(v.get(i));
		}
		
		for (String s:v)
		{
			System.out.println(s);
		}
		
		Enumeration E = v.elements();
		while(E.hasMoreElements())
		{
			System.out.println(E.nextElement());
		}
		
		Iterator<String> it = v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(51);
		list.add(23);
		list.add(43);
		
		int sum =0;
			
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext())
		{
			sum=sum+iter.next();
		}
		System.out.println(sum);
		
		//Integer[] i= (Integer[])list.toArray();
		
		Collections.sort(list);
		System.out.println(list);
		
		List<Student> students = new ArrayList<>();
		students.add(new Student("Sid",13));
		students.add(new Student("Sam",16));
		students.add(new Student("Sach",4));
		students.add(new Student("Atkr",18));
		students.add(new Student("Srt",11));
		
		Iterator<Student> std = students.iterator();
		while(std.hasNext()) {
			Student st = std.next();
			System.out.println(st.getName());
		}
		
		Collections.sort(students, new Comparator<Student>() {
				@Override
				public int compare(Student e1, Student e2) {
					return e1.getRoll()-e2.getRoll();
					}
				});
		
		Collections.sort(students,new StudentNameSorter());
		
		
		Iterator<Student> stdChk = students.iterator();
		while(stdChk.hasNext()) {
			Student stChk = stdChk.next();
			if(stChk.getName().charAt(0)=='A')
			System.out.println(stChk.getName());
		}
		
	}
	
	

}
