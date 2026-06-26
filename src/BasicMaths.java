public class BasicMaths {
    static void printDigits(int num) {
        // AGR mera num == 0 toh main rukjauga
        // agr mera num != = then mai processing krte rhuga
        while (num != 0) {
            int digit = num % 10;
            System.out.print(digit);
            num = num / 10;
        }

    }

    static int countDigits(int num) {
        // AGR mera num == 0 toh main rukjauga
        // agr mera num != = then mai processing krte rhuga
        int count = 0;
        while (num != 0) {
            int digit = num % 10;
            count++;
            num = num / 10;
        }
        return count;

    }

    static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        return sum;

    }

    static int reverseNum(int num) {
        int revNum = 0;
        while (num != 0) {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num = num / 10;
        }
        return revNum;
    }

    static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = reverseNum(num);
        if (originalNum == reversedNum) {
            System.out.println("Palindrome");
            return true;
        } else {
            System.out.println("Not a palindrome");
            return false;
        }

    }

    static boolean isPrimeOrNot(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                // not a prime
                return false;
            }
        }
//        for (int i = 2; i <= num - 1; i++) { // high time complexity becz loop running till n-1
//            // best approach is to run till under root n
//            if (num % i == 0) {
//                // not a prime
//                return false;
//            }
//        }
        //yaha tabhi pahunchoga jab loop se baher nikloga
        //or loop se tabhi baher nikloge jab kabhi bhi
        //remainder ma zero naa aaye
        //or agr kabhi remainder zero nhi aaya
        //iska mtlb its a prime number
        return true;
    }

    static void main() {
        //suppoose we need to get 5 from 57123 we use '%10'.
        // '%10' get any last digit form the number
        // '/10' to remove it after '%10' operation

        //int n= 53127; //%10 gives 7 as the remainder
        // /10 gives 5312
//        int num = 53127;
//        printDigits(num);

        //count digits of a number
//        int num = 531127;
//        int ans = countDigits(num);
//        System.out.println(ans);

        //Sum of digits of number
//        int num = 53748392;
//        int ans = sumOfDigits(num);
//        System.out.println(ans);

        // reverse a number
//        int num = 1234;
//        int revNum = reverseNum(num);
//        System.out.println(revNum);

        // Palindrome number
//        int num = 1221;
//        boolean isPalindrome = isPalindrome(num);
//        System.out.println(isPalindrome);

        // prime number
        int num = 3;
        boolean result = isPrimeOrNot(num);
        System.out.println("is it a prime number:" + " " + result);


    }
}
