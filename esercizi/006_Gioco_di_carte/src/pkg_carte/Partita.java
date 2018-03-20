package pkg_carte;

/**
 * Esempio di partita.
 */
public class Partita
{
    public static void main(String[] args)
    {
        Eroe myEroe = new Eroe();
        Vampiro myVampiro = new Vampiro();
        Licantropo myLicantropo = new Licantropo(Licantropo.LUNA_PIENA);

        // Combattimento.
        myEroe.combatti();
        myEroe.combatti();
        myEroe.combatti();
        myVampiro.azzanna();
        myLicantropo.azzanna();
        myLicantropo.azzanna();

        // Stampa la forza fisica rimanente ai personaggi.
        System.out.println("Forza Eroe: " + myEroe.getForzaFisica());
        System.out.println("Forza Vampiro: " + myVampiro.getForzaFisica());
        System.out.println("Forza Licantropo: " + myLicantropo.getForzaFisica());
    }
}
