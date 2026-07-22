import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class JavaCollectionFramework {
    // JCF is a set of interfaces and classes to implement various data structures and algos
    //collection is the root interface
    static void main() {
        // list or collection -> interface -> object creation not possible
        ArrayList<Integer> list = new ArrayList<>();

        //add
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        list.add(60);
        System.out.println(list);
//        List<Integer> list = new ArrayList<>();
//        Collection<Integer> collection = new ArrayList<>();

    }
}
