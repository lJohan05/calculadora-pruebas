import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

public class CalculadoraTest {

    @InjectMocks
    Calculadora calculadora = new Calculadora(); //Dependiente

    @Mock
    CalculadoraAWS calculadoraAWS; //Dependencia, a la que se le hace la implementacion falsa

    @BeforeEach
    public void init(){
        //Comportamiento predecible de la dependencia
        MockitoAnnotations.openMocks(this);
        when(calculadoraAWS.sumar(5,5)).thenReturn(10.0);
        when(calculadoraAWS.sumar(7,5)).thenReturn(12.0);
        when(calculadoraAWS.sumar(2,5)).thenReturn(7.0);
    }

    @Test
    public void testSuma(){
        Assertions.assertEquals(10, calculadora.sumar(5,5));
    }

    @Test
    public void testResta(){
        Assertions.assertEquals(10, calculadora.restar(20,10));
    }

    @Test
    public void testMultiplicacion(){
        Assertions.assertEquals(10, calculadora.multiplicar(5,2));
    }

    @Test
    public void testDivision(){
        Assertions.assertEquals(10, calculadora.dividir(20,2));
    }

    //Si ejecutamos esta prueba sin mockito no funciona, ya que tenemos una dependecia que no ha sido resuelta
    @Test
    public void testSumarAWS(){
        Assertions.assertEquals(10, calculadora.sumarEnAWS(2,5));
    }

}
