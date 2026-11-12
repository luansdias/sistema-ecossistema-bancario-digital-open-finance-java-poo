public class ContaPoupanca extends ContaBancaria {
    
    private double taxaRendimento;
    private int aniversario;
    
    public ContaPoupanca(Cliente cliente, int numeroConta, int saldoDisponivel,
    int senha, int agencia, double taxaRendimento, int aniversario) {
        
        super(cliente, numeroConta, saldoDisponivel, senha, agencia);
        
        this.taxaRendimento = taxaRendimento;
        this.aniversario = aniversario;
    }
    
}