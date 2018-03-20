package pkg_carte;

public class Licantropo implements Umano, Mostro
{
    public static final boolean LUNA_PIENA = true;
    public static final boolean NO_LUNA_PIENA = false;
    private boolean isUmano;
    private int forzaFisica;

    /**
     * Costruttore. L'argomento serve per stabilire in quale forma si troverà il
     * personaggio.
     * 
     * @param isLunaPiena
     *            il parametro che decide la forma del personaggio
     */
    public Licantropo(boolean isLunaPiena)
    {
        int newForzaFisica = (isLunaPiena) ? 15 : 10;

        this.set(!isLunaPiena, newForzaFisica);

    }

    /**
     * Attacco del personaggio (in forma umana).
     */
    public void combatti()
    {
        if (this.isUmano)
        {
            this.set(this.isUmano, this.forzaFisica - 3);
        }
    };

    /**
     * Attacco del personaggio (in forma mostro).
     */
    public void azzanna()
    {
        if (!this.isUmano)
        {
            this.set(this.isUmano, this.forzaFisica - 2);
        }
    };

    /**
     * Restituisce la forza fisica del personaggio.
     */
    public int getForzaFisica()
    {
        return this.forzaFisica;
    };

    /**
     * Restituisce la forma attuale del personaggio.
     * 
     * @return la forma attuale del personaggio
     */
    public String getForma()
    {
        return (this.isUmano) ? "Umano" : "Licantropo";
    }

    /**
     * Metodo privato per la modifica dei parametri del personaggio.
     * 
     * @param newIsUmano
     *            la nuova forma del personaggio
     * @param newForzaFisica
     *            la nuova forza fisica del personaggio
     */
    private void set(boolean newIsUmano, int newForzaFisica)
    {
        this.isUmano = newIsUmano;
        this.forzaFisica = newForzaFisica;
    }
}
