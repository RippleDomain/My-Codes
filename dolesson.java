import java.util.Scanner;

public class dolesson {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int x = 0;
        int previous;
        int sum = 0;

        do
        {
            System.out.print("Enter an integer: ");
            previous = x;
            x = input.nextInt();
            sum = sum + x;
            System.out.println("The sum is: " + sum + ".");
        }
        while ( x != 0 && previous != x);

        input.close();
    }
}
