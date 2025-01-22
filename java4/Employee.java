public class Employee {
    // Attributes (Fields)
    private String name;
    private int id;
    private double salary;
    private String department;

    // Constructor
    public Employee(String name, int id, double salary, String department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
    }

    // Getters and Setters (Methods to access and update the attributes)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Method to display employee details
    public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: $" + salary);
        System.out.println("Department: " + department);
    }

    // Method to calculate yearly salary
    public double calculateYearlySalary() {
        return salary * 12;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating an instance of Employee
        Employee emp = new Employee("John Doe", 101, 5000.00, "IT");
        
        // Displaying employee information
        emp.displayEmployeeInfo();
        
        // Calculating and displaying yearly salary
        System.out.println("Yearly Salary: $" + emp.calculateYearlySalary());
    }
}
