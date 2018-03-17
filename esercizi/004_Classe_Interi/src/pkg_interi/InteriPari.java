package pkg_interi;

public class InteriPari extends Interi
{
    /**
     * Costruttore di default. Il valore dell'intero viene impostato a zero.
     */
    public InteriPari()
    {
        super();
    }

    /**
     * Costruttore con inizializzazione del dato.
     * 
     * @param newValore
     *            il valore dell'intero
     */
    public InteriPari(int newValore)
    {
        this.set(newValore);
    }

    /**
     * Metodo protetto per l'inizializzazione del dato.
     * 
     * @param newValore
     *            il valore dell'intero.
     */
    protected void set(int newValore)
    {
        // Se il numero passato come argomento non è pari, il valore
        // viene impostato a zero.
        if (newValore % 2 == 0)
        {
            super.set(newValore);
        }
        else
        {
            super.set(0);
        }
    }
}
