package JavaCollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaSet {
    static void main() {

        //set is a collection of unique elements
        //set is an interface
        //HashSet, LinkedHashSet, TreeSet are classes that implement Set interface

        //EnumSet -> collection of unique elements of enum type
        //HashSet -> unordered collection of unique elements
        //LinkedHashSet -> ordered collection of unique elements
        //TreeSet -> sorted collection of unique elements

        // RetainAll() method is used to retain only the elements in this set that are contained in the specified collection.
        // In other words, it removes from this set all of its elements that are not contained in the specified collection.

//        Set<Integer> Set1 = new HashSet<>();
//        Set<Integer> Set2 = new HashSet<>();
//
//        Set1.add(10);
//        Set1.add(20);
//        Set1.add(30);
//        Set1.add(40);
//        Set1.add(50);
//
//        Set2.add(11);
//        Set2.add(21);
//        Set2.add(31);
//        Set2.add(40);
//        Set2.add(50);
//
//        Set1.removeAll(Set2);
//        System.out.println(Set1);

//        Set1.retainAll(Set2);
//        System.out.println(Set1);
//        System.out.println(Set2);

//        System.out.println(Set1.containsAll(Set2));
//        System.out.println(Set2.containsAll(Set1));

        //HashSet example
//        HashSet<Integer> set = new HashSet<>();
//        //set does not allow duplicate elements
//        //set doesn't maintain the order of elements because the elements are stored in a hash table and accessed using their hash codes.
//        The order of elements in a HashSet is not guaranteed to be the same as the order in which they were added.

//        set.add(10);
//        set.add(20);
//        set.add(30);
//        set.add(30);
//        set.add(40);
//        set.add(50);
//        System.out.println(set);

        //LinkedHashSet example
//        LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();
//        linkedSet.add(10);
//        linkedSet.add(20);
//        linkedSet.add(30);
//        linkedSet.add(40);
//        linkedSet.add(50);
//        System.out.println(linkedSet);

        //TreeSet example
//        TreeSet<Integer> treeSet = new TreeSet<>();
//        treeSet.add(50);
//        treeSet.add(40);
//        treeSet.add(20);
//        treeSet.add(10);
//        treeSet.add(20);
//        treeSet.add(10);
//        System.out.println(treeSet);


        //HashedSet -> unordered collection of unique elements -> O(1) time complexity for add, remove, contains operations
        //LinkedHashSet -> ordered collection of unique elements -> O(n) time complexity for add, remove, contains operations
        //TreeSet -> sorted collection of unique elements -> O(log n) time complexity for add, remove, contains operations
    }
}
