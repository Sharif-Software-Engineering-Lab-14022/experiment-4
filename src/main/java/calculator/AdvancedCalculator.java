package calculator;

public class AdvancedCalculator {
    public float applyOperator(int a, int b, char operator) {
        switch (operator) {
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new IllegalArgumentException("Cannot divide by zero");
                }
                return (float) a / b;
            case '^':
                if (b == 0)
                    return 1;

                float positiveB = b > 0 ? b : -b;
                float result = 1;

                for (int i = 0; i < positiveB; i++) {
                    result *= a;
                }

                return b > 0 ? result : 1 / result;
            default:
                throw new IllegalArgumentException("Invalid operator");
        }
    }
}
