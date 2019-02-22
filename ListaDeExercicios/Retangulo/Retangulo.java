public class Retangulo {

    private double largura = 1;
    private double comprimento = 1;

    public boolean setComprimento(double comprimento) {
        if(comprimento > 0 || comprimento != largura){
            this.comprimento = comprimento;
            return true;
        } else {
            System.out.println("Erro: Um dos lados do retângulo é igual ou menor que zero.");
            return false;
        }
    }

    public double getComprimento() {
        return comprimento;
    }

    public boolean setLargura(double largura) {
        if(largura > 0 || largura != comprimento) {
            this.largura = largura;
            return true;
        } else {
            System.out.println("Erro: Um dos lados do retângulo é igual ou menor que zero.");
            return false;
        }
    }

    public double getLargura() {
        return largura;
    }

    public double Calcular(double comprimento, double largura) {
        double area = comprimento + largura;
        return area;
    }
}
