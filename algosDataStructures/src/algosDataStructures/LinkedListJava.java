
import java.util.*;
import java.lang.*;
import java.io.*;

class SingleLinkedList
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		LinkedList<Integer> IDs = new LinkedList<Integer>();
		IDs.add(1);
		IDs.add(2);
		IDs.add(3);
		IDs.add(4);
		
		for(Integer ids: IDs){
			System.out.println(ids);
		}
		System.out.println(IDs.peekLast());
		
/*		IDs.remove();
		
		for(Integer ids: IDs){
			System.out.println(ids);
		}
*/		
	}
}
