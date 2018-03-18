package pkg_veicoli;

public class Bicicletta extends Veicolo
{
    /**
     * Costruttore di default. Gli attriduti vengono inizializzati a zero.
     */
    public Bicicletta()
    {
        this.set(0.0, 0.0);
    }

    /**
     * Aggiorna i valori di velocità e accelerazione.
     * 
     * @param numeroPedalate
     *            il numero di pedalate
     * @param secondi
     *            la durata in secondi dell'accelerazione
     */
    public void pedala(int numeroPedalate, int secondi)
    {
        double newAccelerazione = (double) numeroPedalate / Math.pow(secondi, 2);
        this.setAccelerazione(newAccelerazione);

        double newVelocita = (double) this.getVelocita() + (newAccelerazione * secondi);
        this.setVelocita(newVelocita);
    }

    /**
     * Metodo privato per l'inizializzazione dei dati.
     * 
     * @param newVelocita
     *            la nuova velocità della bicicletta
     * @param newAccelerazione
     *            la nuova accelerazione della bicicletta
     */
    private void set(double newVelocita, double newAccelerazione)
    {
        super.setVelocita(newVelocita);
        super.setAccelerazione(newAccelerazione);
    }
}
