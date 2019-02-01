import java.util.*;
class LinkedListDemo{
	public static void main(String args[])
	{
	LinkedList<String> ll=new LinkedList<String>();
	System.out.println("initial size of al:"+ll.size());
	ll.add("C");
	ll.add("A");
	ll.add("E");
	ll.add("D");
	ll.add("F");
	ll.add(1,"A2");
	ll.add("z");
	ll.addFirst("A");
	System.out.println("Initial size of addition al:"+ll);
	ll.remove("F");
	ll.remove(2);
	System.out.println("Initial size of deletion al:"+ll);
	ll.removeFirst();
	ll.removeLast();
	System.out.println("after deletion of first and last al:"+ll);
	String val=ll.get(2);
	ll.set(2,"5");
	System.out.println("changed list:"+ll);
	}
}