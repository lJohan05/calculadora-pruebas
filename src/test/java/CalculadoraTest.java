import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testSuma(){
        Assertions.assertEquals(10, Calculadora.sumar(5,5));
    }

    @Test
    public void testResta(){
        Assertions.assertEquals(10, Calculadora.restar(20,10));
    }

    @Test
    public void testMultiplicacion(){
        Assertions.assertEquals(10, Calculadora.multiplicar(5,2));
    }

    @Test
    public void testDivicion(){
        Assertions.assertEquals(10, Calculadora.dividir(20,2));
    }


}
