public class Products {
    private String pro_name;
    private double cost;
    public int stock;

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Products(String pro_name, double cost, int stock) {
        this.pro_name = pro_name;
        this.cost = cost;
        this.stock = stock;
    }
}
