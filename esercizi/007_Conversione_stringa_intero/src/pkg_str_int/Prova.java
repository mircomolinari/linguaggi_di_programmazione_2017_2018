package pkg_str_int;

public class Prova
{
    public static void main(String[] args)
    {
        int intValue = 0;

        try
        {
            intValue = StringaIntero.convertiStringa(args[0]);
            System.out.println("FUNZIONA! intValue: " + intValue);
        }
        catch (NumberFormatException ex)
        {
            System.out.println("La stringa non sembra rappresentare nessun valore numerico intero.");
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
