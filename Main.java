class Main {
    public static void main(String[] args) {

        // lambda
        System.out.println(MathOperations.performOperation(5, 2, (a, b) -> MathOperations.addNumbers(a, b)));

        // method reference
        System.out.println(MathOperations.performOperation(5, 3, MathOperations::substractNumbers));
        System.out.println(MathOperations.performOperation(5, 3, MathOperations::multiplyNumbers));

    }
}

class MathOperations {

    static int addNumbers(int a, int b) {
        return a + b;
    }

    static int substractNumbers(int a, int b) {
        return a - b;
    }

    static int multiplyNumbers(int a, int b) {
        return a * b;
    }

    static int performOperation(int a, int b, MathOperation mathOperation) {
        return mathOperation.execute(a, b);
    }
}
