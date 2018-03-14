package pkg_counter;

/**
 * Driver per la classe 'Counter'.
 */
public class Main
{
    public static void main(String[] args)
    {
        Counter myCounter = new Counter();

        myCounter.increment();
        int myValue = myCounter.getValue();

        System.out.println(myValue);
    }
}
