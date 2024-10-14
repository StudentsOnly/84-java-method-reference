@FunctionalInterface
interface MathOperation
{
    int operate(int a, int b);
}

public class MethodReference {
    public static void main(String[] args) {
        int x = 10;
        int y = 25;

        MathOperation addition = (a,b) -> addNumbers(a,b); // lambda
        int addResult = performOperation(x,y, addition);
        System.out.println("Addition: " + addResult);

        MathOperation substruction = MethodReference::subtractNumbers; //method reference
        int substrResult = performOperation(x,y, substruction);
        System.out.println("Substruction: " + substrResult);

        MathOperation multiplication = MethodReference::multiplyNumbers; //method reference
        int multResult = performOperation(x,y, multiplication);
        System.out.println("Multiplication: " + multResult);
    }

    private static int subtractNumbers(int a, int b){
        return a - b;
    }

    private static int multiplyNumbers(int a, int b){
        return a * b;
    }

    private static int addNumbers(int a, int b){
        return a + b;
    }

    private static int performOperation(int a, int b, MathOperation operation){
        return operation.operate(a,b);
    }

}