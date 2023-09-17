package calculadora;

import org.junit.Assert;
import org.junit.Test;

public class DivisaoJunitTest {
    @Test
    public void divisaoDeNumeroMaiorPorMenor() {
        Divisao divisao = new Divisao();
        int resultado = divisao.dividir(10, 2);

        Assert.assertEquals(5, resultado);
    }

    @Test
    public void divisaoDeNumeroMenorPorMaior() {
        Divisao divisao = new Divisao();
        int resultado = divisao.dividir(2, 4);

        Assert.assertEquals(0.5,  resultado);
    }

    @Test
    public void divisaoDeNumeroPorEleMesmo() {
        Divisao divisao = new Divisao();
        int resultado = divisao.dividir(5, 5);

        Assert.assertEquals(1,  resultado);
    }

    @Test
    public void divisaoEntreMaximoEMinimoInt() {
        Divisao divisao = new Divisao();
        int resultado = divisao.dividir(2147483647, -2147483647);

        Assert.assertEquals(-1,  resultado);
    }

    // O teste está verificando se o resultado terá uma Exception lançada
    @Test(expected = Exception.class)
    public void divisaoDeNumeroPorZero() {
        Divisao divisao = new Divisao();
        int resultado = divisao.dividir(10, 0);
    }

    @Test(expected = Exception.class)
    public void divisaoEntreZeros() {
        Divisao divisao = new Divisao();
        int resultado = divisao.dividir(0, 0);
    }

    @Test
    public void divisaoNumeroPositivoPorNegativo() {
        Divisao divisao = new Divisao();
        int resultado = divisao.dividir(10, -5);

        Assert.assertEquals(-2, resultado);
    }

    @Test
    public void divisaoNumeroNegativoPorPositivo() {
        Divisao divisao = new Divisao();
        int resultado = divisao.dividir(-10, 5);

        Assert.assertEquals(-2, resultado);
    }

    @Test
    public void divisaoEntreMinimoEMaximoInt() {
        Divisao divisao = new Divisao();
        int resultado = divisao.dividir(-2147483647, 2147483647);

        Assert.assertEquals(-1, resultado);
    }
}
