package Payroll;

public class Employee extends EmployeeInfo {

    // Constructor that calls the parent class
    public Employee(String fullName, String identification, String position) {
        super(fullName, identification, position);
    }

    @Override
    public double calculateEarnings() {
        double min = 2000000;
        double max = 3000000;

        // We generate the number with decimals
        double randomValue = min + (Math.random() * (max - min));

        // Math.round() converts it to the nearest integer
        return Math.round(randomValue);
    }
}