import java.util.*;

public class JavaCollectionFramework {
    // JCF is a set of interfaces and classes to implement various data structures and algos
    //collection is the root interface
   public static void main(String[] args) {
//        // list or collection -> interface -> object creation not possible
//        ArrayList<Integer> list = new ArrayList<>();
//
//        //add
////        list.add(10);
////        list.add(20);
////        list.add(30);
////        list.add(40);
////        list.add(50);
////        System.out.println(list);
////        list.add(60);
////        System.out.println(list);
////
////        //remove
////        list.remove(0);
////        System.out.println(list);
////
////        //addAll method
////        List<Integer> list2 = new ArrayList<>();
////        list2.add(101);
////        list2.add(102);
////        list2.add(103);
////
////        list.addAll(list2);
////        System.out.println(list);
////
////        //removeAll
////        list.removeAll(list2);
////        System.out.println(list);
////
////        //size
////        System.out.println(list.size());
////
////        System.out.println("printing list 2:"+list2);
////        list2.clear();
////        System.out.println(list2.size());
////
////        //iterator -> standard way to traverse over any data structure
////
////        //i want to traverse list using iterator
////        Iterator<Integer> iterator = list.iterator();
////        while(iterator.hasNext()){
////            System.out.println("element: "+ iterator.next());
////        }
////        // iterator has [has next()] to iterate over the array or list
//
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
//
//       //contains -- checks whether a list has the given element or not. returns true or false
//       System.out.println(list3.contains(100));

//        List<Integer> list = new ArrayList<>();

       Collection<Integer> collection = new ArrayList<>();
       collection.add(1);
       System.out.println(collection);

    }
}
