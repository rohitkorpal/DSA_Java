import java.util.Scanner;

public class Strings {
    static <scanner> void main() {
        // string is a sequence of characters
        // character uses ' ' & string uses " "
        // String str = "Rohit"  <--- declaration (way 1 using string literal)
        // 2nd is using new keyword ---> string str = new string ("Rohit");
        // Heap memory mai String pool mai string memory leta ha
        // agar suppose rohit 2 different variables mai hai toh dono ko alg memory allocate nhi hogi ek hi hogi jisko dono refer krega
        // when we create new string to string ko pahle memory allocate nhi hoti. pahle pool check kia jata hai ki wo string phle
        // -- se hi hai pool mai ya nhi agr hogi toh usko hi refer krdega.
        // jo string declaration ka time variable declare krega wo jayega stack memory mai aur jo "string create hogi " wo jayega heap memory mai
        // string is immutable but reference shifting is possible

//        String firstName= "rohit";
//        String lastName= new String("korpal");
//        System.out.println(firstName+" "+lastName);
//        //System.out.println(firstName[0]); wrong way
//        System.out.println(firstName.length()); //count of character
//        System.out.println(lastName.charAt(0));


        // reference shifting
//        String str = "rohit";
//        str = "korpal";
//        System.out.println(str);


        // compare strings
        // 1- ==
        // 2- .equals()
        // 3- .equalsIgnoreCase()

//        String str1 = "abc";
//        String str2 = "ABC";
//        if (str1==str2) { // (==) does not compare the content but they check whether the variable are referring to same place or not
//            System.out.println("both are equal");
//        }else  {
//            System.out.println("both are not equal");
//        }

        // .equals() --> checks the inner content of variable and not just the reference. it is case-sensitive
        // .equalsIgnoreCase --> matches the inner content but is not case-sensitive [ignores cases just checks the letters]

//        String str1 = "abc";
//        String str2 = "ABC";
//        if (str1.equals(str2)) { //case-sensitive
//            System.out.println("both are equal");
//        }else  {
//            System.out.println("both are not equal");
//        }

//        String str1 = "abc";
//        String str2 = "ABC";
//        if (str1.equalsIgnoreCase(str2)) { //case-insensitive
//            System.out.println("both are equal");
//        }else  {
//            System.out.println("both are not equal");
//        }

        // String input
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a string: ");
//        String str = sc.nextLine();
//        System.out.println("value of next line: "+ str);
//
//        System.out.println("Enter a string: ");
//        String str2 = sc.next();
//        System.out.println("value of next: "+ str2);

        // Strings methods//

//        String str ="rohit";
//        System.out.println(str.length());
//        System.out.println(str.charAt(0));
//        String name = "ROHIT";
//        System.out.println(str.equals(name));
//        System.out.println(str.equalsIgnoreCase(name));

        //EMPTY --> string length = 0 then string is empty
        //blank --> empty or sirf spaces h string mai
//        String str = "  ";
//        System.out.println(str.length());
//        System.out.println(str.isEmpty());
//        System.out.println(str.isBlank());

//        String name= "    Rohit      ";
//        System.out.println(name.length());
//        System.out.println(name.isEmpty());
//        System.out.println(name.isBlank());
//        name = name.trim();
//        System.out.println(name);
//        System.out.println(name.length());

//        String name ="Rohit";
//        System.out.println(name.toUpperCase());
//        String str = "ROHIT";
//        System.out.println(str.toLowerCase());

//        String str = "MY NAME IS ROHIT KORPAL";
        // 0--> M
        // 1-->Y
        // 2-->space and so on
        //beginningIndex--> 3 --> inclusive
        //endIndex--> 6 --> exclusive(not included in substring)
//        System.out.println(str.substring(3,6));
//        System.out.println(str.contains("MY NAME"));// case sensitive

//        int num= 5123;
        //.valueOf() method is used to convert different data types (like int, float, boolean, char, arrays, or objects) into their corresponding String.
//        String str = String.valueOf(num);
//        System.out.println(num+1);
//        System.out.println(str + 1); // string mai +1 is concatenation

//        String name ="My name is Rohit";
//        System.out.println(name.startsWith("My name"));
//        System.out.println(name.endsWith("Rohit"));

        String name ="Rohit";
        char[] chars = name.toCharArray();

        //print the char array
        for(char ch : chars){
            System.out.println("value of char:"+ ch);
        }



    }
}
