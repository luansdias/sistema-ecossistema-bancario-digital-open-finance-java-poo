public abstract class Cartao {
    
    private String numeroCartao, dataValidade, nomeImpresso, status;
    private int cvv;
    
    public Cartao(String numeroCartao, String dataValidade, String nomeImpresso,
    String status, int cvv) {
        
        this.numeroCartao = numeroCartao;
        this.dataValidade = dataValidade;
        this.nomeImpresso = nomeImpresso;
        this.status = status;
        this.cvv = cvv;
    }
}