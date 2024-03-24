package App;

public class Table {
    private int number;
    private int seats;
    private boolean isOccupied;

    public Table(int number, int seats) {
        this.number = number;
        this.seats = seats;
        this.isOccupied = false;
    }

    public int getNumber() {
        return number;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public void reserveTable() {
        if (!isOccupied) {
            isOccupied = true;
            System.out.println("App.Table " + number + " is now reserved.");
        } else {
            System.out.println("App.Table " + number + " is already occupied.");
        }
    }





    public void releaseTable() {
        if (isOccupied) {
            isOccupied = false;
            System.out.println("App.Table " + number + " is now available.");
        } else {
            System.out.println("App.Table " + number + " is already available.");
        }
    }
}
