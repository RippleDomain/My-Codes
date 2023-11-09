import java.util.Scanner;

public class ifclass {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age (between 1 and 150): ");
        int age = input.nextInt();
        
        if(( age > 150 ) || ( age < 1 )){
            System.out.println("The age you entered is invalid.");
        }

        else if(( age <= 24 ) && ( age >= 14 )){
            System.out.println("Young");
        }

        else if( age > 24){
            System.out.println("Adult");
        }

        else{
            System.out.println("Child");
        }

        String one = "Domain Expansion";
        String two = "Domain Amplification";

        if(one.equals("Domain Expansion")){
          System.out.println("Domain Expansion");
          System.out.println("Malevolent Shrine");
        }


        if(two.equals("Domain Amplification"))
            System.out.println("Hanami dies.");


        input.close();
    }

    
}