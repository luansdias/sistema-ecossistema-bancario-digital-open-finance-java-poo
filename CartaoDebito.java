public class CartaoDebito extends Cartao {
    
    private ContaBancaria conta;
    
    public CartaoDebito(String numeroCartao, String dataValidade, String nomeImpresso,
    String status, int cvv, ContaBancaria conta) {
        
        super(numeroCartao, dataValidade, nomeImpresso, status, cvv);
        
        this.conta = conta;
    }
    
    public ContaBancaria getConta() {
    return conta;
    }
    
    
}