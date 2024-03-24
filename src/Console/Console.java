package Console;

import App.Cafe;

import java.util.Scanner;

public class Console {
    protected Scanner scanner;
    protected Cafe cafe;

    Console(){
        this.scanner = new Scanner(System.in);
        this.cafe = Cafe.get();
    }

    public static void out(String... text)
    {
        for (String line : text){
            System.out.println(line);
        }
    }


}
