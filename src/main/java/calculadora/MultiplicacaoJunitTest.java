package calculadora;

import org.junit.Assert;
import org.junit.Test;

public class MultiplicacaoJunitTest {

    @Test
    public void multiplicacaoEntreDoisNumerosPositivosDiferentes() {
        Multiplicacao multiplicacao = new Multiplicacao();
        int resultado = multiplicacao.multiplicar(2, 3);

        Assert.assertEquals(6, resultado);
    }

    @Test
    public void multiplicacaoEntreDoisNumerosPositivosIguais() {
        Multiplicacao multiplicacao = new Multiplicacao();
        int resultado = multiplicacao.multiplicar(2, 2);

        Assert.assertEquals(4, resultado);
    }

    @Test
    public void multiplicacaoEntreUmNumeroPositivoEUmNegativo() {
        Multiplicacao multiplicacao = new Multiplicacao();
        int resultado = multiplicacao.multiplicar(2, -2);

        Assert.assertEquals(-4, resultado);
    }

    @Test
    public void multiplicacaoEntreDoisNumerosNegativos() {
        Multiplicacao multiplicacao = new Multiplicacao();
        int resultado = multiplicacao.multiplicar(-2, -2);

        Assert.assertEquals(4, resultado);
    }

    @Test
    public void multiplicacaoEntreDoisMaioresInts() {
        Multiplicacao multiplicacao = new Multiplicacao();
        int resultado = multiplicacao.multiplicar(2147483647, 2147483647);

        Assert.assertEquals(4611686014132421L^18, resultado);
    }

    @Test
    public void multiplicacaoEntreDoisMenoresInts() {
        Multiplicacao multiplicacao = new Multiplicacao();
        int resultado = multiplicacao.multiplicar(-2147483647, -2147483647);

        Assert.assertEquals(4611686014132421L^18, resultado);
    }

    @Test
    public void multiplicacaoEntreMaiorEMenorInt() {
        Multiplicacao multiplicacao = new Multiplicacao();
        int resultado = multiplicacao.multiplicar(-2147483647, 2147483647);

        Assert.assertEquals(-4611686014132421L^18, resultado);
    }
}
