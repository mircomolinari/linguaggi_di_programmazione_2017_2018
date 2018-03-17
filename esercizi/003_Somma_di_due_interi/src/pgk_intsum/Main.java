package pgk_intsum;

public class Main
{
    /**
     * Stampa a schermo il risultato della somma di due interi passati come
     * argomento dalla linea di comando.
     * 
     * @param args
     *            due valori interi
     */
    public static void main(String[] args)
    {
        int value1 = Integer.parseInt(args[0]);
        int value2 = Integer.parseInt(args[1]);

        String sum = Integer.toString(value1 + value2);

        System.out.println("Somma: ".concat(sum));
    }
}
