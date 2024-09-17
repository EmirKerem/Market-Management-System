import java.util.Scanner;

public interface Refund {
    public static void refund() {
        
        Products[] products1 = Store.products;  
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please select the product you want to return:");
        for (int a = 0; a < products1.length; a++) {
            System.out.println((a + 1) + "- " + products1[a].getPro_name());
        }
        
        int selected_product = scanner.nextInt();
        scanner.nextLine();
        
        if (selected_product >= 1 && selected_product <= products1.length) {
            Products chosenProduct = products1[selected_product - 1];  

           
            System.out.println("You selected: " + chosenProduct.getPro_name());
            
            
            System.out.println("Enter the quantity of " + chosenProduct.getPro_name() + " you want to return: ");
            int amount = scanner.nextInt();
            scanner.nextLine();
            
            
            if (amount > 0) {
                chosenProduct.stock += amount;  
                System.out.println("Your products have been successfully returned.");
                System.out.println("Old stock of your product: " + (chosenProduct.stock - amount) + ", New stock: " + chosenProduct.stock);
            } else {
                System.out.println("Invalid return quantity.");
            }
        } else {
            System.out.println("Invalid product selection.");
        }
    }
}
