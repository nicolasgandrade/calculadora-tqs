package calculadora;

import org.junit.Assert;
import org.junit.Test;

public class SubtracaoJunitTest {
    @Test
    public void subtracaoEntreUmNumeroMaiorEMenorPositivos() {
        Subtracao subtracao = new Subtracao();
        int resultado = subtracao.subtrair(10, 5);

        Assert.assertEquals(5, resultado);
    }

    @Test
    public void subtracaoEntreUmNumeroMenorEMaior() {
        Subtracao subtracao = new Subtracao();
        int resultado = subtracao.subtrair(5, 10);

        Assert.assertEquals(-5, resultado);
    }

    @Test
    public void subtracaoEntreNumerosIguais() {
        Subtracao subtracao = new Subtracao();
        int resultado = subtracao.subtrair(10, 10);

        Assert.assertEquals(0, resultado);
    }

    @Test
    public void subtracaoEntreUmNumeroMaiorEZero() {
        Subtracao subtracao = new Subtracao();
        int resultado = subtracao.subtrair(10, 0);

        Assert.assertEquals(10, resultado);
    }

    @Test
    public void subtracaoEntreZeroEUmNumeroPositivo() {
        Subtracao subtracao = new Subtracao();
        int resultado = subtracao.subtrair(0, 10);

        Assert.assertEquals(-10, resultado);
    }

    @Test
    public void subtracaoEntreZeros() {
        Subtracao subtracao = new Subtracao();
        int resultado = subtracao.subtrair(0, 0);

        Assert.assertEquals(0, resultado);
    }

    @Test
    public void subtracaoEntreDoisNumerosNegativos() {
        Subtracao subtracao = new Subtracao();
        int resultado = subtracao.subtrair(-10, -5);

        Assert.assertEquals(-5, resultado);
    }

    @Test
    public void subtracaoEntreUmNumeroPositivoEUmNegativo() {
        Subtracao subtracao = new Subtracao();
        int resultado = subtracao.subtrair(10, -5);

        Assert.assertEquals(15, resultado);
    }

    @Test
    public void subtracaoMaiorEMenorInts() {
        Subtracao subtracao = new Subtracao();
        int resultado = subtracao.subtrair(2147483647, -2147483647);

        Assert.assertEquals(4294967294L, resultado);
    }

    @Test
    public void subtracaoMenorEMaiorInts() {
        Subtracao subtracao = new Subtracao();
        int resultado = subtracao.subtrair(-2147483647, 2147483647);

        Assert.assertEquals(-4294967294L, resultado);
    }

    @Test
    public void subtracaoEntreMenoresNumerosInt() {
        Subtracao subtracao = new Subtracao();
        int resultado = subtracao.subtrair(-2147483647, -2147483647);

        Assert.assertEquals(0, resultado);
    }

    @Test
    public void subtracaoEntreMaioresNumerosInt() {
        Subtracao subtracao = new Subtracao();
        int resultado = subtracao.subtrair(2147483647, 2147483647);

        Assert.assertEquals(0, resultado);
    }
}
