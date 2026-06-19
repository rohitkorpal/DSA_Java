import java.math.BigInteger;
import java.util.Scanner;//Import Scanner

public class TakingInput {
    static void main() {
        Scanner sc = new Scanner(System.in);//create a object to take input
        //System.in → standard input (keyboard)
        //sc → object name

        System.out.print("Enter an integer 1: ");
        int firstnumber = sc.nextInt();
        System.out.print("Enter an integer 2: ");
        int secondnumber = sc.nextInt();
        System.out.print("Enter an integer 3: ");
        int thirdnumber = sc.nextInt();
        int answer = firstnumber + secondnumber + thirdnumber;
        System.out.println("answer is:"+ answer);

        System.out.print("Enter biginteger: ");
        BigInteger bg = sc.nextBigInteger();
        System.out.println("answer is :"+ bg);

        System.out.println("enter the value for flag:");
        boolean flag= sc.nextBoolean();
        System.out.println("answer is :"+ flag);

        System.out.println("enter the value for shortval:");
        short shortval= sc.nextShort();
        System.out.println("answer is :"+ shortval);

        System.out.println("enter the value for intval:");
        int intval= sc.nextInt();
        System.out.println("answer is :"+ intval);

        System.out.println("enter the value for longval:");
        long longval= sc.nextLong();
        System.out.println("answer is :"+ longval);

        System.out.println("enter the value for floatval:");
        float floatval= sc.nextFloat();
        System.out.println("answer is :"+ floatval);


        sc.close();//prevents resource leakage

        //Java garbage collector is an entitiy that makes sure that problem like memory leak dont happen and improves performace
        // java uses heap memory structure
        //println() prints text and moves to a new line.
        //print() prints text but keeps the cursor on the same line.

        String studentName = "Rohit";
        int solvedProblems = 150;

        System.out.printf("Student: %s, Problems Solved: %d", studentName, solvedProblems);
        //%s → placeholder for String
        //%d → placeholder for integer
        //printf() replaces placeholders with actual values
        //printf() is used for formatted printing (similar to C/C++)




    }
}
