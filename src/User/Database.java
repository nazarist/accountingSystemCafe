package User;

import Config.MainConf;
import Console.Console;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class Database
{
    protected static File file;


    static {
        file = new File(MainConf.DB_USER_FILE_NAME);
    }

    public Database()
    {
        createFile();
    }

    public static void createFile()
    {
        try {
            if (file.createNewFile()) Console.lineWithName("file created");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void set(String text)
    {
        BufferedWriter writer = getBfWriter();
        try {
            writer.write(text);
            writer.append("")
                    .append("\n")
                    .flush();

            writer.close();

            Console.lineWithName("text is write");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    protected static BufferedReader getBfReader()
    {
        try {
            return new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    protected static BufferedWriter getBfWriter()
    {
        try {
            return new BufferedWriter(new FileWriter(file, true));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void printDb()
    {
        try {
            BufferedReader bfReader = getBfReader();
            String current;

            Console.line();
            while ((current = bfReader.readLine()) != null){
                Helpers.out(current);
            }
            Console.line();

            bfReader.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
