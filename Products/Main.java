public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Ноутбук", 75000);
        Product p2 = new Product("Мышка", 1500);
        Product p3 = new Product("Клавиатура", 3000);

        Cart cart = new Cart();
        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        cart.printCart();

        System.out.println("Удаляем: Мышка\n");
        cart.removeProduct("Мышка");

        cart.printCart();
    }
}