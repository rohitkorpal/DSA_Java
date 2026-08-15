package JavaCollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ArrayDequeBasics {
    static void main() {

        // ArrayDeque is a resizable array implementation of the Deque interface. It is a linear data structure that allows the insertion and removal of elements from both ends. It is not thread-safe and does not support concurrent access by multiple threads.
        // ArrayDeque is faster than LinkedList and Stack because it uses a dynamic array to store the elements. It has a better cache locality and less memory overhead.
        // ArrayDeque can be used as a stack (LIFO) or a queue (FIFO) depending on the methods used to add and remove elements.
        // ArrayDeque does not allow null elements. It throws NullPointerException if you try to add null.
        // ArrayDeque has no capacity restrictions. It grows as needed to accommodate new elements.
        // ArrayDeque is not synchronized. If multiple threads access an ArrayDeque concurrently, and at least one of the threads modifies the deque structurally, it must be synchronized externally.
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer(1);
        arrayDeque.offer(2);
        arrayDeque.offer(3);
        System.out.println("ArrayDeque: " + arrayDeque);

        arrayDeque.poll();
        System.out.println("ArrayDeque after poll: " + arrayDeque);
        arrayDeque.pollFirst();
        System.out.println("ArrayDeque after pollFirst: " + arrayDeque);
        arrayDeque.pollLast();
        System.out.println("ArrayDeque after pollLast: " + arrayDeque);
        arrayDeque.offerFirst(10);
        System.out.println("ArrayDeque after offerFirst: " + arrayDeque);
        arrayDeque.offerLast(20);
        System.out.println("ArrayDeque after offerLast: " + arrayDeque);
        System.out.println("Peek first: " + arrayDeque.peekFirst());
        System.out.println("Peek last: " + arrayDeque.peekLast());
        System.out.println("Size of ArrayDeque: " + arrayDeque.size());





    }
}
