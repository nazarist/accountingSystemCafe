package Console;

import App.Table;
import Factory.Data;

public class TableConsole extends Console
{
    public static void printAllTables(Data data)
    {
        lineWithName();
        for (Table table : data.getTables()) {
            tab();
            if (data.getReservedTable().contains(table)) {
                System.out.print("Столик '" + table.getNumber() +"' кількість мість: '" + table.getSeats() + "'");
                System.out.println(" вільний");
            }else {
                System.out.print("Столик '" + table.getNumber() +"'");
                System.out.println(" зарезервовано");
            }
        }
        line();
    }

    public static void printAllReservedTables(Data data)
    {
        lineWithName();
        for (Table table : data.getTables()) {
            if (data.getReservedTable().contains(table)) {
                tab();
                System.out.println("Столик '" + table.getNumber() +"' кількість мість: '" + table.getSeats() + "'");
            }
        }
        line();
    }



    public static void printTable(Table table)
    {
        out(
                "Столик номер '" + table.getNumber() +"' мість: '" + table.getSeats() + "'"
        );
    }

}
