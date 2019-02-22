import java.text.DecimalFormat;

public class CalculadoraTeste {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        Calculadora calc = new Calculadora();
        int resultadoFinal;
        float resultadoDivisao;

        Integer number1 = Integer.valueOf(args[0]);
        Integer number2 = Integer.valueOf(args[1]);

        resultadoFinal = calc.Soma(number1, number2);
        System.out.println("Soma: " + resultadoFinal);

        resultadoFinal = calc.Produto(number1, number2);
        System.out.println("Produto: " + resultadoFinal);

        resultadoFinal = calc.Diferenca(number1, number2);
        System.out.println("Diferenca: " + resultadoFinal);

        resultadoDivisao = calc.Divisao(number1, number2);
        System.out.println("Divisão: " + (df.format(resultadoDivisao)));

        resultadoFinal = calc.Maior(number1, number2);
        System.out.println(resultadoFinal + " é maior");
    }

}
