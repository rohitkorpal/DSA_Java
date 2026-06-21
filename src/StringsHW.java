import java.util.Scanner;

public class StringsHW {
    static void main() {
        //Q1 count all consonants

//        String str = "rohit";
//        int count = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
//                count++;
//            }
//        }
//        System.out.println(count);

        //Q2 how to remove blank spaces from string
//        String name = "rohit korpal";
//        String str= "";
//        for (int i = 0; i < name.length(); i++) {
//            char ch = name.charAt(i);
//            if (ch != ' ') {
//                str += ch;
//            }
//        }
//        System.out.println(str);

        //Q3 find frequency of a character
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a string: ");
//        String str = sc.nextLine();
//
//        System.out.print("Enter character to find frequency: ");
//        char ch = sc.next().charAt(0);
//
//        int count = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//            if (str.charAt(i) == ch) {
//                count++;
//            }
//        }
//
//        System.out.println("Frequency of '" + ch + "' = " + count);

        //Q4 convert to uppercase without using method
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a string: ");
//        String str = sc.nextLine();
//
//        String result = "";
//
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//
//            if (ch >= 'a' && ch <= 'z') {
//                ch = (char)(ch - 32);
//            }
//
//            result = result + ch;
//        }
//
//        System.out.println("Uppercase String: " + result);

        //Q5 to chek if string contain only digit
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a string: ");
//        String str = sc.nextLine();
//
//        boolean isDigitOnly = true;
//
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//
//            if (ch < '0' || ch > '9') {
//                isDigitOnly = false;
//                break;
//            }
//        }
//
//        if (isDigitOnly) {
//            System.out.println("String contains only digits.");
//        } else {
//            System.out.println("String does not contain only digits.");
//        }

        //Q6 COUNT WORD IN SENTENCE
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && str.charAt(i) != ' ') {
                count++;
            }
            else if (str.charAt(i) != ' ' && str.charAt(i - 1) == ' ') {
                count++;
            }
        }

        System.out.println("Number of words = " + count);

    }
}
