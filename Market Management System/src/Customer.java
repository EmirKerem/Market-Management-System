import java.util.Scanner;

public class Customer implements Buy, Refund {
    private String name;
    private String surname;
    private String customer_id;
    private int age; 

    public Customer(String name, String surname, String customer_id, int age) {
        this.name = name;
        this.surname = surname;
        this.customer_id = customer_id;
        this.age = age;
    }

    public void customer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome " + name + " " + surname.toUpperCase());
        System.out.println("Available Operations: (1)Buy | (2)Refund");
        int opt = scanner.nextInt();
        scanner.nextLine();
        if (opt == 1) {
            Buy.buy();
        }
        else if (opt == 2) {
            Refund.refund();
        }
        else {
            System.out.println("Invalid Option");
            customer();
        }
    }

    public void show_Info() {
        System.out.println("Customer Name = " + name);
        System.out.println("Customer Surname = " + surname.toUpperCase());
        System.out.println("Customer ID = " + customer_id);
        System.out.println("Customer Age = " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
