/*
Open the .java file named Operations.java from the Needed Files folder provided for
you.
Write two methods named multiply and divide. The methods should have the following
headers:
public static int multiply(int a, int b)
public static int divide(int a, int b)
The multiply method should multiply the parameter a by the parameter b. However,
you may not use the multiplication operator (*). You may only use the existing methods
of add or subtract.
The divide method should use integer division to divide the parameter a by the
parameter b. However, you may not use the multiplication operator (*), the division
operator (/) or the mod (%) operator.
After you complete the multiply and divide methods, uncomment the commented lines
in the main method.
If you wrote the methods correctly, your output should match the sample output below.
Hint for the multiply method: A for-loop may come in handy.
Hint for the divide method: A while-loop may come in handy.
34 * 67 is 2278
3729 / 2 is 169


 */
public class Operations
{
    public static void main(String[] args)
    {
        int c = 3729, d = 2, e = 34, f = 67;
        System.out.println(e + " * " + f + " is " + multiply(e, f));
        System.out.println(c + " / " + d + " is " + divide(c, d));
    }

    public static int multiply(int a, int b)
    {//2*3 = 6, 2+2+2 =6
        int result = 0;
        for (int i = 0; i < Math.abs(b); i++) {
            result = result +Math.abs(a);
        }

        if(a< 0 || b<0)
        {
          result = -result;
        }
        return result;
    }
//6/2 =3 in other words
// 6-2=4 -> Quotient = 1,
// 4-2 = 2 -> Quotient = 2
// 2=2-2 = 1 -> -> Quotient = 3
    public static int divide(int a, int b) {
        int quotient = 0;
        int newA = Math.abs(a);
        int newB = Math.abs(b);

        while (newA >= newB) {
            newA -= newB;
            quotient++;
        }


        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            quotient = -quotient;
        }

        return quotient;
    }


}