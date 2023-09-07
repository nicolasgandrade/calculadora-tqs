package calculadora;

public class DivisaoTeste {
    public static void main(String[] args) {
        Divisao divisao = new Divisao();

        //Teste 1: Divisão de um número maior por menor;
        int resultado = divisao.dividir(10, 2);
        System.out.println(resultado);

        //Teste 2: Divisão de um número menor por um maior;
        resultado = divisao.dividir(2, 4);
        System.out.println(resultado);
        //Report: O resultado mostrado é errado, visto que o tipo de dado do retorno é um inteiro e não mostra casas decimais.

        //Teste 3: Divisão de um número por ele mesmo;
        resultado = divisao.dividir(5, 5);
        System.out.println(resultado);

        //Teste 4: Divisão entre números máximo e mínimo suportados por int;
        resultado = divisao.dividir(2147483647, -2147483647);
        System.out.println(resultado);

        //Teste 5: Divisão de um número por zero;
//        resultado = divisao.dividir(10, 0);
//        System.out.println(resultado);
        //Report: É impossível dividir números por zero, causando uma ArithmeticException no programa.

        //Teste 6: Divisão entre zeros;
//        resultado = divisao.dividir(0, 0);
//        System.out.println(resultado);
        //Report: É impossível dividir números por zero, causando uma ArithmeticException no programa.

        //Teste 7: Divisão de um número positivo por um negativo;
        resultado = divisao.dividir(10, -5);
        System.out.println(resultado);

        //Teste 8: Divisão de um número negativo por um positivo;
        resultado = divisao.dividir(-10, 5);
        System.out.println(resultado);

        //Teste 9: Divisão entre números mínimo e máximo suportados por int;
        resultado = divisao.dividir(-2147483647, 2147483647);
        System.out.println(resultado);
    }
}
