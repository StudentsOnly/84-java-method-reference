public class Main {

  public static void main(String[] args) {

    var resultPlus = performOperation(1, 3, (a, b) -> MathOperation.addNumbers(a, b));
    System.out.println("1 + 3 = " + resultPlus);

    var resultMinus = performOperation(1, 3, MathOperation::subtractNumbers);
    System.out.println("1 - 3 = " + resultMinus);

    var resultMult = performOperation(1, 3, MathOperation::multiplyNumbers);
    System.out.println("1 * 3 = " + resultMult);

  }

  public static int performOperation(int a, int b, MathOperation mathOp) {
    return mathOp.apply(a, b);
  }
}
