package java_practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.WebElement;

public class ListandSet {

	public static void main(String[] args) {
		List<Integer> mylist = new ArrayList<Integer>();
		mylist.add(2);
		List<WebElement> element = new ArrayList<WebElement>();
		
		List<String> list = new ArrayList<String>(); 
		
		/*list allows duplicates 
		list maintains the order in which the data is saved
		*/
		list.add("apple");
		list.add("Mango");
		list.add("apple");
		list.add("pine");
		list.add("grape");
		int size = list.size();
		//before removing 
		for (String each_fruit : list) {
			System.out.println(each_fruit);			
		}
		System.out.println("Size "+ size);
		list.remove("apple");
		
		boolean remove = list.remove("apple");  //returns boolean 
		System.out.println("Is_removed "+remove);
		
		//contains in list 
		boolean contains = list.contains("pine");
		System.out.println("Has fruit "+ contains);
		
		//index
		String FirstValue = list.get(0);
		System.out.println("The first value is "+ FirstValue);
		
		
		//is empty 
		//boolean empty = list.isEmpty();
		
		//clear
		list.clear();
		System.out.println(list.isEmpty());
		
		
		
		int size_after = list.size();
		System.out.println("Size "+size_after );
		System.out.println(list);
		
		
		
		
		Set<String> setfruits = new HashSet<String>();
		
		setfruits.add("apple");
		setfruits.add("Mango");
		setfruits.add("apple");
		setfruits.add("pine");
		setfruits.add("grape");
		
		System.out.println(setfruits);
		
		/*the Set interface (part of java.util) represents a collection of unique elements (no duplicates). It has several implementations, 
		 * set has 3 most implemet class , tree set, hast set , linked hash set. 
		 * Set doesnot allow duplicates. 
		 * Set does not maintain order based on the implemeting class.
		 * 
    Description: Unordered, unsorted, and does not guarantee insertion order. It uses a hash table for storage, offering constant-time complexity for basic operations (add, remove, contains). Allows one null value.
    Use Case: When order doesn't matter and you need fast operations.

		 * 
		 */
		
		
	/*hash set definition:

	    Description: Unordered, unsorted, and does not guarantee insertion order. It uses a hash table for storage, offering constant-time complexity for basic operations (add, remove, contains). Allows one null value.
	    Use Case: When order doesn't matter and you need fast operations.
	    */

		Set<String> setfruits1 = new HashSet<String>();
		
		setfruits1.add("apple");
		setfruits1.add("Mango");
		setfruits1.add("apple");
		setfruits1.add("pine");
		setfruits1.add("grape");
		
		System.out.println("HastSet : "+ setfruits1);
		
		
		// Linked HashSet
		/*
		 * 
    Description: Maintains insertion order (doubly-linked list + hash table). Like HashSet, it offers constant-time complexity. 
    Allows one null value.
    Use Case: When you need to preserve insertion order but still want constant-time performance.

		 */
		
		Set<String> setfruits2 = new LinkedHashSet<String>();
		
		setfruits2.add("apple");
		setfruits2.add("Mango");
		setfruits2.add("apple");
		setfruits2.add("pine");
		setfruits2.add("grape");
		
		System.out.println("LinkedHashSet "+ setfruits2);
		
		// TreeSet 
		/*
		Description: Sorted set (tree-based). Elements are ordered based on their natural ordering (e.g., ascending numbers, lexicographic strings) or a custom Comparator. Does not allow null (throws NullPointerException).
    Use Case: When you need sorted elements or custom ordering.

		 */
		Set<String> setfruits3 = new TreeSet<String>();
		
		setfruits3.add("apple");
		setfruits3.add("Mango");
		setfruits3.add("apple");
		setfruits3.add("pine");
		setfruits3.add("grape");
		
		System.out.println("TreeSet "+ setfruits3);
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		

	}

}
