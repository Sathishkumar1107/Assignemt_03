public class Product implements Taxable{
    int pid;
    double price;
    int quantity;

    public Product(int pid, double price, int quantity){
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    //implementing the caltax to calculate the tax for the product
    @Override
    public double calTax() {
        return price * SALES_TAX;
    }

    //Method to display to all information of the product
    public void displayProductInfo(){
        System.out.println("Product ID: " + pid);
        System.out.println("Unit Price: " + price);
        System.out.println("Quantity; " + quantity);
        System.out.println("Sales Tax (per unit): " + calTax());
    }



}
