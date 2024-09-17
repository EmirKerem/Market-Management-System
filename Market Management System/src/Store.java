public class Store {
    public static Products[] products = {
        // Fruits
        new Products("Apple", 5.99, 50),
        new Products("Banana", 10.99, 30),
        new Products("Orange", 6.50, 45),
        new Products("Strawberry", 15.00, 25),
        new Products("Grapes", 12.00, 20),

        // Dairy
        new Products("Milk", 8.99, 100),
        new Products("Cheese", 25.50, 20),
        new Products("Yogurt", 5.50, 75),
        new Products("Butter", 10.00, 55),

        // Bakery
        new Products("Bread", 2.50, 200),
        new Products("Croissant", 3.50, 150),
        new Products("Bagel", 4.00, 100),

        // Vegetables
        new Products("Tomato", 4.75, 80),
        new Products("Cucumber", 2.00, 60),
        new Products("Lettuce", 3.00, 40),
        new Products("Bell Pepper", 5.00, 30),

        // Meat
        new Products("Chicken Breast", 20.00, 25),
        new Products("Ground Beef", 15.00, 40),
        new Products("Pork Chops", 18.00, 30),

        // Snacks
        new Products("Chocolate", 12.50, 40),
        new Products("Potato Chips", 3.00, 50),
        new Products("Granola Bars", 6.00, 20)
    };
    
    public static void listProducts() {
        System.out.println("Please choose a product: ");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + "- " + products[i].getPro_name());
        }
    }
}

