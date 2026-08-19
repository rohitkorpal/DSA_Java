package JavaCollectionFramework;

public class JavaSet {
    static void main() {

        //set is a collection of unique elements
        //set is an interface
        //HashSet, LinkedHashSet, TreeSet are classes that implement Set interface

        //HashSet -> unordered collection of unique elements
        //LinkedHashSet -> ordered collection of unique elements
        //TreeSet -> sorted collection of unique elements

        //HashSet example
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        System.out.println(set);

        //LinkedHashSet example
        LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();
        linkedSet.add(10);
        linkedSet.add(20);
        linkedSet.add(30);
        linkedSet.add(40);
        linkedSet.add(50);
        System.out.println(linkedSet);

        //TreeSet example
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(50);
        treeSet.add(40);
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(10);
        System.out.println(treeSet);

    }
}
