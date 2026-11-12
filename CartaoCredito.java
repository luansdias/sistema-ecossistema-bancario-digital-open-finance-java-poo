public class CartaoCredito extends Cartao {
    
    private double limiteDisponivel, limiteTotal, faturaAtual;
    private int melhorDia;
    
    public CartaoCredito(String numeroCartao, String dataValidade, String nomeImpresso,
    String status, int cvv, double limiteDisponivel, double limiteTotal, double faturaAtual,
    int melhorDia) {
        
        super(numeroCartao, dataValidade, nomeImpresso, status, cvv);
        
        this.limiteDisponivel = limiteDisponivel;
        this.limiteTotal = limiteTotal;
        this.faturaAtual = faturaAtual;
        this.melhorDia = melhorDia;
    }
    
    public double getLimiteDisponivel() {
    return limiteDisponivel;
    }

    public void setLimiteDisponivel(double limite) {
    this.limiteDisponivel = limite;
    }

    public double getFaturaAtual() {
    return faturaAtual; 
    }

    public void setFaturaAtual(double fatura) {
    this.faturaAtual = fatura;
    }
    
}