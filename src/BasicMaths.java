import javax.print.attribute.standard.PresentationDirection;

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

    static int getGreatestCommonDivisor(int a, int b) {
        //gcd(a,b)=gcd(b, a%b)
        while (b != 0) {
            int oldValueOfB = b;
            b = a % b;
            a = oldValueOfB;
        }
        //Jab mera b 0 hoga, tab a ki place pr gcd milega
        int ans = a;
        return ans;
    }

    static int getLCM(int a, int b) {
        int gcd = getGreatestCommonDivisor(a, b);
        //gcd(18,12) = 6
        int prod = a * b;
        //prod(a,b)=216
        int lcm = prod / gcd;
        //216/6=36
        return lcm;
    }

    static boolean isArmstrong(int num) {
        int sum = 0;
        int originalNum = num;

        while (num != 0) {
            int digit = num % 10;
            int cubeOfDigit = digit * digit * digit;
            sum += cubeOfDigit;
            num = num / 10;
        }
        if (sum == originalNum) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isPerfectNum(int num) {
        int sum = 1;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                //i ne num ko perfectly divide krdia h
                // toh factor pair kya banega
                // 1st factor --> i
                // 2nd factor --> num/i
                int firstFactor = i;
                int secondFactor = num / i;
                sum = sum + firstFactor + secondFactor;
            }
        }
        if (sum == num) {
            return true;
        } else {
            return false;
        }

    }

    static void printAllPrimes(int n) {
        for  (int num = 2; num <= n; num++) {
            boolean isPrime = isPrimeOrNot(num);
            if (isPrime==true) {
                System.out.println(num);
            }
        }
    }

    static void main() {
        // most imp concept
        //suppose we need to get 5 from 57123 we use '%10'.
        // '%10' get any last digit form the number,'%' it gives the remainder
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
//        int num = 3;
//        boolean result = isPrimeOrNot(num);
//        System.out.println("is it a prime number:" + " " + result);

        // GCD/HCF of a number
        // Eucledian formula is used ie gcd(a,b) = gcd (b,a%b)
        //System.out.println(getGreatestCommonDivisor(18,12));

        //LCM of a number
        //LCM*HCF= a * b
//        int a = 18;
//        int b = 12;
//        System.out.println(getLCM(a, b));

        //ARMSTRONG NUMBER
        //eg 153---> i^3 + 2^3 + 3^3 = 153
        // input == output
//        int num = 155;
//        System.out.println(isArmstrong(num));

        // find divisor or check perfect number
        // perfect no. - if sum of all divisors of a number is equal to that number then that is a perfect number
        //System.out.println(isPerfectNum(6));

        // Print all primes
        //printAllPrimes(10);

        // count digits in a number
//        int n = 12345;
//        int count = 0;
//
//        while (n > 0) {
//            n = n / 10;
//            count++;
//        }
//
//        System.out.println("Number of digits = " + count);

        //odd or even
//        int n= 7;
//        if (n%2==0){
//            System.out.println("Even");
//        }else {
//            System.out.println("Odd");
//        }
    }
}
