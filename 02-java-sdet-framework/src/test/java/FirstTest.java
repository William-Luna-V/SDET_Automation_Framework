//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class FirstTest {
    @Test
    public void shouldVerifySum(){
//        int suma = 2 + 2;
        Assert.assertEquals(2+2,4,"No pasó");
    }
//    @BeforeMethod
//    public void shouldPrepareEnv(){
//        System.out.println("Preparando entorno");
//    }
//
//    @Test
//    public void shouldPrintFirstTest(){
//        System.out.println("Ejecutando Test 1");
//    }
//
//    @Test
//    public void shouldPrintSecondTest(){
//        System.out.println("Ejecutando Test 2");
//    }
//
//    @AfterMethod
//    public void shouldCleanEnv(){
//        System.out.println("Limpiando entorno");
//    }
}
