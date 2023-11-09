import java.util.Scanner;

public class stringintconversion {
    public static void main(String[] args){

        String str = "756";
        int value = Integer.parseInt(str);
        System.out.println(value);

        String name = "Sally";
        String name2 = name.substring(1, 3);
        String name3 = name.substring(0, 3);
        String name4 = name.substring(4,5);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);

        String java = "Java Program";
        String java2 = java.substring(8, 12);
        System.out.println(java2);


        Scanner input = new Scanner(System.in);
        
        String fn = "Your first name is: ";
        String mn = "Your middle name is : ";
        String ln = "Your last name is: ";

        System.out.print(fn);
        String fn1 = input.nextLine();
        System.out.print(mn);
        String mn1 = input.nextLine();
        System.out.print(ln);
        String ln1 = input.nextLine();

        String mn2 = mn1.substring(0, 1) + ".";


        System.out.println("Your full name is " + fn1 +" " + mn2 + " " + ln1);

        input.close();
    }
}
