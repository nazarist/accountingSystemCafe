package App;

import java.time.LocalDateTime;

public class Reservation {
    private Visitor visitor;
    private Table table;
    private LocalDateTime reservationTime;

    public Reservation(Visitor visitor, Table table, LocalDateTime reservationTime) {
        this.visitor = visitor;
        this.table = table;
        this.reservationTime = reservationTime;
    }





    public void printReservationDetails() {
        System.out.println("Reservation Details:");
        System.out.println("Visitor: " + visitor.getName());
        System.out.println("Table Number: " + table.getNumber());
        System.out.println("Date and Time: " + reservationTime.toString());
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public LocalDateTime getReservationTime() {
        return reservationTime;
    }

    public void setReservationTime(LocalDateTime reservationTime) {
        this.reservationTime = reservationTime;
    }
}
