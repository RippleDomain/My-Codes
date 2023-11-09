public class whilesson {
    public static void main(String[] args){

        int i = 0;
        int sum = 0;

        while (sum < 10)
        {
            i++;
            sum = sum + i;
            System.out.println("i: " + i);
            System.out.println("sum: " + sum);
        }

        int n = 1;
        
        while (n < 100)
        {
            n = n * 2;
            System.out.println(n + " ");
        }
    }
}
