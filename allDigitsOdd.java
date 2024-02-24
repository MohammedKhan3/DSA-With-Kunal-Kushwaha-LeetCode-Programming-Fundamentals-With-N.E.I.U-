/*
Problem 3.
• Write a program that has the class name Problem3 and that has the main method. Leave
the main method empty for now.
• Write a method named allDigitsOdd that takes one parameter, an integer n and returns
a boolean.
• Determine whether every digit of the parameter n is odd. Your method should return
true if the number consists entirely of odd digits and false if any of its digits are even.
0, 2, 4, 6 and 8 are even digits, and 1, 3, 5, 7, 9 are odd digits.
• Hint: You can pull apart a number using / 10 and % 10.
• Several sample usages are provided for you below. Use the sample usages in the main
method to test your code.
Sample Method Usage Return value
boolean b1 = allDigitsOdd(73925); false
boolean b2 = allDigitsOdd(59175); true
boolean b3 = allDigitsOdd(530); false
boolean b4 = allDigitsOdd(31); true


 */
public class Problem3 {
    public static void main(String[] args) {

        boolean b1 = allDigitsOdd(73925);
        System.out.println("All digits of 73925 are odd: " + b1); // Expected: false

        boolean b2 = allDigitsOdd(59175);
        System.out.println("All digits of 59175 are odd: " + b2); // Expected: true

        boolean b3 = allDigitsOdd(530);
        System.out.println("All digits of 530 are odd: " + b3); // Expected: false

        boolean b4 = allDigitsOdd(31);
        System.out.println("All digits of 31 are odd: " + b4);

    }
    public static boolean allDigitsOdd(int n){
        while(n>0){
            int digit = n %10;
            if(digit%2==0) return false;
            n/=10;
        }
        return true;
    }
}
