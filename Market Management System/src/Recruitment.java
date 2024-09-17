import java.util.Scanner;

public interface Recruitment {
    public static void recruitment() {
        System.out.println("Please select the department you want to recruit for");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("(1)Cashier | (2)Product Manager");
        int rec = scanner.nextInt();
        scanner.nextLine();
        
        if (rec == 1) {
            System.out.println("Please enter the information for the cashier you want to hire");
            System.out.println("Name: ");
            String name_c = scanner.nextLine();
            System.out.println("Surname: ");
            String surname_c = scanner.nextLine();
            System.out.println("Cashier ID: ");
            String id_c = scanner.nextLine();
            System.out.println("Age: ");
            int age_c = scanner.nextInt();
            scanner.nextLine();
            Cashier c = new Cashier(name_c, surname_c, id_c, age_c);
            System.out.println("Successfully hired " + c.getName() + " " + c.getSurname().toUpperCase() + " " + c.getAge() + " " + c.getCustomer_id());
        } else if (rec == 2) {
            System.out.println("Please enter the information for the product manager you want to hire");
            System.out.println("Department: ");
            String dep_c = scanner.nextLine();
            System.out.println("Name: ");
            String name_c = scanner.nextLine();
            System.out.println("Surname: ");
            String surname_c = scanner.nextLine();
            System.out.println("Manager ID: ");
            String id_c = scanner.nextLine();
            System.out.println("Age: ");
            int age_c = scanner.nextInt();
            scanner.nextLine();
            Product_Manager d = new Product_Manager(dep_c, name_c, surname_c, id_c, age_c);
            System.out.println("Successfully hired " + d.getName() + " " + d.getSurname().toUpperCase() + " " + d.getAge() + " " + d.getCustomer_id());
        } else {
            System.out.println("Invalid option");
        }
    }
}
