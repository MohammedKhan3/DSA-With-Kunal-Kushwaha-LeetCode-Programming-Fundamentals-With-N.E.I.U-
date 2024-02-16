

/*
Create a new .java file named SortNumbers.java.
Write a method that has the following header:
public static void displaySortedNumbers(int a, int b, int c)
The method should display three numbers in increasing order.
In the main method, ask the user to enter three numbers. Use/invoke the
displaySortedNumbers method to display the entered numbers in order.
Your output should match the sample output below.
Enter a number: 10
Enter a number: 3
Enter a number: 17
3 10 17
Enter a number: 4
Enter a number: -6
Enter a number: -8
-8 -6 4



 */
import java.util.*;
public class SortNumbers {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = kbd.nextInt();
        System.out.println("Enter a number : ");
        int b = kbd.nextInt();
        System.out.println("Enter a number : ");
        int c = kbd.nextInt();
        displaySortedNumbers(a,b,c);
        }

        /*
            without using any arrays...
         */
        public static void displaySortedNumbers(int a, int b, int c){

        int maxNumber = Math.max(a,Math.max(b,c));
        int minNumber = Math.min(a,Math.min(b,c));
        int middleNumber = a+b+c -maxNumber -minNumber;
        System.out.println(minNumber + " " + middleNumber + " " + maxNumber);
        }


    }
