package pkg_interi;

public class Interi
{
    private int valore;

    /**
     * Costruttore di default. Il valore dell'intero viene impostato a zero.
     */
    public Interi()
    {
        this.set(0);
    }

    /**
     * Costruttore con inizializzazione del dato.
     * 
     * @param newValore
     *            il valore dell'intero
     */
    public Interi(int newValore)
    {
        this.set(newValore);
    }

    /**
     * Stampa a schermo il valore dell'intero.
     */
    public void stampa()
    {
        System.out.print(Integer.toString(this.valore));
    }

    /**
     * Metodo protetto per l'inizializzazione del dato.
     * 
     * @param newValore
     *            il valore dell'intero.
     */
    protected void set(int newValore)
    {
        this.valore = newValore;
    }
}
