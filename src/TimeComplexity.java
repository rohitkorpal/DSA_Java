public class TimeComplexity {
    //time complexity - it is just an entity by which we measure time taken by our program depending on your input size
    //space complexity - it is just an entity by which we measure space taken by our program
    //time complexity is measured in terms of big O notation
    //space complexity is measured in terms of big O notation
    //time complexity is measured in terms of number of operations performed by our program

    // Time Complexity measures: How the number of operations grows with input size
    //  It does NOT measure actual time (seconds)
    //-> It measures growth of operations

    // Space Complexity measures: How much extra memory your program uses

    // O(1) --> Constant [meaning]
    // O(n) --> Linear [meaning]
    // O(n^2) --> Quadratic [meaning]
    // O(log n) --> Logarithmic [meaning]

    // time and space complexity order
    // [Smallest] O(1) < O (logn) < O ( Sqrt n) < O (n) < O (nlogn) < O (n^2) < O (n^3) < O (2^n) < O (n!) < O (n^n) [Biggest]

    // Big O --> worst case / upper bound --> no. of comparison in worst case is 'n' comparison --> O(n)
    // Theta Θ --> average case --> no. of comparison in average case is 'n/2' comparison --> Θ(n)
    // Omega Ω --> best case / lower bound --> no. of comparison in best case is '1' comparison --> Ω(1)

    // ignore constants
    // O (2n) --> O (N)

    //space complexity of variables is constant chahe kitna bhi banao ie O(1)

    // O(1) - constant time
    // No matter input size: op remains constant. always same work ie --> O(1)
//    int x= 10;
//    System.out.println(x);

    //O(n) - linear time
    // work grows linearly with input size
    // loop runs n times.
    //for (int i = 0; i < n; i++) {
    //    System.out.println(i);
    // }

    //O(n^2) - quadratic time
    // work grows quadratically with input size
    // nested loop runs n*n= n^2 times.
    //for (int i = 0; i < n; i++) {
    //    for (int j = 0; j < n; j++) {
    //        System.out.println(i + " " + j);
    //    }
    //}

    //O(logn) - logarithmic time
    // work grows logarithmically with input size
    // loop runs logn times.
    // NUMBER OF STEPS = LOGN
    //for (int i = 1; i < n; i = i * 2) {
    //    System.out.println(i);
    //}

    //How to Calculate Time Complexity
    // 1. ignore constants
    // for (int i = 0; i < 2*n; i++) {
    //    System.out.println(i);
    //}
    // -> O(2n) = O(n)

    // 2. drop lower terms
    // O(n² + n) = O(n²)
    // -> Only highest term matters

    // 3. Nested Loops Multiply
    // for (i = 0; i < n; i++)
    //     for (j = 0; j < n; j++)
    // -> O(n × n) = O(n²)

    // 4. Separate Loops Add
    // for (i = 0; i < n; i++)
    // for (j = 0; j < n; j++)
    // --> O(n + n) = O(n)

    // 5.  Condition-Based Loops
    // for (int i = 1; i < n; i *= 2)
    // -> O(log n)

    // Practice Problems

    // 1
    // for (int i = 0; i < n; i++) {
    //    System.out.println(i);
    //}
    // -> O(n) ; run n times

    // 2
    //for (int i = 0; i < n; i++) {
    //    for (int j = 0; j < n; j++) {
    //        System.out.println(i + j);
    //    }
    //}
    // -> O(n²) ; run n*n times

    // 3
    //for (int i = 0; i < n/2; i++) {
    //    System.out.println(i);
    //}
    // -> O(n) ; run n/2 times -> ignore constant


    //Qyestions
    //1. O(n)
    //2. O(n^2)
    //3. O(logn)
    //4. O(n*m)
    //5. O(n)


}
