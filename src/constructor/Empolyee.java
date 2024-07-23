package constructor;

public class Empolyee {
    private String name;
    private String designation;
    private double salary;

    public Empolyee (String name, String designation, double salary) {
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    } 

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
    	Empolyee  employee1 = new Empolyee ("Suchit", "Software Engineer", 75000);

        System.out.println("Employee Information:");
        employee1.displayInfo();
    }
}