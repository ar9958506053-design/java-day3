// Main class
public class Main {
    public static void main(String[] args) {

        // --- Student Example ---
        Student s1 = new Student(101, "Satyam", 85);
        s1.display();
        s1.formatName();
        s1.showMarksArray();

        // --- Employee Examples ---
        Employee e1 = new Employee(1, "Rahul", 30000);
        Employee e2 = new Employee(2, "Aman", 35000);
        e1.display();
        e2.display();

        // --- Product Example (Encapsulation) ---
        Product product = new Product();
        product.setPrice(500);
        System.out.println("\nProduct Price: " + product.getPrice());

        // --- Inheritance Example ---
        CollegeStudent cs = new CollegeStudent(102, "Amit", 88, "AKTU");
        cs.displayCollegeStudent();

        // --- Method Overloading Example ---
        ProductBilling billing = new ProductBilling();
        billing.calculateBill(100);
        billing.calculateBill(100, 200);
        billing.calculateBill(100, 200, 300);
    }
}

// ---------------- Student Class ----------------
class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("\nStudent: " + id + " " + name + " " + marks);
    }

    void formatName() {
        System.out.println("Uppercase Name: " + name.toUpperCase());
    }

    void showMarksArray() {
        int[] arr = {marks, marks + 5, marks + 10};
        System.out.print("Marks Array: ");
        for (int m : arr) {
            System.out.print(m + " ");
        }
        System.out.println();
    }
}

// ---------------- Employee Class ----------------
class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("\nEmployee: " + id + " " + name + " Salary: " + salary);
    }
}

// ---------------- Product Class (Encapsulation) ----------------
class Product {
    private int price;

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

// ---------------- CollegeStudent Class (Inheritance) ----------------
class CollegeStudent extends Student {
    String collegeName;

    CollegeStudent(int id, String name, int marks, String collegeName) {
        super(id, name, marks);
        this.collegeName = collegeName;
    }

    void displayCollegeStudent() {
        display();
        System.out.println("College: " + collegeName);
    }
}

// ---------------- ProductBilling Class (Method Overloading) ----------------
class ProductBilling {

    void calculateBill(int a) {
        System.out.println("\nTotal Bill: " + a);
    }

    void calculateBill(int a, int b) {
        System.out.println("Total Bill: " + (a + b));
    }

    void calculateBill(int a, int b, int c) {
        System.out.println("Total Bill: " + (a + b + c));
    }
}

