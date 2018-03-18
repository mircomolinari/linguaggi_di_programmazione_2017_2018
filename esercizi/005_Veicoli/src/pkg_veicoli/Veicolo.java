package pkg_veicoli;

public class Veicolo
{
    private double velocita;
    private double accelerazione;

    /**
     * Costruttore di default. Gli attriduti vengono inizializzati a zero.
     */
    public Veicolo()
    {
        this.set(0.0, 0.0);
    }

    /**
     * Costruttore con inizializzazione dati.
     * 
     * @param newVelocita
     *            la valocità del veicolo
     * @param newAccelerazione
     *            l'accelerazione del veicolo
     */
    public Veicolo(double newVelocita, double newAccelerazione)
    {
        this.set(newVelocita, newAccelerazione);
    }

    /**
     * Restituisce la velocità del veicolo.
     * 
     * @return la velocità del veicolo
     */
    public double getVelocita()
    {
        return this.velocita;
    }

    /**
     * Restituisce l'accelerazione del veicolo.
     * 
     * @return l'accelerazione del veicolo
     */
    public double getAccelerazione()
    {
        return this.accelerazione;
    }

    /**
     * Modifica la velocità del veicolo.
     * 
     * @param newVelocita
     *            la nuova velocità del veicolo
     */
    public void setVelocita(double newVelocita)
    {
        this.set(newVelocita, this.accelerazione);
    }

    /**
     * Modifica l'accelerazione del veicolo.
     * 
     * @param newAccelerazione
     *            la nuova accelerazione del veicolo
     */
    public void setAccelerazione(double newAccelerazione)
    {
        this.set(this.velocita, newAccelerazione);
    }

    /**
     * Stampa a schermo la velocità del veicolo.
     */
    public void printVelocita()
    {
        System.out.printf("%.2f\n", this.velocita);
    }

    /**
     * Stampa a schermo l'accelerazione del veicolo.
     */
    public void printAccelerazione()
    {
        System.out.printf("%.2f\n", this.accelerazione);
    }

    /**
     * Metodo privato per l'inizializzazione dei dati.
     * 
     * @param newVelocita
     *            la nuova velocità del veicolo
     * @param newAccelerazione
     *            la nuova accelerazione del veicolo
     */
    private void set(double newVelocita, double newAccelerazione)
    {
        this.velocita = newVelocita;
        this.accelerazione = newAccelerazione;
    }
}
