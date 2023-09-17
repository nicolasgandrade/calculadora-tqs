package calculadora;

import org.junit.Assert;
import org.junit.Test;

public class SomaJunitTest {
    @Test
    public void somaDeDoisValoresPositivos() {
        Soma soma = new Soma();
        int resultado = soma.somar(3, 7);

        Assert.assertEquals(10, resultado);
    }

    @Test
    public void somaDeDoisValoresSendoUmZero() {
        Soma soma = new Soma();
        int resultado = soma.somar(0, 10);

        Assert.assertEquals(10, resultado);
    }

    @Test
    public void somaDeDoisValoresSendoAmbosZero() {
        Soma soma = new Soma();
        int resultado = soma.somar(0, 0);

        Assert.assertEquals(0, resultado);
    }

    @Test
    public void somaDeDoisValoresSendoUmNegativo() {
        Soma soma = new Soma();
        int resultado = soma.somar(3, -13);

        Assert.assertEquals(-10, resultado);
    }

    @Test
    public void somaDeDoisValoresNegativos() {
        Soma soma = new Soma();
        int resultado = soma.somar(-3, -7);

        Assert.assertEquals(-10, resultado);
    }

    @Test
    public void somaDeUmNumeroMinimoEMaximoSuportadosPeloInt() {
        Soma soma = new Soma();
        int resultado = soma.somar(-2147483647, 2147483647);

        Assert.assertEquals(0, resultado);
    }

    @Test
    public void somaDeDoisIntsMaximos() {
        Soma soma = new Soma();
        int resultado = soma.somar(2147483647, 2147483647);

        Assert.assertEquals(4294967294L, resultado);
    }

    @Test
    public void somaDeDoisIntsMinimos() {
        Soma soma = new Soma();
        int resultado = soma.somar(-2147483647, -2147483647);

        Assert.assertEquals(-4294967294L, resultado);
    }
}
