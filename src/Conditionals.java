import java.util.Scanner;

public class Conditionals {
    static void main() {
//        int dailyPractice = 12;
//
//        if (dailyPractice >= 10) {
//            System.out.println("Good consistency!");
//        }

//        System.out.println("Enter your age:");
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        //int age= 20;
//        if (age >= 18) {
//            System.out.println("you are eligible to vote.");
//
//        } else{
//            System.out.println(" you are not eligible to vote.");
//        }

//        System.out.println(" Enter accuracy: ");
//        int accuracy = sc.nextInt();
//        if (accuracy >= 90) {
//            System.out.println("Excellent");
//        } else if (accuracy >= 75) {
//            System.out.println("Good");
//        } else if (accuracy >= 60) {
//            System.out.println("Average");
//        } else {
//            System.out.println("Needs Improvement");
//        }

//        boolean hasSubscription= true;
//        int solvedProblems= 190;
//
//        if (hasSubscription) {
//
//            if (solvedProblems>=200) {
//                System.out.println("Unlock advanced sheets");
//            } else {
//                System.out.println("Solve more problems");
//            }
//        } else {
//            System.out.println("Buy subscription");
//        }

//        int age = 10;
//        char gender = 'F';
//
//        if (gender == 'M') {
//
//            System.out.println("you are male");
//
//            if (age >=18){
//                System.out.println("you are male and can vote");
//            }else{
//                System.out.println("you are not male and can not vote");
//            }
//        }else {
//            System.out.println("you are female");
//            if (age >=18){
//                System.out.println("you are female and can vote");
//            }else {
//                System.out.println("you are not female and can not vote");
//            }
//        }

//        int age= 25;
//        String vote = (age>=18)? "eligible to vote":"not eligible to vote";
//        System.out.println(vote);

//        int dayNumber = 4;
//
//        switch (dayNumber) {
//            case 1:
//                System.out.println("Monday");
//                break;//break stops execution of rest of switch cases.
//
//            case 2:
//                System.out.println("Tuesday");
//                break;
//
//            case 3:
//                System.out.println("Wednesday");
//                break;
//
//            default:
//                System.out.println("Invalid day");
//        }
//
//        int level = 2;
//
//        switch (level) {
//            case 1:
//                System.out.println("Beginner");
//            case 2:
//                System.out.println("Intermediate");//without break
//            case 3:
//                System.out.println("Advanced");
//        }
//
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a lowercase character: ");
//        char ch = sc.next().charAt(0);
//
//        // Check if the character is lowercase
//        if (ch >= 'a' && ch <= 'z') {
//            // Convert to uppercase by subtracting 32 (ASCII difference)
//            char upper = (char)(ch - 32);
//            System.out.println("Uppercase version: " + upper);
//        } else {
//            System.out.println("The input is not a lowercase character.");
//        }
//
//        sc.close();

//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter an uppercase character: ");
//        char ch = sc.next().charAt(0);
//
//        // Check if the character is uppercase
//        if (ch >= 'A' && ch <= 'Z') {
//            // Convert to lowercase by adding 32 (ASCII difference)
//            char lower = (char)(ch + 32);
//            System.out.println("Lowercase version: " + lower);
//        } else {
//            System.out.println("The input is not an uppercase character.");
//        }
//
//        sc.close();



            Scanner sc = new Scanner(System.in);

            int[] marks = new int[5];
            System.out.println("Enter marks for 5 subjects:");

            for (int i = 0; i < 5; i++) {
                marks[i] = sc.nextInt();
            }

            // Find the minimum mark
            int min = marks[0];
            for (int i = 1; i < 5; i++) {
                if (marks[i] < min) {
                    min = marks[i];
                }
            }

            // Calculate sum of all marks
            int sum = 0;
            for (int i = 0; i < 5; i++) {
                sum += marks[i];
            }

            // Drop the least one
            int sumTop4 = sum - min;

            // Calculate percentage (out of 400 since only 4 subjects count)
            double percentage = (sumTop4 / 400.0) * 100;

            System.out.println("Lowest mark dropped: " + min);
            System.out.println("Overall percentage (top 4 subjects): " + percentage);

            sc.close();

    }
}