void main() {
//    //Arithmetic  operator
//    int solvedThisWeek = 25;
//    int solvedLastWeek = 15;
//
//    int total = solvedThisWeek + solvedLastWeek;
//    // Adds both operands.
//    // 25 + 15 = 40
//    int difference = solvedThisWeek - solvedLastWeek;
//    //  25 - 15 = 10
//    int projected = solvedThisWeek * 4;
//    //  25 × 4 = 100
//    int average = solvedThisWeek / 7;
//    //  25 / 7 = 3
//    //Since both operands are integers, Java performs integer division.
//    //The decimal part (3.57) is discarded.
//    int remainder = solvedThisWeek % 7;
//    //  25 % 7 = 4
//    //  Because: 25 = (7 × 3) + 4
//
//    System.out.println(total);
//    System.out.println(difference);
//    System.out.println(projected);
//    System.out.println(average);
//    System.out.println(remainder);

//    //Assignment operator
//    int ratingPoints = 100;
//
//    ratingPoints += 20;  // ratingPoints = ratingPoints + 20
//    System.out.println(ratingPoints); //100+20
//    ratingPoints -= 10;  // ratingPoints = ratingPoints - 10
//    System.out.println(ratingPoints);//120-10=110
//    ratingPoints *= 2;   // ratingPoints = ratingPoints * 2
//    System.out.println(ratingPoints);//110*2=220
//    ratingPoints /= 4;   // ratingPoints = ratingPoints / 4
//    System.out.println(ratingPoints);//220/4=55
//    ratingPoints %= 30;  // ratingPoints = ratingPoints % 30
//    System.out.println(ratingPoints);//55%20=25


//    // Relational Operators
//    int currentStreak = 45;
//    int targetStreak = 50;
//
//    System.out.println(currentStreak == targetStreak);//45 == 50 → false
//    System.out.println(currentStreak != targetStreak);//45 != 50 → true
//    System.out.println(currentStreak > targetStreak);//45 > 50 → false
//    System.out.println(currentStreak < targetStreak);//45 < 50 → true
//    System.out.println(currentStreak >= targetStreak);//45 >= 50 → false
//    System.out.println(currentStreak <= targetStreak);//45 <= 50 → true


//    //Logical Operator
//    boolean completedDSA = true;
//    boolean completedCore = false;
//
//    System.out.println(completedDSA && completedCore);
//    //true && false → false
//    System.out.println(completedDSA || completedCore);
//    //true || false → true
//    System.out.println(!completedCore);
//    //!false → true


//    //Unary Operators
//    int activeUsers = 100;
//
//    int prefix = ++activeUsers;
//    //pehle activeUser increment hua and bngya --> 101
//    //fer prefix me copy hua, sp prefix ki value --> 101
//    int postfix = activeUsers++;
//    //activeUser = 101
//    // pehle use krte h, postfix me copy hoke, postfix -->101
//    //uske baad increment hua , activeUser --> 102
//
//    System.out.println(prefix);
//    //101
//    System.out.println(postfix);
//    //101
//    System.out.println(activeUsers);
//    //102


//    Initial value = 100
//
//            ++activeUsers → increment first → becomes 101
//
//    prefix = 101
//
//    activeUsers++ → assign first (101), then increment
//
//            postfix = 101
//
//    Final activeUsers = 102


//    //Bitwise Operators
//    int x = 6;  //6 in binary = 00000110
//    int y = 3;  //3 in binary =  00000011
//
//    System.out.println(x & y);//x & y → 00000010 → 2
//    System.out.println(x | y);//x | y → 00000111 → 7
//    System.out.println(x ^ y);//x ^ y → 00000101 → 5
//    System.out.println(~x);//~x → bitwise flip
//    System.out.println(x << 1);//x << 1 → left shift → multiply by 2
//    System.out.println(x >> 1);//x >> 1 → right shift → divide by 2

//    //Instance operator
//    String track = "CodeHelp ONE";
//
//    boolean result = track instanceof String;
//
//    System.out.println(result);


    //Ternary operator
    //Shorthand for if-else.


    int solvedProblems = 320;

    String level = (solvedProblems >= 300) ? "Advanced" : "Intermediate";

    System.out.println(level);



}