package Console;

import Controller.CafeController;
import User.Profile;

import java.util.HashMap;
import java.util.Map;

public class MainConsole extends Console{

    private Map<Integer, Runnable> actions;
    public MainConsole()
    {
        actions = new HashMap<>();


        lineWithName();

        actions.put(1, TableConsole::printAllTables);
        actions.put(2, TableConsole::printAllUnreservedTables);
        actions.put(3, CafeController::reservation);
        actions.put(4, () -> System.out.println("4. Меню"));
        actions.put(5, () -> System.out.println("5. Видалити Резервацію"));
        actions.put(6, Profile::menu);
    }

    public void start()
    {
        while (true) {

            out(
                    "1. Всі столики",
                    "2. Не зарезервовані столики",
                    "3. Зарезервувати",
                    "4. Меню",
                    "5. Видалити Резервацію",
                    "6. Профіль"
            );

            System.out.print("Виберіть опцію: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            actions.getOrDefault(option, () -> System.out.println("Неправильеа опція, попробуйте ще раз.")).run();
        }
    }

























}
