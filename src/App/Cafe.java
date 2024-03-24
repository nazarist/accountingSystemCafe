package App;

import Config.MainConf;
import Factory.Data;

public class Cafe {
    private String name;
    private String address;


    private Data data;
    private static Cafe cafe;

    private Cafe(String name, String address) {
        this.name = name;
        this.address = address;
        this.data = new Data();
    }

    public static Cafe get()
    {
        return cafe == null
                ? cafe = new Cafe(MainConf.CAFE_NAME, MainConf.CAFE_ADDRESS)
                : cafe;
    }


    public void printVisitors() {
        System.out.println("Visitors of " + name + ":");
        for (Visitor visitor : data.getVisitors()) {
            System.out.println(visitor.getName());
        }
    }

    public void printTables() {
        System.out.println("Tables in " + name + ":");
        for (Table table : data.getTables()) {
            System.out.println("Table: " + table.getNumber() + " - Seats: " + table.getSeats());
            table.releaseTable();
        }
    }



    public Data getData() {
        return data;
    }

    public String getName() {
        return name;
    }


    public String getAddress() {
        return address;
    }



}
