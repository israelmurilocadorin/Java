public class Calculadora {

    public float Soma(float number1, float number2){
        float resultado;
        resultado = number1 + number2;
        return resultado;
    }

    public float Produto(float number1, float number2){
        float resultado;
        resultado = number1 * number2;
        return resultado;
    }

    public float Diferenca(float number1, float number2){
        float resultado;
        resultado = number1 - number2;
        return resultado;
    }

    public float Divisao(float number1, float number2){
        float resultado;
        resultado = number1 / number2;
        return resultado;
    }

    public float Maior(float number1, float number2){
        float resultado;
        if(number1 > number2){
            resultado = number1;
        } else {
            resultado = number2;
        }
        return resultado;
    }
}
