import java.util.Scanner;
public class LoopsHW {
    static void main() {

        Scanner sc = new Scanner(System.in);

        // 1. Print counting from 1 to n
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            System.out.print(i + " ");
//        }

        //2. Print counting from n to 1
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//
//        for (int i = n; i >= 1; i--) {
//            System.out.print(i + " ");
//        }

        // 3. Print the 10 multiples of n
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(n * i);
//        }

        // 4. Print your name 100 times
//        String name = "Rohit";  // replace with your name
//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i + ". " + name);
//        }

        // 5. Print all prime numbers from 1 to 100
//        for (int num = 2; num <= 100; num++) {
//            boolean isPrime = true;
//            for (int i = 2; i <= num / 2; i++) {
//                if (num % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime) {
//                System.out.print(num + " ");
//            }
//        }

        // 6. Print all even numbers from 1 to 100
//        for (int i = 2; i <= 100; i += 2) {
//            System.out.print(i + " ");
//        }

//        7. Print the sum of all numbers from 1 to n
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
//
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//        }
//        System.out.println("Sum = " + sum);

//        8. Print all integers in range 50–100 divisible by 7
//        for (int i = 50; i <= 100; i++) {
//            if (i % 7 == 0) {
//                System.out.print(i + " ");
//            }
//        }


//        int modulesLeft = 4;
//
//        while (modulesLeft >= 1) {
//            System.out.println("Modules left: " + modulesLeft);
//            modulesLeft--;
//        }

        sc.close();

//while
//Condition checked first.
//If false initially, loop does not run even once.
//
//do-while- It executes the loop body at least once, even if the condition is false.
//Body runs first.
//If condition is false initially, loop still runs once.

        //infinite loop
//        while (true) {
//            System.out.println("This keeps running forever");
//        }

    }
}
