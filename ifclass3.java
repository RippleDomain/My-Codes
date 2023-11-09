import java.util.Scanner;

public class ifclass3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        int temp = input.nextInt();
        
        // write the code so that it gives an error when u enter something thats not an integer
        
        if (temp == 0){
            System.out.println("Is at 0 degrees Celcius.");
        }
        
        if (temp == 100){
            System.out.println("Is at 100 degrees Celcius.");
        }

        if (temp < 100 && temp > 0){
            System.out.println("Liquid");
        }

        if (temp > 100){
            System.out.println("Gas");
        }

        else if (temp < 0){
            System.out.println("Solid");
        }


        System.out.print("Enter integer 1: ");
        int int1 = input.nextInt();
        System.out.print("Enter integer 2: ");
        int int2 = input.nextInt();

        if (int1 == 0 && int2 == 0){
            System.out.println("Both of these integers are 0.");
        }
        
        else if (int1 == 0 || int2 == 0){
            System.out.println("One of these integers is 0.");
        }
        
        if (!(int1 == 0 || int2 == 0)){
            System.out.println("Neither of these integers are 0.");
        }

        input.close();
    }
}
