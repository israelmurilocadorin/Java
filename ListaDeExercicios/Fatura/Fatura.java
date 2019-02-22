public class Fatura{
    
    private String codigo;
    private String descricao;
    private Integer quantidade;
    private double preco;
    
    public Fatura(){
    
    }
    
    public double Calcular (double preco, int quantidade){
        double resultado = preco * quantidade;
        return resultado;
    }
}
