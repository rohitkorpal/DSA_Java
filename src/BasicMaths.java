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

    static void main() {
        //suppoose we need to get 5 from 57123 we use '%10'.
        // '%10' get any last digit form the number
        // '/10' to remove it after '%10' operation

        //int n= 53127; //%10 gives 7 as the remainder
        // /10 gives 5312
//        int num = 53127;
//        printDigits(num);

        //count digits of a number
        int num = 53127;
        int ans = countDigits(num);
        System.out.println(ans);


    }
}
