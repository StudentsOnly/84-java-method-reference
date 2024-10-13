## Exercise: Method Reference 

### Instructions:
Create a program that challenges you to use method references in various scenarios. 

### Perform the following tasks:

1.	Create a functional interface MathOperation with a single abstract method that takes two integers and returns an integer result.
2.	Implement three static methods:
    -	addNumbers that adds two integers.
    -	subtractNumbers that subtracts the second integer from the first.
    -	multiplyNumbers that multiplies two integers.
3.	Create a method performOperation that takes two integers and a MathOperation interface implementation. This method should apply the given operation and return the result.
4.	In the main method:
    -	Use a lambda expression to pass the addNumbers method to performOperation.
    -	Use a method reference to pass the subtractNumbers method to performOperation.
    -	Use a method reference to pass the multiplyNumbers method to performOperation.
