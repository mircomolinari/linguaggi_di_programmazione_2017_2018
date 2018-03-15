package pkg_orologio;

/**
 * Driver per la classe 'Orologio'.
 */
public class Main
{
    public static void main(String[] args)
    {
        Orologio myOrologio = new Orologio();

        for (int count = 0; count < 1439; count++)
        {
            myOrologio.tic();
        }

        System.out.println("Orario ->  " + myOrologio.getOrario());
    }
}
