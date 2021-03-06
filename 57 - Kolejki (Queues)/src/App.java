import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {
	public static void main(String[] args) {
		// (head)<-- ooooooooooooooooooooo<-- (tail) FIFO

		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
		// NoSuchElementException - brak element�w w kolejce
		// System.out.println("Head of queue is: " + q1.element());
		try {
			q1.add(10);
			q1.add(20);
			q1.add(30);
			q1.add(40);
		} catch (IllegalStateException e) {
			System.out.println("Pr�ba dodania zbyt du�ej ilo�� element�w");
		}

		System.out.println("Head of queue is: " + q1.element());
		for (Integer value : q1) {
			System.out.println("Warto�� w kolejce: " + value);
		}

		try {
			System.out.println("Removed from queue: " + q1.remove());
			System.out.println("Removed from queue: " + q1.remove());
			System.out.println("Removed from queue: " + q1.remove());
			System.out.println("Removed from queue: " + q1.remove());

		} catch (NoSuchElementException e) {
			System.out.println("Nie ma nic do usuni�cia");
		}
		// ///////////////////////////////////////////////////////////////
		
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);
		
		System.out.println("Queue 2 peek: " + q2.peek());
		q2.offer(10);
		q2.offer(20);
		System.out.println("Queue 2 peek: " + q2.peek());
		if(q2.offer(30) == false){
			System.out.println("Offer faild to add third item");
		}
		for (Integer value : q2) {
			System.out.println("Warto�� w kolejce: " + value);
		}
		System.out.println("Queue 2 poll: " + q2.poll());
		System.out.println("Queue 2 poll: " + q2.poll());
		System.out.println("Queue 2 poll: " + q2.poll());
	}
}
