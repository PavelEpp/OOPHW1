public class Product {
    protected String name;
    protected String brand;
    protected double price;

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.checkPrice(price);
    }

    public Product() {
        this("product", 100.0);
    }

    public Product(String inputName, double inputPrice) {
        this("noname", inputName, inputPrice);
    }

    public Product(String brand, String name, double price) {
        if (brand != null && brand.length() >= 4) {
            this.brand = brand;
        } else {
            this.brand = "noname";
        }

        if (name != null && name.length() >= 4) {
            this.name = name;
        } else {
            this.name = "product";
        }

        this.checkPrice(price);
    }

    private void checkPrice(double price) {
        if (price <= 0.0) {
            this.price = 100.0;
        } else {
            this.price = price;
        }

    }

    public String displayInfo() {
        return String.format("%s - %s - %f", this.brand, this.name, this.price);
    }
}
