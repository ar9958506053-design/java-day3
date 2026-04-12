// ProductBilling class to demonstrate method overloading
class ProductBilling {

    // method for 1 product
    void calculateBill(int a) {
        System.out.println("\nTotal Bill (1 product): " + a);
    }

    // method for 2 products
    void calculateBill(int a, int b) {
        System.out.println("Total Bill (2 products): " + (a + b));
    }

    // method for 3 products
    void calculateBill(int a, int b, int c) {
        System.out.println("Total Bill (3 products): " + (a + b + c));
    }
}