public class Loops {
    static void main() {

        //Loops help in:

        //reducing repetition
        //writing shorter code
        //solving pattern problems
        //processing arrays and strings
        //implementing DSA logic
        //handling repeated input/output

// set of operation to be performed repeatedly then loops are used
        //for loop
        //for (initialization[Runs only once at the beginning.]; condition[If condition is true → loop runs,If condition is false → loop stop]; update[Changes loop variable after each iteration.])
        // {
        // code
        //}

//    for (int i=1; i<=5; i=i+2){
//    System.out.println("value of i: "+ i);
//        }

        //4*4 star matrix
//        for (int i=1; i<=4; i++){
//            for (int j=1;j<+4; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //Simple Star Pyramid Pattern
        int n = 5;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
// nested loop
//        for (int i=1; i<=3; i++) {
//            for (int j=1; j<=3; j++){
//                System.out.println("i="+i+",j="+j);
//            }
//        }
// break keyword
//        for (int i = 1; i <= 10; i++) {
//            if (i == 5) {
//                break;// jaise hi break keyword miljaye toh current loop exit krdo
//            }
//            System.out.println(i);
//        }

//        //continue keyword
//        for (int i = 1; i <= 10; i++) {
//            if (i == 5 || i == 6 || i == 7 || i == 8 || i == 9) {
//                continue;// jaise continue keyword mila direct updation of loop pr pahunch jau
//            }//jaise yaha pe case 5,6,7,8,9 skip hgye
//            System.out.println(i);
//        }

        //while loop- It keeps running while the condition remains true.
        //Syntax
//        while (condition) {
//            // code
//        }

//        int count = 1;//initialization
//
//        while (count <= 5) {//condition
//            System.out.println(count);
//            count++;//update
//        }

// nested while loop
//        int i=1;
//        while(i<=2) {
//            int j=1;
//            while(j<=3) {
//                System.out.println("i:"+i+" j:"+j);
//                j++;
//            }
//            i++;
//        }

        //do while loop syntax
//        do {
//            //code to execute
//        } while (condition);

        int i=1;
        do {
            System.out.println(i);
            i++;
        }while(i<10);




    }
}
