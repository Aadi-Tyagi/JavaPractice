package Week2;

abstract class Employee {
    String employeeName;
    double employeeSalary;
    public Employee(String employeeName, double employeeSalary) {
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    abstract double calculateSalary();

}

class Manager extends Employee{
    public Manager(String employeeName, double employeeSalary) {
        super(employeeName, employeeSalary);
    }

    public double calculateSalary(){
        return getEmployeeSalary() * 1.2;
    }

}

class Developer extends Employee{
    public Developer(String employeeName, double employeeSalary) {
        super(employeeName, employeeSalary);
    }

    @Override
    double calculateSalary() {
        return getEmployeeSalary() * 1.1;
    }
}

class Challenge6{
    public static void main(String[] args) {
        // Create a manager
        Manager alice = new Manager("Alice", 80000);

        // Create a developer
        Developer bob = new Developer("Bob", 60000);

        // Print details and calculated salaries
        printEmployeeDetails(alice);
        printEmployeeDetails(bob);
    }

    // Function to print employee details and calculated salary
    private static void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getEmployeeName());
        System.out.println("Base Salary: $" + employee.getEmployeeSalary());
        System.out.println("Calculated Salary: $" + employee.calculateSalary());
        System.out.println("----------------------------------");
    }

}
