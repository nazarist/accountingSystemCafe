package Console;

import Factory.Data;

public class MainConsole extends Console{

    public MainConsole()
    {
        lineWithName();
    }

    public void start()
    {
        while (true) {

            out(
                    "Ласкаво просимо до " + cafe.getName() + "!",
                    "1. Всі столики",
                    "2. Не зарезервовані столики",
                    "3. Зарезервувати",
                    "4. Меню",
                    "5. Видалити Резервацію"
            );



            System.out.print("Виберіть опцію: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    TableConsole.printAllTables(cafe.getData());
                    break;
                case 2:
                    TableConsole.printAllReservedTables(cafe.getData());
                    break;
                case 3:
                    System.out.println("3. Зарезервувати");
                    break;
                case 4:
                    System.out.println("4. Меню");
                    break;
                case 5:
                    System.out.println("5. Видалити Резервацію");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }






    public void printAllTables()
    {
        Data data = cafe.getData();

    }

























}
