import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		// [0][1][2][3][4][5]....
		List<Integer> arrayList = new ArrayList<Integer>();
		// [0]->[1]->[2]->[3]->...
		//    <-   <-   <-

		List<Integer> linkedList = new LinkedList<Integer>();

		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
	}

	private static void doTimings(String type, List<Integer> list) {
		for (int i = 0; i < 1E5; i++) {
			list.add(i);
		}
		long start = System.currentTimeMillis();

		/*
		 * // Add items at end of list
		 * for (int i = 0; i < 1E5; i++) {
		 * list.add(i); }
		 */
		/*
		 * // Add items elsewhere in list
		 * for (int i = 0; i < 1E5; i++) {
		 * list.add(0, i); }
		 */
		// Add items at the end of the list
		for (int i = 0; i < 1E5; i++) {
			list.add(list.size(), i);
		}
		long end = System.currentTimeMillis();

		System.out.println("Czas zmierzony: " + (end - start) + "ms.");
	}
}
