import javax.swing.JOptionPane;
import Payroll.*;

void main() {
    EmployeeInfo activeEmployeeInfo = null;
    boolean systemActive = true;

    // Main menu
    String menu = "Management System\n"
            + "1. Register EmployeeInfo\n"
            + "2. Consult EmployeeInfo Data\n"
            + "3. Finish";

    while (systemActive) {
        String input = JOptionPane.showInputDialog(null, menu);

        // Control to avoid errors if the user clicks cancel
        if (input == null) {
            systemActive = false;
            break;
        }

        switch (input) {
            case "1" -> {
                // Data capture via popup windows
                String name = JOptionPane.showInputDialog("Enter Full Name:");
                String id = JOptionPane.showInputDialog("Enter Identification:");
                String position = JOptionPane.showInputDialog("Enter Position:");

                // Object instance
                activeEmployeeInfo = new Employee(name, id, position);
                JOptionPane.showMessageDialog(null, "EmployeeInfo registered successfully.");
            }
            case "2" -> {
                // Existence validation
                if (activeEmployeeInfo != null) {
                    activeEmployeeInfo.printInformation();
                } else {
                    JOptionPane.showMessageDialog(null, "Error: No employees registered in memory.");
                }
            }
            case "3" -> {
                JOptionPane.showMessageDialog(null, "Closing system...");
                systemActive = false;
            }
            default -> JOptionPane.showMessageDialog(null, "Invalid option, try again.");
            }
    }
}