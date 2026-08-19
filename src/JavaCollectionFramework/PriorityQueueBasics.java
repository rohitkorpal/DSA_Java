package JavaCollectionFramework;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasics {
    static void main() {
//        Queue<Integer> PriorityQueue = new PriorityQueue<>();
//        //default behavior -> Integers -> less value -> higher priority -> MinHeap
//        PriorityQueue.offer(5);
//        PriorityQueue.offer(3);
//        PriorityQueue.offer(8);
//        PriorityQueue.offer(29);
//        PriorityQueue.offer(21);
//        System.out.println("PriorityQueue: " + PriorityQueue);
//        System.out.println(PriorityQueue.poll() + " is removed from the PriorityQueue");
//        System.out.println("PriorityQueue after removal: " + PriorityQueue);
//        System.out.println(PriorityQueue.poll() + " is removed from the PriorityQueue");
//        System.out.println("PriorityQueue after second removal: " + PriorityQueue);

        Queue<Integer>MaxPriorityQueue = new PriorityQueue<>((a,b)->b-a); //comparator -> reverse order -> max heap -> higher value -> higher priority
        MaxPriorityQueue.offer(5);
        MaxPriorityQueue.offer(3);
        MaxPriorityQueue.offer(8);
        MaxPriorityQueue.offer(29);
        MaxPriorityQueue.offer(21);
        System.out.println("MaxPriorityQueue: " + MaxPriorityQueue);
        System.out.println(MaxPriorityQueue.poll() + " is removed from the MaxPriorityQueue");
        System.out.println("MaxPriorityQueue after removal: " + MaxPriorityQueue);

    }
}
