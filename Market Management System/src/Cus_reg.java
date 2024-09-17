import java.util.Scanner;

public interface Cus_reg {
    public static void cus_reg() {
        System.out.println("Please enter the information of the customer you want to register in the system");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name: ");
        String name_d = scanner.nextLine();
        System.out.println("Surname: ");
        String surname_d = scanner.nextLine();
        System.out.println("Customer ID: ");
        String id_d = scanner.nextLine();
        System.out.println("Age: ");
        int age_d = scanner.nextInt();
        scanner.nextLine();
        
        Customer e = new Customer(name_d, surname_d, id_d, age_d);
        System.out.println("Successfully registered " + e.getName() + " " + e.getSurname().toUpperCase() + " " + e.getAge() + " " + e.getCustomer_id());
    }
}
