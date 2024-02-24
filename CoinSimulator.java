import java.util.Random;

/*
 Write a program that has the class name Problem1 and that has the main method.
• Write a program that simulates flipping a coin one million times and displays the number
of heads and tails.
• Remember that you can represent a flip that results in heads using the number 0 and a
flip that results in tails using the number 1 (or vice-versa!).
• Several sample runs are provided for you below. Your output must be formatted exactly
like the sample runs below. Note that while your output must be formatted as below, you
will not get the same results as this uses random numbers.
Heads: 500178
Tails: 499822
500178 Heads + 499822 Tails is 1000000 flips
 */
public class Problem1 {
    public static void main(String[] args) {
        final int Flips = 1000000;
         int heads =0;
         int tails = 0;
         Random rand = new Random();
        for (int i = 0; i < Flips; i++) {
            if(rand.nextInt(2)==0){
                heads++;
            }else{
                tails++;
            }
        }
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
        System.out.println(heads + " Heads + " + tails + " Tails is " + Flips + " flips");
    }
}
