package JavaBasics;

public class DataTypes {

//    main() method --> execution point
    public static void main(String[] args){
      /*Program to understand data types

        Primitive Data Types: int, char, double, boolean

        1. int
        Declare an integer
        i is akeyword and it should be in small letter
        i --> variable and 10 --> value*/
        int i =10;
//        new value is given to i
        i =20;

        System.out.println("i : " +i);
//        -1 is a integer number, 0 also a number but decimal number can not be declared using int
        int j = -1;
        int k = 0;

        System.out.println("j: "+j);

//        2. double
        double d = 12.35;
        double d1 = 13.45;
        double d2 = 100; // it will be treated as 100.00, Can store integer in double.

        System.out.println("d1: " +d1);

//        3. char - should be single digit value
        char c = 'a';
        char c1 = 'b';
        char c2 = '1'; //1 will be treated as character

//        4. Boolean: true or false, true and false are keywords available in Java
        boolean b1 = true;
        boolean b2 = false;

//        String: is a class not a data type, But can also be treated as data type.
        String s = "Hello World";
        String s2 = "Selenium";
        String s3 = "Hi this is my Java basic code";
        String s4 = "1000"; // Not an integer it will be treated as String
        String s5 = "12.33";

        System.out.println("s3: "+s3);

    }

}
