import javax.swing.JOptionPane;

void main() {
    // Main options menu
    String menu = "Select an option:\n"
            + "1. Generate even numbers\n"
            + "2. Generate multiples of 7\n"
            + "3. Combined sum of multiples\n"
            + "4. Exit";

    boolean running = true;

    while (running) {
        String option = JOptionPane.showInputDialog(null, menu);

        if (option == null || option.equals("4")) {
            running = false;
        } else {
            switch (option) {
                case "1" -> {
                    // Request parameters for even numbers
                    String pStr = JOptionPane.showInputDialog("Enter start value (P):");
                    String qStr = JOptionPane.showInputDialog("Enter end value (Q):");
                    int p = Integer.parseInt(pStr);
                    int q = Integer.parseInt(qStr);
                    generateEvenNumbers(p, q);
                }
                case "2" -> {
                    // Request limit for multiples
                    String zStr = JOptionPane.showInputDialog("How many multiples of 7 do you want to generate?");
                    int z = Integer.parseInt(zStr);
                    generateMultiplesOfSeven(z);
                }
                case "3" -> {
                    // Request quantities for the sum
                    String mStr = JOptionPane.showInputDialog("How many multiples of 5 do you want to sum?");
                    String nStr = JOptionPane.showInputDialog("How many multiples of 8 do you want to sum?");
                    int m = Integer.parseInt(mStr);
                    int n = Integer.parseInt(nStr);
                    calculateCombinedMultiplesSum(m, n);
                }
                default -> JOptionPane.showMessageDialog(null, "Option not recognized");
            }
        }
    }
}

void generateEvenNumbers(int start, int end) {
    int min = Math.min(start, end);
    int max = Math.max(start, end);

    // Use StringBuilder to concatenate the result
    StringBuilder result = new StringBuilder();
    result.append("Even numbers between ").append(min).append(" and ").append(max).append(":\n");

    for (int i = min; i <= max; i++) {
        if (i % 2 == 0) {
            result.append(i).append(" ");
        }
    }
    JOptionPane.showMessageDialog(null, result.toString());
}

void generateMultiplesOfSeven(int limit) {
    StringBuilder result = new StringBuilder();
    result.append("First ").append(limit).append(" multiples of 7:\n");

    for (int i = 1; i <= limit; i++) {
        result.append(i * 7).append(" ");
    }
    JOptionPane.showMessageDialog(null, result.toString());
}

void calculateCombinedMultiplesSum(int countFive, int countEight) {
    int sumFive = getMultiplesSum(countFive, 5);
    int sumEight = getMultiplesSum(countEight, 8);
    int total = sumFive + sumEight;

    String message = "Results:\n"
            + "Sum of multiples of 5: " + sumFive + "\n"
            + "Sum of multiples of 8: " + sumEight + "\n"
            + "Combined total: " + total;

    JOptionPane.showMessageDialog(null, message);
}

// Helper method to calculate summations
int getMultiplesSum(int n, int base) {
    int accumulated = 0;
    for (int i = 1; i <= n; i++) {
        accumulated += (i * base);
    }
    return accumulated;
}