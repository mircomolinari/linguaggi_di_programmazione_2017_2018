package pkg_veicoli;

public class Automobile extends Veicolo
{
    private String targa;
    private boolean avviata;

    /**
     * Costruttore di default. Gli attriduti vengono inizializzati a zero.
     */
    public Automobile()
    {
        this.set(0.0, 0.0, null, false);
    }

    /**
     * Costruttore con inizializzazione targa.
     * 
     * @param targa
     *            la targa dell'automobile
     */
    public Automobile(String newTarga)
    {
        this.set(0.0, 0.0, newTarga, false);
    }

    /**
     * Imposta il parametro 'avviata' come true;
     */
    public void avvia()
    {
        this.avviata = true;
    }

    /**
     * Imposta il parametro 'avviata' come true;
     */
    public void spegni()
    {
        this.avviata = false;
    }

    /**
     * Se l'automobile è avviata, aggiorna i valori di velocità e accelerazione.
     * 
     * @param newAccelerazione
     *            l'accelerazione dell'automobile
     * @param secondi
     *            la durata in secondi dell'accelerazione
     */
    public void accelera(double newAccelerazione, int secondi)
    {
        double newVelocita = (double) this.getVelocita() + (newAccelerazione * secondi);

        if (this.avviata == true)
        {
            this.set(newVelocita, newAccelerazione, this.targa, this.avviata);
        }
        else
        {
            System.out.println("ERRORE: Impossibile accelerare ad automobile spenta.");
        }
    }

    /**
     * Metodo protetto per l'inizializzazione dei dati.
     * 
     * @param newVelocita
     *            la nuova velocità dell'automobile
     * @param newAccelerazione
     *            la nuova accelerazione dell'automobile
     * @param newTarga
     *            la nuova targa dell'automobile
     * @param newAvviata
     *            il nuovo parametro 'avviata' dell'automobile
     */
    protected void set(double newVelocita, double newAccelerazione, String newTarga, boolean newAvviata)
    {
        super.set(newVelocita, newAccelerazione);
        this.targa = newTarga;
        this.avviata = newAvviata;
    }
}
