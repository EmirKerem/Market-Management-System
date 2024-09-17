import java.util.Scanner;

public class Cashier extends Customer implements Sell, Buy, Refund, Cus_reg {

    public Cashier(String name, String surname, String customer_id, int age) {
        super(name, surname, customer_id, age);
    }

    public void cashier() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome " + getName() + " " + getSurname().toUpperCase());
        System.out.println("Available Operations: (1)Buy | (2)Sell | (3)Refund | (4)Customer Registration");
        int opt = scanner.nextInt();
        scanner.nextLine();
        if (opt == 1) {
            Buy.buy();
        }
        else if (opt == 2) {
            Sell.sell();
        }
        else if (opt == 3) {
            Refund.refund();
        }
        else if (opt == 4) {
            Cus_reg.cus_reg();
        }
        else {
            System.out.println("Invalid Option");
            cashier(); 
        }
    }

    public void show_Info() {
        System.out.println("Cashier Name = " + getName());
        System.out.println("Cashier Surname = " + getSurname().toUpperCase());
        System.out.println("Cashier ID = " + getCustomer_id());
        System.out.println("Cashier Age = " + getAge());
    }
}
