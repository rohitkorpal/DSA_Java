package JavaCollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class JCF2 {
    static void main() {
        // Java Queue interface provides functionality of queue data structure. It is used to hold the elements about to be processed. It follows First In First Out (FIFO) order to process the elements. The element which is inserted first will be removed first.
        // addition is done at the end of the queue and deletion is done from the front of the queue.

//        Queue<Integer> queue = new LinkedList<>();
//        queue.offer(1);
//        queue.offer(2);
//        queue.offer(3);
//        System.out.println("Queue: " + queue);
        // add method is used to add elements to the queue. It throws an exception if the queue is full.
        // offer method is used to add elements to the queue. It returns false if the queue is full.
        // so we use offer method to add elements to the queue.

        //element() method is used to retrieve, but not remove, the head of the queue. It throws an exception if the queue is empty.
//        System.out.println("Head of the queue: " + queue.element());
        //peek() method is used to retrieve, but not remove, the head of the queue. It returns null if the queue is empty.
//        System.out.println("Head of the queue: " + queue.peek());
        //remove() method is used to retrieve and remove the head of the queue. It throws an exception if the queue is empty.
//        System.out.println("Removed head of the queue: " + queue.remove());
        //poll() method is used to retrieve and remove the head of the queue. It returns null if the queue is empty.
//        System.out.println("Removed head of the queue: " + queue.poll());
//        System.out.println("Queue after removal: " + queue);

        // in queue for insertion we use offer()
        // and for deletion we use poll() method.
        // For retrieval we use peek() method.



    }
}
