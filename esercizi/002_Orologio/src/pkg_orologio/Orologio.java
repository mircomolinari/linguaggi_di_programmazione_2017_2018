package pkg_orologio;

import pkg_counter.*;

public class Orologio
{
    private static final byte ORE = 0;
    private static final byte MINUTI = 1;

    private Counter[] orario = new Counter[2];

    /**
     * Costruttore di default. Ore e minuti impostati a zero.
     */
    public Orologio()
    {
        this.orario[ORE] = new Counter();
        this.orario[MINUTI] = new Counter();
    }

    /**
     * Riporta i minuti e le ore a zero.
     */
    public void reset()
    {
        this.orario[ORE].reset();
        this.orario[MINUTI].reset();
    }

    /**
     * Incrementa l'orario di un minuto.
     */
    public void tic()
    {
        this.orario[MINUTI].increment();

        // Se si raggiunge il minuto 60, scatta l'ora successiva.
        if (this.orario[MINUTI].getValue() == 60)
        {
            this.orario[MINUTI].reset();
            this.orario[ORE].increment();
        }

        // Mezzanotte.
        if (this.orario[ORE].getValue() == 24)
        {
            this.orario[ORE].reset();
        }
    }

    /**
     * Restituisce l'orario come stringa nella forma "ORE:MINUTI".
     * 
     * @return la stringa rappresentante l'orario
     */
    public String getOrario()
    {
        String strOre = Integer.toString(this.orario[ORE].getValue());
        String strMinuti = Integer.toString(this.orario[MINUTI].getValue());

        return strOre.concat(":").concat(strMinuti);
    }
}
