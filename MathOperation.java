import java.util.function.BinaryOperator;

@FunctionalInterface
public interface MathOperation {

  int apply(int a, int b);

  static int addNumbers(int a, int b) {
    return a + b;
  }

  static int subtractNumbers(int a, int b) {
    return a - b;
  }

  static int multiplyNumbers(int a, int b) {
    return a * b;
  }
}
