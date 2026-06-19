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
        int []arr= {2,4,5,3};
        int mul=1;
        int n= arr.length;
        for (int i=0;i<n;i++) {
            mul=mul*arr[i];
        }
        System.out.println(mul);



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



    }
}
