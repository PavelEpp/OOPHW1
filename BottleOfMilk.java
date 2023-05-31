public class BottleOfMilk extends Product {
    private double volume;
    private int fatСontent;

    public double getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = (double)volume;
    }

    public int getFatСontent() {
        return this.fatСontent;
    }

    public void setFatСontent(int fatСontent) {
        this.fatСontent = fatСontent;
    }

    public BottleOfMilk(String brand, String name, double price, double volume, int fatСontent) {
        super(brand, name, price);
        this.volume = volume;
        this.fatСontent = fatСontent;
    }

    public String displayInfo() {
        return String.format("[Бутылка] %s - %s - %f [объем: %f; жирность: %d]", this.brand, this.name, this.price, this.volume, this.fatСontent);
    }
}
