import java.util.Scanner;

public class Product_Manager extends Customer implements Stock, Buy {
    private String department;

    public Product_Manager(String department, String name, String surname, String customer_id, int age) {
        super(name, surname, customer_id, age);
        this.department = department;
    }

    public void product_manager() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome " + getName() + " " + getSurname().toUpperCase());
        System.out.println("Available Operations: (1)Buy | (2)Change Stock");
        int opt = scanner.nextInt();
        scanner.nextLine();
        if (opt == 1) {
            Buy.buy();
        }
        else if (opt == 2) {
            Stock.stock();
        }
        else {
            System.out.println("Invalid Option");
            product_manager();
        }
    }

    public void show_Info() {
        System.out.println("Product Manager Name = " + getName());
        System.out.println("Product Manager Surname = " + getSurname().toUpperCase());
        System.out.println("Product Manager ID = " + getCustomer_id());
        System.out.println("Product Manager Age = " + getAge());
        System.out.println("Product Manager Department = " + department);
    }
}
