package Payroll;

import javax.swing.JOptionPane;

public abstract class EmployeeInfo {
    protected String fullName;
    protected String identification;
    protected String department;

    public EmployeeInfo(String fullName, String identification, String department) {
        this.fullName = fullName;
        this.identification = identification;
        this.department = department;
    }

    // Abstract method to be implemented by child classes
    public abstract double calculateEarnings();

    // Shows information using dialog boxes
    public void printInformation() {
        double salary = calculateEarnings();
        String info = "EmployeeInfo Details:\n"
                + "ID: " + identification + "\n"
                + "Name: " + fullName + "\n"
                + "Position: " + department + "\n"
                + "Calculated Salary: $" + salary;

        JOptionPane.showMessageDialog(null, info);
    }
}