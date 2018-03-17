package pkg_veicoli;

public class VeicoloMain
{
    public static void main(String[] args)
    {
        Automobile myAutomobile = new Automobile();

        myAutomobile.avvia();
        myAutomobile.accelera(10.0, 10);

        System.out.print("Velocità automobile: ");
        myAutomobile.printVelocita();
    }
}
