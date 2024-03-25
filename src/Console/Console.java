package Console;

import App.Cafe;
import Config.MainConf;

import java.util.Scanner;

public class Console {
    protected static Scanner scanner;
    protected static Cafe cafe;

    static {
        cafe = Cafe.get();
        scanner = new Scanner(System.in);
    }

    public static void out(String... text)
    {
        for (String line : text){
            System.out.println(line);
        }
    }


    public static void outTab(String... text)
    {
        for (String line : text){
            tab();
            System.out.println(line);
        }
    }




    public static void lineWithName()
    {
        StringBuilder line = new StringBuilder();
        int len = MainConf.LENGTH_MENU_LINE - (MainConf.CAFE_NAME.length() / 2); // довжина половини лінії без назви  ------------------------------{ "+ MainConf.CAFE_NAME +" }--------------------------------


        line.append("-".repeat(Math.max(0, len)));
        out("", line + "{ "+ MainConf.CAFE_NAME +" }" + line, "");
    }

    public static void lineWithName(String name)
    {
        StringBuilder line = new StringBuilder();
        int len = MainConf.LENGTH_MENU_LINE - (name.length() / 2);


        line.append("-".repeat(Math.max(0, len)));
        out("", line + "{ "+ name +" }" + line, "");
    }

    public static void line()
    {
        StringBuilder line = (new StringBuilder()).append("-".repeat(MainConf.LENGTH_MENU_LINE * 2 + 4));;
        out("", line.toString(), "");
    }

    public static void tab()
    {
        System.out.print("\t");
    }




}
