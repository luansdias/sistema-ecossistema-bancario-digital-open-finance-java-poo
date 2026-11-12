public class ContaCorrente extends ContaBancaria {
    
    private double taxaMensal, cheque;
    
    public ContaCorrente(Cliente cliente, int numeroConta, int saldoDisponivel,
    int senha, int agencia, double taxaMensal, double cheque) {
        
        super(cliente, numeroConta, saldoDisponivel, senha, agencia);
        
        this.taxaMensal = taxaMensal;
        this.cheque = cheque;
    }
    
    
}