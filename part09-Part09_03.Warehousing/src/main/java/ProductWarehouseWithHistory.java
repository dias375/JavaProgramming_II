
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
    }

    public void addToWarehouse(double amount) {

    }

    public double takeFromWarehouse(double amount) {
        return 0.0;
    }

    public String history() {
        return this.history.toString();
    }

}
