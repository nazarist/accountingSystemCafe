package Factory;

import App.Reservation;
import App.Table;
import App.Visitor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestDataGenerator {
    private static final String[] NAMES = {"Олександр", "Анна", "Дмитро", "Марія", "Іван", "Олена", "Сергій", "Наталія"};
    private static final String[] CONTACTS = {"0991234567", "0677654321", "0509876543", "0933456789", "0971234567", "0998765432", "0671230987", "0957654321"};
    private static final int MAX_VISITORS = 10;
    private static final int MAX_TABLES = 20;

    private final Random RANDOM;

    public TestDataGenerator() {
        this.RANDOM = new Random();
    }

    public List<Visitor> generateVisitors() {
        List<Visitor> visitors = new ArrayList<>();
        for (int i = 0; i < MAX_VISITORS; i++) {
            String name = NAMES[RANDOM.nextInt(NAMES.length)];
            String contact = CONTACTS[RANDOM.nextInt(CONTACTS.length)];
            visitors.add(new Visitor(name, contact));
        }
        return visitors;
    }

    public List<Visitor> generateVisitor() {
        List<Visitor> visitors = new ArrayList<>();
        for (int i = 0; i < MAX_VISITORS; i++) {
            String name = NAMES[RANDOM.nextInt(NAMES.length)];
            String contact = CONTACTS[RANDOM.nextInt(CONTACTS.length)];
            visitors.add(new Visitor(name, contact));
        }
        return visitors;
    }

    public List<Table> generateTables() {
        List<Table> tables = new ArrayList<>();
        for (int i = 0; i < MAX_TABLES; i++) {
            int seats = RANDOM.nextInt(6) + 2; // генеруємо кількість місць від 2 до 7
            tables.add(new Table(i + 1, seats));
        }
        return tables;
    }

    public List<Reservation> generateReservations(Data data) {
        List<Visitor> visitors = data.getVisitors();
        List<Table> tables = data.getTables();

        List<Table> reservedTable = data.getReservedTables();




        for (Visitor visitor : visitors) {
            if (reservedTable.size() == tables.size()) {
                break; // Усі столики вже зарезервовані
            }

            int tableIndex;
            do {
                tableIndex = RANDOM.nextInt(tables.size());
            } while (data.getReservedTableIds(reservedTable).contains(tableIndex));


            Table table = tables.get(tableIndex);
            LocalDateTime reservationTime = LocalDateTime.now()
                    .plusDays(RANDOM.nextInt(7))
                    .plusHours(RANDOM.nextInt(24));

            data.addReservations(new Reservation(visitor, table, reservationTime));

        }

        return data.getReservations();
    }

}
