public class Employee implements Taxable{
    int empId;
    String name;
    double salary;

    public Employee(int empId, String name, double salary){
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    //implementing the caltax to calculate the tax for year
    @Override
    public double calTax(){
        return salary * INCOME_TAX;
    }

    //method to display emp information
    public void displayEmployeeInfo(){
        System.out.println("Employee Id: " + empId);
        System.out.println("Employee name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Income Tax: " + calTax());
    }
}
