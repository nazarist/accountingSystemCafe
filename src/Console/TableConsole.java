package Console;

import App.Table;
import Factory.Data;

import java.util.List;

public class TableConsole extends Console
{
    public static void printAllTables()
    {
        lineWithName("Всі столики");
        Data data = cafe.getData();

        for (Table table : data.getTables()) {
            tab();
            if (data.getReservedTables().contains(table)) {
                System.out.print("Столик '" + table.getNumber() +"' кількість мість: '" + table.getSeats() + "'");
                System.out.println(" вільний");
            }else {
                System.out.print("Столик '" + table.getNumber() +"'");
                System.out.println(" зарезервовано");
            }
        }
        line();
    }

    public static void printAllUnreservedTables()
    {
        lineWithName("Всі вільні столики");
        Data data = cafe.getData();
        for (Table table : data.getTables()) {
            if (data.getReservedTables().contains(table)) {
                tab();
                System.out.println("Столик '" + table.getNumber() +"' кількість мість: '" + table.getSeats() + "'");
            }
        }
        line();
    }

    public static void printTables(List<Table> tables)
    {
        lineWithName();
        for (Table table : tables) {
            tab();
            System.out.println("Столик '" + table.getNumber() +"' кількість мість: '" + table.getSeats() + "'");
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
