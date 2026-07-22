import calculator.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class CalculatorTest {
    private Calculator calculator;

    @BeforeMethod
    public void shouldPrepareEnv(){
        calculator = new Calculator();
    }

    @Test
    public void shouldAddPositiveNumbers(){
        int result = calculator.add(2,2);
        Assert.assertEquals(result,4,"No se pueden sumar números positivos");
    }

    @Test
    public void shouldAddNegativeNumbers(){
        int result = calculator.add(-2,-2);
        Assert.assertEquals(result,-4,"No se pueden sumar números negativos");
    }

    @Test
    public void shouldAddAnyIntegerNumbers(){
        int result = calculator.add(2,-2);
        Assert.assertEquals(result,0,"No se pueden sumar números enteros");
    }

    @Test
    public void shouldSubstractPositiveNumbers(){
        int result = calculator.substract(2,2);
        Assert.assertEquals(result,0,"No se pueden restar números positivos");
    }

    @Test
    public void shouldSubstractNegativeNumbers(){
        int result = calculator.substract(-2,-2);
        Assert.assertEquals(result,0,"No se pueden restar números negativos");
    }

    @Test
    public void shouldSubstractAnyIntegerNumbers(){
        int result = calculator.substract(-2,2);
        Assert.assertEquals(result,-4,"No se pueden restar números enteros");
    }

    @Test
    public void shouldMultiplyByZero(){
        int result = calculator.multiply(-2,0);
        Assert.assertEquals(result,0,"No se puede multiplicar por cero");
    }

    @Test
    public void shouldThrowExceptionWhenDividingByZeroWithTryCatch(){
        try{
            calculator.divide(-2,0);
        }
        catch(ArithmeticException e){
            Assert.assertEquals(e.getMessage(),"Error: no se puede dividir entre cero");
        }
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void shouldThrowExceptionWhenDividingByZeroWithExpected(){
        calculator.divide(-2,0);
    }

}
