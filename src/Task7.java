public class Task7
{
    public static void main( String[] args )
    {
        final int ROW = 5;
        final int COL = 5;

        for( int row = 0; row < ROW; row++ )
        {
            for( int col = 0; col < COL; col++ )
            {
                System.out.print( "*" );
            }
            System.out.print( "\n" );
        }
    }
}
