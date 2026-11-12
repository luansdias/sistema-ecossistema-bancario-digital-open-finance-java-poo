public class ContaInvestimento extends ContaBancaria {
    
    private double taxaCorretagem;
    private String perfilInvestidor;
    
    public ContaInvestimento(Cliente cliente, int numeroConta, int saldoDisponivel,
    int senha, int agencia, double taxaCorretagem, String perfilInvestidor) {
        
    super(cliente, numeroConta, saldoDisponivel, senha, agencia);
    
    this.taxaCorretagem = taxaCorretagem;
    this.perfilInvestidor = perfilInvestidor;
    
    }
}