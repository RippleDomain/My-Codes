import java.util.Scanner;

public class sentinelvalues {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        int nextValue = 0;
        int sum = 0;
        int counter = 0;

        do
        {
            System.out.print("Enter the next value: ");
            sum += nextValue;
            counter++;
            nextValue = input.nextInt();
        }while (nextValue >= 0);
        counter--;

        if (counter > 0)
        {
        double average = (1.0 * sum) / counter;
        System.out.println("Average is: " + average);
        }
        else
        System.out.println("No valid input detected.");
        
        input.close();
    }
}
