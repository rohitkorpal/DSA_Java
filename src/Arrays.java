import java.util.Scanner;

public class Arrays {
    static void main() {

        // Q1 sum
//        int arr[]= {23,54,22,23,43};
//        int sum=0;
//        int n= arr.length;
//        for (int i=0;i<=n-1;i++) {
//            sum+=arr[i];
//        }
//        System.out.println(sum);

        // Q2 multiply
//        int []arr= {2,2,2,2};
//        int mul=1;
//        int n= arr.length;
//        for (int i=0;i<n;i++) {
//            mul=mul*arr[i];
//        }
//        System.out.println(mul);

        // Q3 to find maximum element in an array
//        int [] arr= {30,2,4,28,-5,35};
//        int n= arr.length;
//        int maxValue= arr[0];
//
//        for(int i=0;i<n;i++) {
//            if(arr[i]>maxValue) {
//                maxValue=arr[i];
//            }
//        }
//        System.out.println(maxValue);


        //Q4 find the minimum value in an array

//        int[] arr = {3, 4, 1, -5, -2, 10};
//        int n = arr.length;
//        int minValue = arr[0];
//
//        for (int i = 0; i < n; i++) {
//            if (arr[i] < minValue) {
//                //minValue Update
//                minValue = arr[i];
//            }
//        }
//        System.out.println(minValue);


//        int arr[]= {12,34,22};
//        int n = arr.length;
//        for (int i=0; i<=n-1; i++){
//            System.out.println("value of array is:"+ arr[i]);
//        }


//        int arr[] = new int[5];
//        Scanner sc = new Scanner(System.in);
//        int n = arr.length;
//        // for input
//        for (int i = 0; i <= n-1; i++) {
//            System.out.println("provide input for index" + i + ":");
//            arr[i] = sc.nextInt();
//        }
//        // fot output
//        System.out.print("your array is:");
//        for (int val : arr) {
//            System.out.println(val);
//        }


        // array is a type of DS / container used to store same type of data
        // array works on continuous memory

        // declaration
        //int arr[];

        // allocation
        //arr = new int[3];

        // initialisation
        //int brr[] = {23, 43, 34};

        // indexing for accessing elements in array
//        System.out.println(brr[0]);
//        System.out.println(brr[1]);
//        System.out.println(brr[2]);

        // using loops

        //way 1
//        int n = brr.length;
//        for (int index = 0; index <= n - 1; index++) {
//            System.out.println(brr[index]);
//        }

        // way 2
//        for (int val: brr){
//            System.out.println(val+" ");
//        }

        //for input
        //arr[1]= sc.next int()


        // 2D ARRAYS

        // for searching an element in 2d array - arr[row index] [column index]
        // 2D array is simply a matrix
        // we read in matrix form but hota wo 1D array ki trh single and continuous hi
        // declaration
//         int [][] matrix ;
//         initialization
//         int [][] matrix = new int [3][3];
//         OR
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//        };
//        // indexing 0 se start hoti hai - row/column(0,1,2.......)
//        //System.out.println(matrix[2][2]);
//        int ilength = matrix.length;
//        int jLength = matrix[0].length;// ye no. of column nikalna ka tareka tbhi kaam krega jb hr row mai same column honge. column ka lia row ka 0 element ko pkdo aur iterate krdo
//        for (int i = 0; i <=ilength-1; i++) {
//            for(int j=0; j<= jLength-1; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }


        int[][] matrix = {
                {1,},
                {4, 5},
                {7, 8, 9},
        };

        int rowLength = matrix.length;


    }
}
