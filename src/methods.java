public class methods {

    //method declaration/definition
    static void print2table(){
        for (int i = 1; i <= 10; i++) {
            int ans=2*i;
            System.out.println("-->" + ans);
        }

    }
    static void printSum(int a,int b){
        int sum=a+b;
        System.out.println("-->"+sum);
    }
     static void printMultiplication (int a,int b){
        int ans =a*b;
        //return; unreachable statement aayega --> forcefull return
        System.out.println("-->"+ans);
        return;// koi need nhi becz line 17 pe apna aap return ho hi jayega
    }
    static int add(int a,int b){
        int sum=a+b;
        return sum;
    }
    static int add(int a,int b, int c){
        int sum=a+b+c;
        return sum;
    }
    //call by value
    static void solve(int num){
        System.out.println("inside solve : "+ num);
         num= num*10;
        System.out.println("inside solve : "+ num);

    }

    static void main() { //no parameter fnc

        // methods make code modular and easy to debug
        // they make code easy to debug
        //syntax
//        returnType methodName (parameters){
//            //method body
//        }
        // method signature mai return type, fnc ka name and uska parameter aata hai
        // return; --> return kr jao aaga ka code nhi dekhna.
        // void returns nothing
        // non void returns a value like return sum;
        //Method Call stack--> based on LIFO principle -->what type of data is stored hen a method goes ib a call stack

//        EX1
//        System.out.println("hi");
//        //method call
//        print2table();
//        System.out.println("bye");

        // EX2
        //these are arguments
        //printSum(5,10 );

        //EX3
        //printMultiplication(20,32);

        //EX4
//        int result = add(2, 43);
//        System.out.println(result);

        // METHOD OVERLOADING- TWO METHOD WITH SAME NAME BUT DIFF PARAMETERS
//        int ans1=add(1,2);
//        int ans2= add(3,5,6);
//        System.out.println(ans1);
//        System.out.println(ans2);


        //call by value
        int num=5;
        System.out.println("inside main() : "+ num);
        solve(num);
        System.out.println("inside main() : "+ num);


    }// closing brace --> fnc body is executed, now go back , return kr jao
}
