package JavaCollectionFramework;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasics {
    static void main() {
        Queue<Integer> PriorityQueue = new PriorityQueue<>();
        //default behavior -> Integers -> less value -> higher priority
        PriorityQueue.offer(5);
        PriorityQueue.offer(3);
        PriorityQueue.offer(8);
        PriorityQueue.offer(29);
        PriorityQueue.offer(21);

        System.out.println("PriorityQueue: " + PriorityQueue);
        System.out.println(PriorityQueue.poll() + " is removed from the PriorityQueue");
        System.out.println("PriorityQueue after removal: " + PriorityQueue);
        System.out.println(PriorityQueue.poll() + " is removed from the PriorityQueue");
        System.out.println("PriorityQueue after second removal: " + PriorityQueue);

    }
}
