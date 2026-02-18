import javax.swing.JOptionPane;
import java.util.Random;

int[][] matrix;
int dimension = 10;

void main() {
    matrix = new int[dimension][dimension];
    Random random = new Random();

    // We build the matrix text ONCE to use it in all windows
    StringBuilder matrixVisualizer = new StringBuilder("Matrix\n");

    // 1. Random filling (0-9)
    for (int i = 0; i < dimension; i++) {
        for (int j = 0; j < dimension; j++) {
            int number = random.nextInt(10);
            matrix[i][j] = number;
            matrixVisualizer.append(number).append("   ");
        }
        matrixVisualizer.append("\n"); // Line break
    }

    // We save the "snapshot" of the matrix in a constant String
    String fullMatrixText = matrixVisualizer.toString();

    // 2. Reverse traversal
    StringBuilder traversalLog = new StringBuilder();
    int counter = 0;

    // We start from the last row and last column backwards
    for (int i = dimension - 1; i >= 0; i--) {
        for (int j = dimension - 1; j >= 0; j--) {
            traversalLog.append(matrix[i][j]).append("  ");
            counter++;

            // Alert every 10 elements
            if (counter % 10 == 0) {
                // TRICK: We show the original matrix ABOVE and the progress BELOW
                String alertMessage = fullMatrixText +
                                       "\n----------------------------------------\n" +
                                       "Traversal\n" +
                                       traversalLog.toString() +
                                       "\n\n" + counter + " numbers processed";

                JOptionPane.showMessageDialog(null, alertMessage);
            }
        }
    }

    // Final message
    JOptionPane.showMessageDialog(null, fullMatrixText +
            "\n\nTotal elements traversed: " + counter);
}