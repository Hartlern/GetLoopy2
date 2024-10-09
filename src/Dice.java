import java.util.Random;

public class Dice
{
    public static void main( String[] args )
    {
        int roll = 0;
        int die1;
        int die2;
        int die3;
        Random random = new Random();

        System.out.printf( "%-5s %-10s %-10s %-10s %-10s%n", "Roll", "Die1", "Die2", "Die3", "Sum" );
        System.out.println( "----------------------------------------------------------" );

        do
        {
            die1 = random.nextInt( 6 ) + 1;
            die2 = random.nextInt( 6 ) + 1;
            die3 = random.nextInt( 6 ) + 1;
            roll++;

            System.out.printf( "%-5d %-10d %-10d %-10d %-10d%n", roll, die2, die2, die3, die2 + die2 + die3 );
        }
        while( die1 != die2 || die2 != die3 );
    }
}



