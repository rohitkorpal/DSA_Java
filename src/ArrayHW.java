public record ArrayHW() {
    static void main() {

        //Q1 print diagonal element
//        int [][] matrix = { {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        int n= matrix.length;
//        //System.out.println("matrix.length = " + n);
//        for (int i=0; i<n; i++) {
//            System.out.println(matrix[i][i]+" ");
//        }

        //Q2 print anti-diagonal
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        int n = matrix.length;
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(matrix[i][n - 1 - i] + " ");
//        }

        //Q3 Sum of diagonals
//        int [][] matrix = { {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        int sum = 0;
//        int n= matrix.length;
//        for (int i=0; i<n; i++) {
//            sum += matrix[i][i];
//        }
//        System.out.println(sum);

        //Q4 Search element in matrix
//        int[][] matrix = {{1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        int target = 5;
//        int n = matrix.length;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (matrix[i][j] == target) {
//                    System.out.println("Found at row " + i + " column " + j + " = " + target);
//                }
//            }
//        }

        //Q5 to check if a matrix is symmetric
        // for a matrix to be symmetric--> matrix[i][j] == matrix[j][i]
//        int[][] matrix = {{1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        boolean isSymmetric = true;//if we start with false then we have to wait until all comparisons are finished.
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//
//                if (matrix[i][j] != matrix[j][i]) {
//                    isSymmetric = false;
//                    break;//only exits inner loop
//                }
//            }
//
//            //without this code then after finding one mismatch, the program would still continue checking:
//            if (!isSymmetric) {
//                break;//exits outer loop
//            }
//        }
//
//        if (isSymmetric) {
//            System.out.println("Matrix is Symmetric");
//        } else {
//            System.out.println("Matrix is Not Symmetric");
//        }

        //Q6--> V.IMP - spiral matrix #Leetcode problem 54
        // spiral?- It keeps going around the outer boundary and then moves inward.







    }
}
