import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Calculator1_1Test {
    public static void main(String[] args) {
        Calculator1_1 calculator = new Calculator1_1();
        double result = Calculator.add(10, 50);
        if (result != 60) {
            System.out.println("Bad result: " + result);
        }
    }
}
