package Interface;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee registration number:");
        int registrationNumber = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter employee name:");
        String name = scanner.nextLine();

        System.out.print("Enter employee salary per month:");
        int salaryPerMonth = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter number of invoices:");
        int numOfInvoices = scanner.nextInt();
        scanner.nextLine(); 

        Invoice[] invoices = new Invoice[numOfInvoices];
        for (int i = 0; i < numOfInvoices; i++) {
            System.out.println("Enter details for invoice " + (i + 1) + ":\nProduct name:");
            String productName = scanner.nextLine();

            System.out.println("Quantity:");
            int quantity = scanner.nextInt();
            scanner.nextLine(); 

            System.out.println("Price per item:");
            int pricePerItem = scanner.nextInt();
            scanner.nextLine();

            invoices[i] = new Invoice(productName, quantity, pricePerItem);
        }

        Employee employee = new Employee(registrationNumber, name, salaryPerMonth, invoices);

        System.out.println("=======Employee Information=======\n" + employee + "\n");
        employee.printInvoices();
        System.out.println("Total Salary after Deductions: $" + employee.getPayableAmount());

        scanner.close();
    }
}