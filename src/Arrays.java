import java.util.Scanner;

public class Arrays {
    static void main() {

        //An array is a collection of elements of the same data type stored in continuous memory locations.

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


//        int[][] matrix = {
//                {1,},
//                {4, 5},
//                {7, 8, 9},
//                {10, 11, 12, 43},
//        };
//
//        int rowLength = matrix.length;

//        for(int i = 0; i < rowLength; i++) {
//            // jaise hi main kisi new row ma aaya
//            // same point pr maine uss row ka colLength find out krlia
//            // current row --> matrix[i]
//            // isme kitna columns--> matrix[i].length
//            int colLength = matrix[i].length;
//            for(int j = 0; j < colLength; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }

        //traversal 2D arrays [SHORT WAY]

//        int[][] matrix = {
//                {1,},
//                {4, 5},
//                {7, 8, 9},
//                {10, 11, 12, 43},
//        };
//        for (int i=0; i<= matrix.length-1; i++) {
//            for (int j=0; j<= matrix[i].length-1; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }


        // taking user input in 2D array

//        int arr [][] = new int[3][4];
//        Scanner sc = new Scanner(System.in);
//
//        for (int i = 0; i <= arr.length-1; i++) {
//            for (int j = 0; j <= arr[i].length-1; j++) {
//                System.out.println(i + " " + j);
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        for (int i = 0; i <= arr.length-1; i++) {
//            for (int j = 0; j <= arr[i].length-1; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }


        // Q1 sum elemennts of 2D array
//        int[][] matrix = {
//                {1,},
//                {4, 5},
//                {7, 8, 9},
//                {10, 11, 12, 43},
//        };
//        int sum= 0;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                sum = sum + matrix[i][j];
//            }
//        }
//        System.out.println(sum);

        //Q2 multiply
//        int[][] matrix = {
//                {1,},
//                {2, 3},
//                {1, 2, 3},
//                {1, 1, 2, 3},
//        };
//        int mul= 1;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                mul = mul * matrix[i][j];
//            }
//        }
//        System.out.println(mul);

        // max value in 2D array
//        int[][] matrix = {
//                {1,},
//                {4, 5},
//                {7, 8, 9},
//                {10, 11, 12, 43},
//        };
//        int maxVal= 0;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if  (matrix[i][j] > maxVal) {
//                    maxVal = matrix[i][j];
//                }
//            }
//        }
//        System.out.println(maxVal);

        //Q4 min value
//        int[][] matrix = {
//                {1,},
//                {4, 5},
//                {7, 8, 9},
//                {10, 11, 12, 43},
//        };
//        int minVal= matrix[0][0];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if  (matrix[i][j] < minVal) {
//                    minVal = matrix[i][j];
//                }
//            }
//        }
//        System.out.println(minVal);


        // Q reverse of an 1D array

//        int [] arr = {1,2,3,4,5,6,7,8,9,10};
//
//        int start= 0, end = arr.length-1;// these are the indexes and not the va;ue of arrays
//        while(start<end){//checks the index
//            int temp = arr[start];
//            arr[start]= arr[end];
//            arr[end]= temp;
//            // Because the elements at index 0 and 4 are already in their final reversed positions. so we move the pointers inwards
//            start++;// move from left toward center
//            end--;// move from right toward center
//        }
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }


        // LINEAR SEARCH ALGORITHM
        // for searching a single element
//        int arr[]= {23,53,13,55,86,32,55};
//        int target = 53 ;
//        for (int i=0; i<arr.length; i++) {
//            if (arr[i] == target) {
//                System.out.print(arr[i]);
//            }
//        }

        // for searching multiple elements in an array
//        int[] arr = {23, 53, 13, 55, 86, 32, 55};
//        int[] target = {53, 13};
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < target.length; j++) {
//                if (arr[i] == target[j]) {
//                    System.out.println(arr[i]);
//                }
//            }
//        }

        // transpose of a 2D matrix

        int [][]matrix ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int j=0; j< matrix[0].length; j++) {
            for (int i=0; i<matrix.length; i++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }


    }
}
