package pkg_str_int;

public final class StringaIntero
{
    /**
     * Costruttore privato.
     */
    private StringaIntero()
    {
        // Questa classe prevede soltanto metodi statici.
        // La chiamata del costruttore non è prevista.
    }

    /**
     * Restituisce il valore intero rappresentato da una stringa. Accetta solo
     * stringhe che rappresentano numeri interi nell'intervallo [-10, 10].
     * 
     * @param stringValue
     *            una stringa rappresentante un numero intero nell'intervallo
     *            [-10, 10]
     * @return il valore intero rappresentato dalla stringa
     * @throws NumberFormatException
     *             se la stringa non rappresenta nessun valore intero
     */
    public static int convertiStringa(String stringValue) throws NumberFormatException
    {
        int intValue = Integer.parseInt(stringValue);

        // Se il valore è fuori dal range consentito, solleva un'eccezione.
        if ((intValue < -10) || (intValue > 10))
        {
            throw new IllegalArgumentException(
                    "La conversione è ammessa soltanto per valori interi nel range [-10, 10].");
        }
        return intValue;
    }
}
