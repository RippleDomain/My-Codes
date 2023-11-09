import java.util.Scanner;

public class compareto {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your friend's name: ");
        String friendName = input.nextLine();
    
        if(name.compareTo(friendName)<0){
            System.out.println(name + " is better than " + friendName);
        }

        else{
            System.out.println(friendName + " is better than " + name);
        }
        
        input.close();
        
    }

    
}
