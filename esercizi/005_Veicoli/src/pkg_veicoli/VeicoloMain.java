package pkg_veicoli;

public class VeicoloMain
{
    public static void main(String[] args)
    {
        Automobile myAutomobile = new Automobile();
        Bicicletta myBicicletta = new Bicicletta();

        myAutomobile.avvia();
        myAutomobile.accelera(10.0, 10);
        
        myBicicletta.pedala(10, 6);

        System.out.print("Velocità automobile: ");
        myAutomobile.printVelocita();
        
        System.out.print("Velocità bicicletta: ");
        myBicicletta.printVelocita();
    }
}
