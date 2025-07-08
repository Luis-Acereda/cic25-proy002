package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void shouldSumar() {
        App calculadora = new App();
        int resultado = calculadora.sumar(5, 5);
        assertEquals(10, resultado);
    }

    @Test
    public void shouldRestar() {
        App calculadora = new App();
        int resultado = calculadora.restar(5, 5);
        assertEquals(0, resultado);
    }

    @Test
    public void shouldMultiplicar() {
        App calculadora = new App();
        int resultado = calculadora.multiplicar(5, 5);
        assertEquals(25, resultado);
    }

    @Test
    public void shouldDividir() {
        App calculadora = new App();
        int resultado = calculadora.dividir(5, 5);
        assertEquals(1, resultado);
    }
}
