package JavaCollectionFramework;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueBasics {
    static void main() {
        Queue<Integer> PriorityQueue = new PriorityQueue<>();
        PriorityQueue.offer(5);
        PriorityQueue.offer(3);
        PriorityQueue.offer(8);
        System.out.println("PriorityQueue: " + PriorityQueue);

    }
}
