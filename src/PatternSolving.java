public class PatternSolving {
    static void main() {

        //trick
        //1- find no. of rows--> for outer loop
        //2- for each row --> column count
        //3- analyse each row --> for formula and relation creation

        //Pattern 1: Solid Square Pattern

        // no. of rows = 4 == n.
        // for each row == 4 columns

//        for (int i=1; i<=4; i++){
//            for (int j=1;j<=4; j++){
//                //print star
//                System.out.print("* ");
//            }
//            // move to next line
//            System.out.println();
//        }


        //solid rectangle patter

//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 5; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //simple star pyramid
//
//        for (int i=1; i<=5; i++){
//            for (int j=1; j<=i;  j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //reverse star pyramid

//        for (int i = 1; i <= 5; i++) {
//            for (int j = 5; j >= i; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //alternate way
//        int n=5;
//        for (int row = 1; row <= n; row++) {
//            for (int j = 1; j <= n - row + 1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        //solid rhombus
//        // row== 5
//        for (int i=1;i<=5; i++){
//
//            //print spaces
//            for (int j=1;j<=5-i;j++){
//                System.out.print(" ");
//            }
//
//            //for stars
//            for (int j=1;j<=5;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //full pyramid
//        int n=5;
//
//        for (int i = 1; i <= n; i++) {
//            //space logic
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
        //for part 2
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
        //for part 3
//            for (int j = 1; j <= i-1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //reverse full pyramid
        //formula to print stars- 2n-2i+1
        //for spaces- n-1
//        int n=4;
//        for (int i=1;i<=n; i++){
//            //for spaces
//            for (int j=1;j<=i-1;j++){
//                System.out.print("  ");
//            }
//            //for stars
//            for (int j=1; j<=2*n-2*i+1 ;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //hollow rectangle

        //h=4, row=n
        //column = 6 star
        //1st row= 6 stars-->pt1
        //2nd row= 1 st, 4sp,1st-->pt2
        //3rd row= 1 st, 4sp,1st-->pt2
        //4th row= 6 stars-->pt1
//        int n = 4;
//        for (int i = 1; i <= n; i++) {
//            //for each row--> 6 columns
//            for (int j = 1; j <= 6; j++) {
//                if (i == 1 || i == n) {
//                    System.out.print("* ");
//                } else {
//                    //middle row
//                    if (j == 1 || j == 6) {
//                        System.out.print("* ");
//                    } else {
//                        //middle column
//                        System.out.print("  ");
//                    }
//                }
//            }
//            System.out.println();
//        }


        //hollow right angle triangle

        /*For a hollow right-angled triangle, stars should print when:
        first column → j == 1
        last row → i == n
        diagonal/boundary → j == i
        Everything else should be spaces.*/

//        int n = 5;  //easy logic
//
//        for (int i = 1; i <= n; i++) {
//
//            for (int j = 1; j <= i; j++) {
//
//                if (j == 1 || i == n || j == i) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//
//            System.out.println();
//        }

//  alternate way (tough)
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            if (i == 1 || i == 2 || i == n) {
//                for (int j = 1; j <= i; j++) {
//                    System.out.print("* ");
//                }
//            } else {
//                System.out.print("* ");
//
//                for (int j = 1; j <= (i - 2); j++) {
//                    System.out.print("  ");
//                }
//
//                System.out.print("* ");
//
//            }
//            System.out.println();
//        }

        //hollow full pyramid
//        int n = 5;
//
//        for (int i = 1; i <= n; i++) {
//
//            // spaces
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(" ");
//            }
//
//            // stars and hollow spaces
//            for (int j = 1; j <= 2 * i - 1; j++) {
//
//                if (j == 1 || j == 2 * i - 1 || i == n) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//
//            System.out.println();
//        }

// alternate
//        int n=10;
//        for (int i=1; i<=n; i++) {
//            for (int j=1; j<=n-i; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j=1; j<=2*i-1; j++){
//                if (j==1|| j==2*i-1||i==n){
//                    System.out.print("*");
//                } else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        // diamond

//        int n = 5;
//
//        for (int i = 1; i <= n; i++) {
//            //space logic
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print("  ");
//            }
//            //for part 2
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            //for part 3
//            for (int j = 1; j <= i - 1; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        for (int i = 1; i <= n; i++) {
//            //for spaces
//            for (int j = 1; j <= i - 1; j++) {
//                System.out.print("  ");
//            }
//            //for stars
//            if (i==1){
//                continue;
//            }
//
//            for (int j = 1; j <= 2 * n - 2 * i + 1; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//

        // hollow diamond (practice again)
//        int n = 4;
//
//  upper half
//        for (int i = 1; i <= n; i++) {
//
//            // spaces
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print("  ");
//            }
//
//            // stars and hollow spaces
//            for (int j = 1; j <= 2 * i - 1; j++) {
//
//                if (j == 1 || j == 2 * i - 1) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//
//            System.out.println();
//        }
//
// lower half
//        for (int i = n - 1; i >= 1; i--) {
//
//            // spaces
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print("  ");
//            }
//
//            // stars and hollow spaces
//            for (int j = 1; j <= 2 * i - 1; j++) {
//
//                if (j == 1 || j == 2 * i - 1) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//
//            System.out.println();
//        }


//        //bow pattern
//
//        int n = 4;
//        for (int i = 1; i <= n; i++) {
//            //part1
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//
//            //part2- spaces
//            for (int j = 1; j <= 2 * (n - i); j++) {
//                System.out.print("  ");
//
//            }
//
//            //part3
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
//
//        //part4 {Use (n-row+1) to print reverse triangle}
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - i + 1; j++) {
//                System.out.print("* ");
//            }
//            //part5 - spaces (2*(i-1))
//            for (int j = 1; j <= 2 * (i - 1); j++) {
//                System.out.print("  ");
//            }
//            //part6 - stars
//            for (int j = 1; j <= n - i + 1; j++) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }


//        //butterfly pattern
//        int n = 4;
//        for (int i = 1; i <= n; i++) {
//            if (i==4){
//                continue;
//            }
//            //part1
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//
//            //part2- spaces
//            for (int j = 1; j <= 2 * (n - i); j++) {
//                System.out.print("  ");
//
//            }
//
//            //part3
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
//
//        //part4 {Use (n-row+1) to print reverse triangle}
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - i + 1; j++) {
//                System.out.print("* ");
//            }
//            //part5 - spaces (2*i-1)
//            for (int j = 1; j <= 2 * (i - 1); j++) {
//                System.out.print("  ");
//            }
//            //part6 - stars
//            for (int j = 1; j <= n - i + 1; j++) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }


        // numbered triangle
//        int n=6;
//        for (int i=1; i<=n;i++){
//            for (int j=1; j<=i;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

        //consequent number triangle
//        int n=5;
//        int count =1;
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(count + " ");
//                count++;
//            }
//            System.out.println();
//        }

        //alphabet right angle triangle

//        int n=5;

//        for(int i=1;i<=n;i++) {
//            for(int j=1;j<=i;j++) {
//                if(j==1) {
//                    System.out.print("A"+" ");
//                }
//                else if(j==2) {
//                    System.out.print("B"+" ");
//                }
//                else if(j==3) {
//                    System.out.print("C"+" ");
//                }
//                else if(j==4) {
//                    System.out.print("D"+" ");
//                }
//                else if(j==5) {
//                    System.out.print("E"+" ");
//                }
//            }
//            System.out.println();
//        }

        //OR (Short way)
//
//        for(int i=1;i<=n;i++) {
//            for(int j=1;j<=i;j++) {
//                int a = j;
//                int b = ('A'- 1);
//                int ans = a+b;
//                char finalAns = (char)ans;
//                System.out.print(finalAns+" ");
//            }
//            System.out.println();
//        }


        // alphabet triangle
//        int n = 5;
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                int a = n - j;
//                int b = 'A';
//                int ans = a+b;
//                char finalAns = (char)ans;
//
//                System.out.print(finalAns + " ");
//            }
//            System.out.println();
//        }

        //sand clock style
        //HW


        //numbered pyramid
//        int n=4;
//        for (int i = 1; i <= n; i++) {
//            //part1
//            for (int j = 1; j <= n-i; j++) {
//                System.out.print("  ");
//            }
//
//            //part2
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j+" ");
//            }
//
//            //part3
//            int rowval= i;
//            int decrowval= i-1;
//            for (int j = 1; j <= i-1; j++) {
//                System.out.print(decrowval+" ");
//                decrowval--;
//            }
//
//            System.out.println();
//        }


        //numbered pyramid again
//        int n=4;
//        for (int i = 1; i <= n; i++) {
//            //part 1
//            for  (int j = 1; j <= n-i; j++) {
//                System.out.print("  ");
//            }
//            //part 2
//            for (int j = 1; j <= 2*i-1; j++) {
//                System.out.print(i+ " ");
//            }
//            System.out.println();
//        }


        //alphabet pyramid
//        int n = 4;
//        for (int i = 1; i <= n; i++) {
//            //part1
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print("  ");
//            }
//            //part2
//            for (int j = 1; j <= i; j++) {
//                int a = j;
//                int b = 'A' - 1;
//                int ans = a + b;
//                char finalAns = (char) ans;
//                System.out.print(finalAns + " ");
//            }
//            //part3
//            char toPrint = (char) (i + 'A' - 2);
//            for (int j = 1; j <= i - 1; j++) {
//                System.out.print(toPrint + " ");
//                toPrint--;
//
//            }
//            System.out.println();
//        }


    }
}
