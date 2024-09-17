import java.util.Scanner;

public interface Stock {
    public static void stock() {
        Products[] products1 = Store.products;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please select the product whose stock you want to change:");
        for (int a = 0; a < products1.length; a++) {
            System.out.println((a + 1) + "- " + products1[a].getPro_name());
        }
        
        int selected_product = scanner.nextInt();
        scanner.nextLine();
        
        if (selected_product >= 1 && selected_product <= products1.length) {
            Products chosenProduct = products1[selected_product - 1];

            System.out.println("You selected: " + chosenProduct.getPro_name());
            System.out.println("Do you want to (1) Increase or (2) Decrease the stock?");
            int selection = scanner.nextInt();
            scanner.nextLine();
            
            if (selection == 1) {
                System.out.println("Enter the amount you want to increase for " + chosenProduct.getPro_name() + ":");
                int amount = scanner.nextInt();
                scanner.nextLine();
                chosenProduct.stock += amount;
                System.out.println("Successfully updated.");
                System.out.println("Old stock = " + (chosenProduct.stock - amount) + ", New stock = " + chosenProduct.stock);
                
            } else if (selection == 2) {
                System.out.println("Enter the amount you want to decrease for " + chosenProduct.getPro_name() + ":");
                int amount = scanner.nextInt();
                scanner.nextLine();
                if (amount <= chosenProduct.getStock()) {
                    chosenProduct.stock -= amount;
                    System.out.println("Successfully updated.");
                    System.out.println("Old stock = " + (chosenProduct.stock + amount) + ", New stock = " + chosenProduct.stock);
                } else {
                    System.out.println("Insufficient stock! Current stock: " + chosenProduct.getStock());
                }
            }
        } else {
            System.out.println("Invalid product selection.");
        }
    }
}
