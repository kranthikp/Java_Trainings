package learnings;

public class Day2_Learning {
    public static void main( String [] args){
        // single line comment

        /** multi line comment
         *  data types:
         *  primitive  - int, short, float, double, boolean, char,
         *  non-primitives - String, Object
         *  variables:
         *  any identifier that stores a value of a particular data type
         *  ex: consider the expression
         *  int sum = 10;
         *  sum is a variable of int datatype and has 10 value assigned to it using '=' operator.
         **/

        // variable, datatype, operator and expressions
        int age = 30;
        boolean flag = true;
        char initial = 'p';
        double num = 4.3d;
        String string = "This is sample String";

        // print on console
        System.out.println(age);
        System.out.println(flag);
        System.out.println(initial);
        System.out.println(num);

        // control statements - simple, if-else, switch-case...
        if (age>18){
            System.out.println("adult");
        }
        else{
            System.out.println("teenager");
        }

        int [] numbers = {10, 20, 30, 40};
        System.out.println(numbers[1]);
        System.out.println(numbers.length);

        // for loop
        System.out.println("print all array values");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}