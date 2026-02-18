void main() {
    Integer[] numericArray = {100, 200, 300, 400};
    String[] textArray = {"OOP", "Structures", "Data"};
    Double[] decimalArray = {3.1416, 2.718, 1.618};

    System.out.println("Method Execution");

    printArray(numericArray);
    printArray(textArray);
    printArray(decimalArray);
}

<T> void printArray(T[] data) {
    System.out.print("Array Output: ");
    for (T element : data) {
        System.out.print(element + " | ");
    }
    System.out.println(" ");
}