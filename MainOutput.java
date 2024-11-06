import java.util.Scanner;

public class MainOutput {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        //getting info from user for emp class
        System.out.print("Enter Employee ID: ");
        int empId = obj.nextInt();
        obj.nextLine();
        System.out.println("Enter Employee Name: ");
        String name = obj.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = obj.nextDouble();

        //creating emp object and tax cal
        Employee employee = new Employee(empId, name, salary);
        System.out.println("Employee Information");
        employee.displayEmployeeInfo();

        //getting info from user for product class
        System.out.println("Enter the Product Id: ");
        int pid = obj.nextInt();
        System.out.print("Enter Product Unit Price: ");
        double price = obj.nextDouble();
        System.out.print("Enter Product Quantity: ");
        int quantity = obj.nextInt();

        //creating product object and tax cal
        Product product = new Product(pid,price, quantity);
        System.out.println("Product information");
        product.displayProductInfo();

    }
}
