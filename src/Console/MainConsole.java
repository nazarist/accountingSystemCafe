package Console;

import Factory.Data;

public class MainConsole extends Console{

    public void start()
    {
        while (true) {

            out(
                    "Ласкаво просимо до " + cafe.getName() + "!",
                    "виберіть число: ",
                    "1. Вивести всі столики.",
                    "2. Не зарезервовані столики.",
                    "3. Зарезервувати",
                    "4. Меню",
                    "5. Видалити Резервацію"
            );



            System.out.print("Виберіть опцію: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    System.out.println("1. Вивести всі слолики");
                    return;
                case 2:
                    System.out.println("2. Не зарезервовані столики.");
                    return;
                case 3:
                    System.out.println("3. Зарезервувати");
                    return;
                case 4:
                    System.out.println("4. Меню");
                    return;
                case 5:
                    System.out.println("5. Видалити Резервацію");
                    return;
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
