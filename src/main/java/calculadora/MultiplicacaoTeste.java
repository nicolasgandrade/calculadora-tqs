package calculadora;

public class MultiplicacaoTeste {
    public static void main(String[] args) {
        Multiplicacao multiplicacao = new Multiplicacao();

        // Teste 1: Multiplicação entre dois números diferentes
        int resultado = multiplicacao.multiplicar(2, 3);
        System.out.println(resultado);

        // Teste 2: Multiplicação entre dois números positivos
        resultado = multiplicacao.multiplicar(2, 2);
        System.out.println(resultado);

        // Teste 3: Multiplicação entre um número positivo e um negativo
        resultado = multiplicacao.multiplicar(2, -2);
        System.out.println(resultado);

        // Teste 4: Multiplicação entre dois números negativos
        resultado = multiplicacao.multiplicar(-2, -2);
        System.out.println(resultado);

        // Teste 5: Multiplicação entre os maiores números suportados por int
        resultado = multiplicacao.multiplicar(2147483647, 2147483647);
        System.out.println(resultado);
        // Report: A IDE acusa um numeric overflow e o resultado dá errado.

        // Teste 6: Multiplicação entre os menores números suportados por int
        resultado = multiplicacao.multiplicar(-2147483647, -2147483647);
        System.out.println(resultado);
        // Report: A IDE acusa um numeric overflow e o resultado dá errado.

        // Teste 7: Multiplicação entre o menor e maior número suportados por int
        resultado = multiplicacao.multiplicar(-2147483647, 2147483647);
        System.out.println(resultado);
        // Report: A IDE acusa um numeric overflow e o resultado dá errado.
    }
}
