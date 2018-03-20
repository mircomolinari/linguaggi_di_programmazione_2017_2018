package pkg_carte;

public class Eroe implements Umano
{
    private int forzaFisica;

    /**
     * Costruttore di default. La forza fisica iniziale del personaggio viene
     * impostata a 10.
     */
    public Eroe()
    {
        this.setForzaFisica(10);
    }

    /**
     * Attacco del personaggio.
     */
    public void combatti()
    {
        this.setForzaFisica(this.forzaFisica - 3);
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
