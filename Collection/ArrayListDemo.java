import java.util.*;
class ArrayListDemo{
	public static void main(String args[])
	{
	ArrayList<String> al=new ArrayList<String>();
	System.out.println("initial size of al:"+al.size());
	al.add("C");
	al.add("A");
	al.add("E");
	al.add("D");
	al.add("F");
	System.out.println("Initial size of addition al:"+al.size());
	System.out.println("Initial size of addition al:"+al);
	al.remove("F");
	al.remove(2);
	System.out.println("Initial size of deletion al:"+al.size());
	System.out.println("Initial size of deletion al:"+al);
	}
}