package queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<Integer> items=new PriorityQueue<>();
		
		
		items.add(10);
		items.add(70);
		items.add(20);
		items.add(35);
		items.add(60);
		
		
		while(!items.isEmpty()) {
			int item=items.poll();
			System.out.println(item);
		}

	}

}
