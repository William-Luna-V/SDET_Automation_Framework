package calculator;

public class Calculator {
    public int add(int a, int b){
        int sum = a+b;
        return sum;
    }

    public int substract(int a, int b){
        int sustraction = a-b;
        return sustraction;
    }

    public int multiply(int a, int b){
        int product = a*b;
        return product;
    }

    public float divide(int a, int b){
        if(b==0){
            throw new ArithmeticException("Error: no se puede dividir entre cero");
        }
        int division = a/b;
        return division;
    }
}
