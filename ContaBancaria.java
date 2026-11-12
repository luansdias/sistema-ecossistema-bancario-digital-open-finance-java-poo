public abstract class ContaBancaria {
    
    private Cliente cliente;
    private int numeroConta, saldoDisponivel, senha, agencia;
    
    public ContaBancaria(Cliente cliente, int numeroConta, int saldoDisponivel, int senha, int agencia) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldoDisponivel = saldoDisponivel;
        this.senha = senha;
        this.agencia = agencia;
    }
    
    public void setsaldoDisponivel(int saldo) {
        
        saldoDisponivel = saldo;
        
    }
    
    public int getSaldoDisponivel() {
        return saldoDisponivel;
    }
    
}