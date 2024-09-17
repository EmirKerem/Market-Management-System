import java.util.Scanner;

public class Main {
    public static void shop() {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to our Market System.");
        System.out.println("Please log in | (1)Customer | (2)Cashier | (3)Product Manager | (4)Store Manager | ");
        int account_type = scanner.nextInt();
        scanner.nextLine(); //dummy
        if (account_type == 1) {
            Customer customer1 = new Customer("Aiden", "Norwe", "A35", 23);
            Customer customer2 = new Customer("Emily", "Johnson", "B12", 30);
            Customer customer3 = new Customer("Michael", "Smith", "C45", 45);
            Customer customer4 = new Customer("Olivia", "Brown", "D21", 28);
            Customer customer5 = new Customer("Liam", "Wilson", "E09", 33);
            
            System.out.println("Please enter your Customer ID:");
            String cus_id = scanner.nextLine();
            if (cus_id.equals("A35")) {
                System.out.println("Login Successful...");
                customer1.show_Info();
                customer1.customer();
                shop();
            }
            else if (cus_id.equals("B12")) {
                System.out.println("Login Successful...");
                customer2.show_Info();
                customer2.customer();
                shop();
            }
            else if (cus_id.equals("C45")) {
                System.out.println("Login Successful...");
                customer3.show_Info();
                customer3.customer();
                shop();
            }
            else if (cus_id.equals("D21")) {
                System.out.println("Login Successful...");
                customer4.show_Info();
                customer4.customer();
                shop();
            }
            else if (cus_id.equals("E09")) {
                System.out.println("Login Successful...");
                customer5.show_Info();
                customer5.customer();
                shop();
            }
            else {
                shop();
            }
        }
        else if (account_type == 2) { 
            
            Cashier cashier1 = new Cashier("James", "Owen", "C01", 40);
            Cashier cashier2 = new Cashier("Sophia", "Evans", "C02", 28);
            Cashier cashier3 = new Cashier("Benjamin", "Taylor", "C03", 35);
            Cashier cashier4 = new Cashier("Charlotte", "Morgan", "C04", 26);
            Cashier cashier5 = new Cashier("Henry", "Walker", "C05", 32);

            System.out.println("Please enter your Cashier ID:");
            String cus_id = scanner.nextLine();

            if (cus_id.equals("C01")) {
                System.out.println("Login Successful...");
                cashier1.show_Info();
                cashier1.cashier();
                shop();
            } 
            else if (cus_id.equals("C02")) {
                System.out.println("Login Successful...");
                cashier2.show_Info();
                cashier2.cashier();
                shop();
            } 
            else if (cus_id.equals("C03")) {
                System.out.println("Login Successful...");
                cashier3.show_Info();
                cashier3.cashier();
                shop();
            } 
            else if (cus_id.equals("C04")) {
                System.out.println("Login Successful...");
                cashier4.show_Info();
                cashier4.cashier();
                shop();
            }
            else if (cus_id.equals("C05")) {
                System.out.println("Login Successful...");
                cashier5.show_Info();
                cashier5.cashier();
                shop();
            } 
            else {
                shop();
            }
        }
        else if (account_type == 3) {
            
            Product_Manager product_manager1 = new Product_Manager("Sales", "John", "Doe", "P01", 40);
            Product_Manager product_manager2 = new Product_Manager("Marketing", "Jane", "Smith", "P02", 35);
            Product_Manager product_manager3 = new Product_Manager("Operations", "Mike", "Brown", "P03", 50);
            Product_Manager product_manager4 = new Product_Manager("HR", "Emily", "Davis", "P04", 28);
            Product_Manager product_manager5 = new Product_Manager("IT", "Olivia", "Wilson", "P05", 45);

        
            System.out.println("Please enter your Manager ID:");
            String cus_id = scanner.nextLine();

            
            if (cus_id.equals("P01")) {
                System.out.println("Login Successful...");
                product_manager1.show_Info();
                product_manager1.product_manager();
                shop();
            }
            else if (cus_id.equals("P02")) {
                System.out.println("Login Successful...");
                product_manager2.show_Info();
                product_manager2.product_manager();
                shop();
            }
            else if (cus_id.equals("P03")) {
                System.out.println("Login Successful...");
                product_manager3.show_Info();
                product_manager3.product_manager();
                shop();
            }
            else if (cus_id.equals("P04")) {
                System.out.println("Login Successful...");
                product_manager4.show_Info();
                product_manager4.product_manager();
                shop();
            }
            else if (cus_id.equals("P05")) {
                System.out.println("Login Successful...");
                product_manager5.show_Info();
                product_manager5.product_manager();
                shop();
            }
            else {
                shop();
            }
        }
        else if (account_type == 4){
            Shop_Manager shop_manager1 = new Shop_Manager("John", "Dorie", "S01", 40);

            System.out.println("Please enter your Manager ID:");
            String cus_id = scanner.nextLine();

            
            if (cus_id.equals("S01")) {
                System.out.println("Login Successful...");
                shop_manager1.show_Info();
                shop_manager1.shop_manager();
                shop();
            }
            else {
                shop();
            }
        }
        else {
            System.out.println("Invalid Account Type Selection.");
            shop();
        }
    }
    
    public static void main(String[] args) {
        shop();
    }
}
