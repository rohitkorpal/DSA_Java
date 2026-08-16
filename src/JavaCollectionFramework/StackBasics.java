package JavaCollectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;




public class StackBasics {
    static void main() {
        Deque<Integer> Stack = new ArrayDeque<>();
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        System.out.println("Stack: " + Stack);

        Stack.pop();
        System.out.println("Stack after pop: " + Stack);



    }
}
