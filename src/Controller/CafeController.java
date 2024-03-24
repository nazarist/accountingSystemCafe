package Controller;


public class CafeController extends Controller {
    public void start()
    {

    }

//    private void reserveTable(Scanner scanner) {
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//        Visitor visitor = new Visitor(name, "contact info");
//
//        System.out.print("Enter table number to reserve: ");
//        int tableNumber = scanner.nextInt();
//        scanner.nextLine(); // Consume newline
//
//        Table table = cafe.getTable(tableNumber);
//        if (table != null && !table.isOccupied()) {
//            cafe.reserveTable(visitor, table);
//            System.out.println("Table " + tableNumber + " reserved successfully for " + name + ".");
//        } else {
//            System.out.println("Sorry, table " + tableNumber + " is not available.");
//        }
//    }
//
//    public static void main(String[] args) {
//        Cafe cafe = new Cafe("Java Cafe", "123 Java Street");
//        cafe.addTable(new Table(1, 4));
//        cafe.addTable(new Table(2, 4));
//        cafe.addTable(new Table(3, 2));
//
//        CafeConsoleApp app = new CafeConsoleApp(cafe);
//        app.start();
//    }
}
