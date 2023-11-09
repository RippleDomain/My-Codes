public class loopslastlesson {
    
    public static void main(String[] args){

        final int ROWS = 10;
        for (int i = 1; i <= ROWS; i++)
        {
            //Displaying spaces.
            for (int j = 1; j <= ROWS - i; j++)
            {
                System.out.print(" ");
            }

            //Displaying stars.
            for (int j = 1; j <= i; j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
