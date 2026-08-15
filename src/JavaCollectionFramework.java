import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class JavaCollectionFramework {
    // JCF is a set of interfaces and classes to implement various data structures and algos
    //collection is the root interface
    public static void main(String[] args) {
//        // list or collection -> interface -> object creation not possible
//        ArrayList<Integer> list = new ArrayList<>();
//
//        //add
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        list.add(50);
//        System.out.println(list);
//        list.add(60);
//        System.out.println(list);
//
//        //remove
//        list.remove(0);
//        System.out.println(list);
//
//        //addAll method
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(101);
//        list2.add(102);
//        list2.add(103);
//
//        list.addAll(list2);
//        System.out.println(list);
//
//        //removeAll
//        list.removeAll(list2);
//        System.out.println(list);
//
//        //size
//        System.out.println(list.size());
//
//        System.out.println("printing list 2:"+list2);
//        list2.clear();
//        System.out.println(list2.size());
//
//        //iterator -> standard way to traverse over any data structure
//
//        //i want to traverse list using iterator
//        Iterator<Integer> iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.println("element: "+ iterator.next());
//        }
//        // iterator has [has next()] to iterate over the array or list

//        List<Integer> list3 = new ArrayList<>();
//        list3.add(10);
//        list3.add(20);
//        list3.add(30);
//        list3.add(40);
//        //System.out.println(list3.get(0));
//        System.out.println(list3);
//
//        list3.set(0, 100);
//        System.out.println(list3);
//
//        //toArray - convert a list into array
//       Object[] array = list3.toArray();
//       for(Object o : array){
//           System.out.println(o);
//       }

//       // contains -- checks whether a list has the given element or not. returns true or false
//       System.out.println(list3.contains(100));

//        List<Integer> list = new ArrayList<>();

//        List<Integer> collection = new ArrayList<>();
//        collection.add(10);
//        collection.add(6);
//        collection.add(36);
//        collection.add(32);
//        collection.add(48);
        //System.out.println(collection);

        //sort an array list or collection

        //ascending order
//       Collections.sort(collection);
//       System.out.println(collection);

        //descending order
//        Collections.reverse(collection);
//        System.out.println(collection);

        //.clone
//        ArrayList<Integer> clonedlist = (ArrayList<Integer>) ((ArrayList<Integer>) collection).clone();
//        System.out.println(" cloned list:"+clonedlist);

        //.ensureCapacity
//        ArrayList<Integer> anotherClonedList = new ArrayList<>();
//        anotherClonedList.ensureCapacity(550); //prevents memory wastage by allocating more memory than needed.
        // generalLy when the threshold of the arraylist reaches then a new memory is allocated and the values of old memory are
        //copied to the new memory location then reference is stored which takes a lot ofg memory when done frequently so to prevent
        // this we use ensureCapacity method which allocates the memory in advance and prevents wastage of memory.
//        System.out.println(clonedlist.isEmpty());

        // .index function
//        System.out.println(collection.indexOf(36));

        // JAVA LINKEDLIST (doubly linked list)
        // collection of nodes, each element is a node.
        // each node has 3 type of data- prev, data, next
        // prev- has the reference to previous node

        //Implementation
//        List<Integer> linkedList = new LinkedList<>();
//        linkedList.add(10);
//        linkedList.add(20);
//        linkedList.add(30);
//        linkedList.add(23);
//        linkedList.add(30);
//        System.out.println(linkedList);
//        //.lastIndexOf
//        System.out.println(linkedList.lastIndexOf(30));
        //System.out.println(linkedList.indexOf(20));
        //all the operations of arraylist are applicable to linkedlist as well
        // only cloning using .clone not possible in linkedlist

        //linked list can implement methods of queue and deque as well

        //addFirst and addLast
//        System.out.println(linkedList);
//        linkedList.addFirst(100); //adds element at the first position
//        linkedList.addLast(200); //adds element at the last position
//        System.out.println(linkedList);
//
//        linkedList.removeFirst(); //removes element from the first position
//        linkedList.removeLast(); //removes element from the last position
//        System.out.println(linkedList);
//
//        System.out.println(linkedList.getFirst()); //returns the first element
//        System.out.println(linkedList.getLast()); //returns the last element

//        List<Integer> linkedList2 = new LinkedList<>();
//        linkedList2.add(10);
//        linkedList2.add(20);
//        linkedList2.add(30);
        //System.out.println(linkedList2);
//        System.out.println(linkedList2.peek()); //returns the first element without removing it
//        System.out.println(linkedList2.peekFirst()); //returns the first element without removing it
//        System.out.println(linkedList2.peekLast()); //returns the last element without removing it
//
//        System.out.println(linkedList2.poll()); //removes and returns the first element
//        System.out.println(linkedList2.pollFirst()); //removes and returns the first element
//        System.out.println(linkedList2.pollLast()); //removes and returns the last element

//        System.out.println("before: " + linkedList2);
//        System.out.println("polling: " + ((LinkedList<Integer>) linkedList2).poll());
//        System.out.println("after: " + linkedList2);

        //offer() method adds an element to the end of the list
//        System.out.println("before: " + linkedList2);
//        System.out.println("offering: " + ((LinkedList<Integer>) linkedList2).offer(40));
//        System.out.println("after: " + linkedList2);

        // Vector - allows to create resizable array, similar to ArrayList but synchronized and thread-safe
        // it locks the memory when one thread is accessing it and other threads have to wait for the lock to be released before they can access it
        // list and colllection ka sb element isma bhi work krte ha
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);
        System.out.println(vector);

    }
}
