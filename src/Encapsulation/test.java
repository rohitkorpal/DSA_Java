package Encapsulation;

public class test {
    static void main() {
        Encapsulation A = new Encapsulation(1,12,"rahul",3,"mansi");

        System.out.println(A.getAge());
        //A.age=54; not possible

        A.setAge(127);

        //System.out.println(A.gf);
//      System.out.println(A.getName());
        System.out.println(A.getAge());
//        System.out.println(A.id);
//        System.out.println(A.nos);

        //A.bunk();
        //A.gfchatting();
    }
}
