package pkg_interi;

/**
 * Driver per le classi Interi e InteriPari.
 */
public class Prova
{
    /**
     * Stampa i primi n numeri interi non negativi. Il valore di n può essere
     * passato come argomento dalla riga di comando.
     * 
     * @param args
     *            il numero di valori da stampare
     */
    public static void main(String[] args)
    {
        // Crea un array di Interi della lunghezza specificata.
        final int length = Integer.parseInt(args[0]);
        Interi[] valori = new Interi[length];

        // Se count è dispari, viene aggiunto all'array come elemento
        // della classe Interi. Altrimenti come elemento
        // della classe InteriPari.
        for (int count = 0; count < length; count++)
        {
            if (count % 2 == 0)
            {
                InteriPari myInt = new InteriPari(count);
                valori[count] = myInt;
            }
            else
            {
                Interi myInt = new Interi(count);
                valori[count] = myInt;
            }
        }

        // Stampa i valori contenuti nell'array.
        for (Interi i : valori)
        {
            i.stampa();
            System.out.print(" ");
        }
        System.out.println("");
    }
}
