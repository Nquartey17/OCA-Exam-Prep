import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Collections {

    public static void main(String[] args) {
        //You can use Collection, List, or ArrayList in the beginning line
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        //You can only use set on indexes where elements exist
        list.set(0, "replace");

        /* Iterator methods: hasNext() -> returns true or false if list contains more elements
        next() -> returns object
        remove() -> removes object

        ListIterator has more methods like previous
        don't create a new instance of iterator (probably static method)
         */
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        ListIterator i2 = list.listIterator();
        System.out.println(i2.hasPrevious());

        /* ArrayLists are fast at random access (example: list.get(27) )
        They are slower at adding and removing elements in the middle
        Linked lists work in the opposite way
         */

        HashSet<String> saleRegion = new HashSet<>();
        saleRegion.add("Minnesota");
        saleRegion.add("Wisconsin");
        saleRegion.add("Iowa");
        saleRegion.add("Minnesota"); //no duplicates in sets

        //Uses comparator to order elements in tree set
        //Default comparator order: numbers, captial letters, lowercase letters
        // no indexes to find elements, returns objects by hashcode
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(88);
        tree.add(53);
        tree.add(66);
        tree.add(12);
        Iterator iter3 = tree.iterator();
        while (iter3.hasNext()) {
            System.out.println(iter3.next() + " "); // prints 12 53 66 88
        }

        /* Methods for queue have methods that will throw and exception or not
        Adding to queue: add() -> exception and offer() -> returns false
        Removing from queue: remove() -> exception and poll() -> returns null
        Checking head: element() -> exception and peek() -< returns null
         */
        System.out.println();

        //ArrayBlockingQueue (FIFO) has a fixed number of elements
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(5);
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        queue.offer("D");
        queue.offer("E");
        queue.offer("F"); //not added, queue at max capacity
        System.out.println(queue);
        String letter = queue.poll();
        System.out.println(letter);
        String nextLetter = queue.peek();
        System.out.println(nextLetter);
        System.out.println(queue);

        //PriorityQueue works like first class lines that allow premium customers to skip to the front
        //No capactity needed, prints elements in default comparator order

        System.out.println();
        //Deques (deck) allows elements to be inserted and removed at both ends
        //Exception methods: addFirst(), removeFirst(), getFirst(), addLast(), removeLast(), getLast()
        //Non-Exception methods: offerFirst(), pollFirst(), peekFirst(), offerLast(), pollLast(), peekLast()
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.offerFirst("center");
        deque.offerFirst("Bruce Banner");
        deque.offerLast("Barry Allen");
        deque.offerFirst("Bruce Wayne");
        deque.offerLast("Clark Kent");
        deque.offerFirst("Peter Parker");
        deque.offerLast("Hal Jordan");
        System.out.println(deque);
        System.out.println(deque.pollLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque);

        System.out.println();
        //No duplicate keys allowed in maps
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "test");
        map.put(2, "test 2");
        map.put(3, "test 3");
        map.get(2);
        map.remove(2);
        System.out.println(map);

        Set s = map.keySet();
        System.out.println(s);
        Collection c = map.values();
        System.out.println(c);

    }

}
