package HW1MATEYKO;

public class HomeWorkApp
    {
    public static void main(String[] args){
        printThreeWords();
        checkSumSign( 6, -7 );
        printColor(10);
        compareNumbers(6,6);
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    private static void printThreeWords()
    {
        System.out.println("Orange\nBanana\nApple");
    }

    private static void checkSumSign( int a, int b )
    {
        int result = a + b;
        System.out.println("result: " + result);
        String SimbolResult = (result < 0 ) ? "отрицательная" : "положительная";
        System.out.println("Сумма " + SimbolResult );
        System.out.println("Суммирование завершено");
    }

    private static void printColor( int value )
    {
        if( value <= 0 )
        {
            System.out.println( ANSI_RED + "Красный" + ANSI_RESET );
        }
        else if ( value <= 100 )
        {
            System.out.println(ANSI_YELLOW + "Желтый" + ANSI_RESET);
        }
        else
        {
            System.out.println(ANSI_GREEN + "Зеленый" + ANSI_RESET);
        }
    }

    private static void compareNumbers( int a, int b)
        {
            String Result = (a >= b ) ? "a >= b" : "a < b";
            System.out.println( Result );
        }
    }


