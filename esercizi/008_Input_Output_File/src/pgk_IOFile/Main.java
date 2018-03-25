package pgk_IOFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main
{
    public static void main(String[] args)
    {
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        String tempString = new String();

        // Apertura del file di testo in scrittura.
        try
        {
            fileWriter = new FileWriter(args[0]);
            printWriter = new PrintWriter(fileWriter);
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
            System.exit(-1);
        }

        // Scrittura del file di testo.
        do
        {
            try
            {
                // Legge una nuova riga dallo stream di input.
                tempString = bufferedReader.readLine();

                // Scrive la riga letta sul file.
                printWriter.println(tempString);
            }
            catch (IOException ex)
            {
                System.out.println(ex.getMessage());
                System.exit(-2);
            }
        } while (tempString.equals("") != true);

        // Chiude printWriter.
        printWriter.close();

        // Lettura del file di testo.
        // Apertura del file di testo in lettura.
        try
        {
            fileReader = new FileReader(args[0]);
            bufferedReader = new BufferedReader(fileReader);
        }
        catch (FileNotFoundException ex)
        {
            System.out.println(ex.getMessage());
            System.exit(-4);
        }

        // Stampa a schermo il contenuto del file di testo.
        try
        {
            tempString = bufferedReader.readLine();

            while (tempString != null)
            {
                System.out.println(tempString);
                tempString = bufferedReader.readLine();
            }
        }
        catch (IOException ex)
        {
            System.out.println(ex.getMessage());
            System.exit(-5);
        }
    }
}
