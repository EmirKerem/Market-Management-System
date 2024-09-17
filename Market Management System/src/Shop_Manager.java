import java.util.Scanner;

public class Shop_Manager extends Customer implements Stock, Buy, Refund, Recruitment, Cus_reg {

    public Shop_Manager(String name, String surname, String customer_id, int age) {
        super(name, surname, customer_id, age);
    }

    public void show_Info() {
        System.out.println("Shop Manager Name = " + getName());
        System.out.println("Shop Manager Surname = " + getSurname().toUpperCase());
        System.out.println("Shop Manager ID = " + getCustomer_id());
        System.out.println("Shop Manager Age = " + getAge());
    }

    public void shop_manager() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome " + getName() + " " + getSurname().toUpperCase());
        System.out.println("Available Operations: (1)Purchase | (2)Change Stock | (3)Make Sale | (4)Receive Refund | (5)Recruitment | (6)Customer Registration");
        int opt = scanner.nextInt();
        scanner.nextLine();
        if (opt == 1) {
            Buy.buy();
        }
        else if (opt == 2) {
            Stock.stock();
        }
        else if (opt == 3) {
            Sell.sell();
        }
        else if (opt == 4) {
            Refund.refund();
        }
        else if (opt == 5) {
            Recruitment.recruitment();
        }
        else if (opt == 6) {
            Cus_reg.cus_reg();
        }
        else {
            System.out.println("Invalid Option");
            shop_manager();
        }
    }
}
