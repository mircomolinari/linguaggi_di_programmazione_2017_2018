package pkg_carte;

public class Vampiro implements Mostro
{
    private int forzaFisica;

    /**
     * Costruttore di default. La forza fisica iniziale del personaggio viene
     * impostata a 15.
     */
    public Vampiro()
    {
        this.setForzaFisica(15);
    }

    /**
     * Attacco del personaggio.
     */
    public void azzanna()
    {
        this.setForzaFisica(this.forzaFisica - 2);
    }

    /**
     * Restituisce la forza fisica del personaggio.
     */
    public int getForzaFisica()
    {
        return this.forzaFisica;
    }

    /**
     * Metodo privato per la modifica del parametro 'forzaFisica'.
     * 
     * @param newForzaFisica
     *            la nuova forza fisica del personaggio
     */
    private void setForzaFisica(int newForzaFisica)
    {
        this.forzaFisica = newForzaFisica;
    }
}
