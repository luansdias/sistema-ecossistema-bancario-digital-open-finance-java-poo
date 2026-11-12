public class EmprestimoFinanciamento {
    
    private Cliente cliente;
    private double valorSolicitado, taxaJuros;
    private int qtdParcelas;
    private String status;
    
    public EmprestimoFinanciamento(Cliente cliente, double valorSolicitado, double taxaJuros,
    int qtdParcelas) {
        
        this.cliente = cliente;
        this.valorSolicitado = valorSolicitado;
        this.taxaJuros = taxaJuros;
        this.qtdParcelas = qtdParcelas;
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public double getValorSolicitado() {
        return valorSolicitado;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
}