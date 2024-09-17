import java.util.Scanner;

public interface Buy {
    public static void buy() {
        Products[] products1 = Store.products;

        Scanner scanner = new Scanner(System.in);
        
        Store.listProducts();
        
        int selected_product = scanner.nextInt();
        scanner.nextLine();

        if (selected_product >= 1 && selected_product <= products1.length) {
            Products chosenProduct = products1[selected_product - 1];

            System.out.println("You selected: " + chosenProduct.getPro_name());
            
            System.out.println("Enter the amount you want to purchase of " + chosenProduct.getPro_name() + ": ");
            int amount = scanner.nextInt();
            scanner.nextLine();

            if (amount <= chosenProduct.getStock()) {
                System.out.println("Successfully purchased " + amount + " of " + chosenProduct.getPro_name() + ". Total cost = " + (amount * chosenProduct.getCost()));
                chosenProduct.stock -= amount;
            } else {
                System.out.println("Insufficient stock! Current stock: " + chosenProduct.getStock());
            }
        } else {
            System.out.println("Invalid product selection.");
        }
    }
}
