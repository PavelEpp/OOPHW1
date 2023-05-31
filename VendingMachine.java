import java.util.Iterator;
import java.util.List;

public class VendingMachine {
    private final List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(double volume) {
        Iterator var4 = this.products.iterator();

        Product product;
        do {
            if (!var4.hasNext()) {
                return null;
            }

            product = (Product)var4.next();
        } while(!(product instanceof BottleOfWater) || ((BottleOfWater)product).getVolume() != volume);

        return (BottleOfWater)product;
    }

    public Chocolate getChocolate(String taste) {
        Iterator var3 = this.products.iterator();

        Product product;
        do {
            if (!var3.hasNext()) {
                return null;
            }

            product = (Product)var3.next();
        } while(!(product instanceof Chocolate) || !((Chocolate)product).getTaste().equals(taste));

        return (Chocolate)product;
    }
}
