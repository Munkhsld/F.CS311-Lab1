package lab1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class QueueExample {

	Queue<Integer> q = new LinkedList<>();

	public QueueExample(List<Integer> values) {
		for (int value: values) {
			q.add(value);
		}
	}
	
	public int tolgoi() throws Exception {
		return q.element();
	}
	
	public Boolean hoosonEseh() {
		return q.isEmpty();
	}
	
	public int hemjee() {
		return q.size();
	}
	
	public int suul() throws Exception {
		
		if (hoosonEseh()) {
			throw new IndexOutOfBoundsException();
		}
		
		Iterator<Integer> itr = q.iterator();
		int last = 0;
		
        while (itr.hasNext())
        {
            // next() returns the next element in the iteration
            last = itr.next();
        }
        
        return last;
        
	}
	
	public static void main(String[] args) {
		
		System.out.println("------------------------------------------------------------");
		System.out.println("Queue v1.0");
		System.out.print("Insert numbers with single space: ");
		Scanner in = new Scanner(System.in);
		String numbers = in.nextLine();
		
		String[] strArray = numbers.split(" ");
		
		List<Integer> intArray = new ArrayList<Integer>();

		for (int i=0;i<strArray.length;i++) {
			if (!strArray[i].isEmpty()) {
				intArray.add(Integer.valueOf(strArray[i].trim()));
			}
		}
		
		QueueExample q = new QueueExample(intArray);
		
		try {
			System.out.println(" The head of queue is: " + q.tolgoi());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(" The queue is empty.");
		}
		
		System.out.println(" The queue is empty: " + q.hoosonEseh());
		
		System.out.println(" The size of queue is: " + q.hemjee());
		
		try {
			System.out.println(" The tail of queue is: " + q.suul());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(" The queue is empty.");
		}
		
	}
	
}
