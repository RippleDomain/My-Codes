import java.util.Scanner;

public class ifclass2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("A's score is: ");
        int scoreA = input.nextInt();
        if (scoreA < 0){
            System.out.println("Error: Negative input.");
        }
        
        else {
        System.out.print("B's score is: ");
        }
        int scoreB = input.nextInt();
        if (scoreB < 0){
            System.out.println("Error: Negative input.");
        }
        
        else {
        

        if (scoreA > scoreB) {
            System.out.println("A has won the match.");
        }    

        if (scoreA < scoreB) {
            System.out.println("B has won the match.");
        }
            
        if (scoreA == scoreB) {
            System.out.println("A and B are tied.");
        }
    }

    System.out.print("Enter random number: ");
    int randomAhhNumber = input.nextInt();
    double sqrtRandomAhhNumber = Math.sqrt(randomAhhNumber);
    if (randomAhhNumber < 0){
        System.out.println("Error: Do not enter a negative value.");
    }
    else {
        System.out.println("The square root of " + randomAhhNumber + " is " + sqrtRandomAhhNumber);
    }

        input.close();
        }
        

    }
    

