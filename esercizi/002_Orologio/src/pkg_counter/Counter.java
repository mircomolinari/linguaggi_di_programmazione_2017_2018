package pkg_counter;

public class Counter
{
    private int value; // Valore del contatore.

    /**
     * Costruttore di default.
     */
    public Counter()
    {
        this.reset();
    }

    /**
     * Riporta a zero il valore del contatore.
     */
    public void reset()
    {
        this.value = 0;
    }

    /**
     * Incrementa di 1 il valore del contatore.
     */
    public void increment()
    {
        this.value++;
    }

    /**
     * Decrementa di 1 il valore del contatore.
     */
    public void decrement()
    {
        this.value--;
    }

    /**
     * Restituisce il valore del contatore.
     * 
     * @return il valore del contatore
     */
    public int getValue()
    {
        return this.value;
    }
}
