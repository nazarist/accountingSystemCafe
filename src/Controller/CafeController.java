package Controller;


import App.Table;
import Console.Console;
import Console.TableConsole;

import java.util.List;

public class CafeController extends Controller {


    public static void reservation()
    {

        System.out.print("скільки місць вам потрібно: ");
        int seats = scanner.nextInt();

        List<Table> tables = cafe.getData().getTablesBySeats(seats);
        tables = cafe.getData().getFreeTables(tables);


        if (tables.isEmpty()) {
            Console.lineWithName("На жаль, немає вільних столиків на " + seats + " місць.");
            return;
        }

        while (true) {
            Console.lineWithName("Виберіть столик");
            TableConsole.printTables(tables);
            System.out.print("Номер столика: ");
            int tableNumber = scanner.nextInt();


            Table table = cafe.getData().getTableByNumber(tableNumber, tables);


            TableConsole.printTable(table);

            if (table == null) {
                Console.lineWithName("Столик з номером " + tableNumber + " не знайдено.");
                continue;
            }
            System.out.println("Виберіть дату та час резервації");
            break;
        }




//        System.out.println("На яку годину?");
//        int time = scanner.nextInt();
//        System.out.println("На яку дату?");
//        String date = scanner.next();
//        System.out.println("Ваше ім'я?");
//        String name = scanner.next();
//        System.out.println("Ваш номер телефону?");
//        String phone = scanner.next();

    }
}
