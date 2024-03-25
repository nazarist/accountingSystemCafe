package Factory;

import App.Reservation;
import App.Table;
import App.Visitor;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private List<Visitor> visitors;
    private List<Table> tables;
    private List<Reservation> reservations;
    private final TestDataGenerator GENERATOR;


    public Data() {
        this.visitors = new ArrayList<>();
        this.tables = new ArrayList<>();
        this.reservations = new ArrayList<>();
        this.GENERATOR = new TestDataGenerator();


        this.generateDefault()
            .generateTest();
    }


    private Data generateDefault()
    {
        tables = GENERATOR.generateTables();
        return this;
    }

    private Data generateTest()
    {
        visitors = GENERATOR.generateVisitors();
        reservations = GENERATOR.generateReservations(Data.this);
        return this;
    }


    public List<Table> getReservedTables()
    {
        return getReservations()
                .stream()
                .map(Reservation::getTable)
                .toList();
    }







    public List<Table> getFreeTables(List<Table> tables)
    {
        return tables
                .stream()
                .filter(table -> !getReservedTableIds().contains(table.getNumber()))
                .toList();
    }



    public List<Table> getReservedTables(List<Table> tables)
    {
        return tables
                .stream()
                .filter(table -> getReservedTableIds().contains(table.getNumber()))
                .toList();
    }

    public List<Integer> getReservedTableIds(List<Table> tables)
    {
        return tables
                .stream()
                .map(Table::getNumber)
                .toList();
    }

    public List<Integer> getReservedTableIds()
    {
        return getReservedTables()
                .stream()
                .map(Table::getNumber)
                .toList();
    }




    public List<Visitor> getVisitors() {
        return visitors;
    }

    public void addVisitor(Visitor visitor) {
        visitors.add(visitor);
    }

    public List<Table> getTables() {
        return tables;
    }

    public void addTable(Table table) {
        tables.add(table);
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void addReservations(Reservation reservations) {
        this.reservations.add(reservations);
    }



    public List<Table> getTablesBySeats(int seats)
    {
        return tables
                .stream()
                .filter(table -> table.getSeats() >= seats)
                .toList();
    }

    public Table getTableByNumber(int tableNumber, List<Table> tables) {
        return tables
                .stream()
                .filter(table -> table.getNumber() == tableNumber)
                .findFirst()
                .orElse(null);
    }
}
