package App;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Visitor visitor;
    private List<MenuItem> items;
    private double totalPrice;
    private boolean isPaid;

    public Order(Visitor visitor) {
        this.visitor = visitor;
        this.items = new ArrayList<>();
        this.totalPrice = 0.0;
        this.isPaid = false;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void addItem(MenuItem item) {
        items.add(item);
        totalPrice += item.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }
}
