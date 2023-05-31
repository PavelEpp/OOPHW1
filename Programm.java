public class Program {

    public Program() {
    }

    public static void main(String[] args) {
        Product product1 = new Product();
        System.out.println(product1.displayInfo());
        Product product2 = new Product("ООО Чистый Источник", "Бу", -90.15);
        System.out.println(product2.displayInfo());
    }
}
