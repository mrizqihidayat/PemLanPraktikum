package Interface;

public class Employee implements Payable {
    Integer registrationNumber;
    String name;
    Integer salaryPerMonth;
    Invoice[] invoices;

    public Employee(Integer registrationNumber, String name, Integer salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    public double getPayableAmount() {
        double totalInvoiceAmount = 0;
        for (Invoice invoice : invoices) {
            totalInvoiceAmount += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalInvoiceAmount;
    }

    public void printInvoices() {
        System.out.print("=====Invoices for Employee " + name +"=====\n\n");
        for (Invoice invoice : invoices) {
            System.out.print(invoice + "\n");
        }
    }

    public String toString() {
        return "Registration Number\t: " + registrationNumber +
                "\nName\t\t: " + name +
                "\nSalary Per Month\t: $" + salaryPerMonth;
    }
}