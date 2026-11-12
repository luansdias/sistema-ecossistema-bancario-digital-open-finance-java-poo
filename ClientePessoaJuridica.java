public class ClientePessoaJuridica extends Cliente {
    
    private String nomeFantasia, ramo;
    private double rendaAnual;
    
    public ClientePessoaJuridica(int id, String nome, String cpf, String endereco, 
    String kyc, String nomeFantasia, String ramo, double rendaAnual) {
        
        super(id, nome, cpf, endereco, kyc);
        
        this.nomeFantasia = nomeFantasia;
        this.ramo = ramo;
        this.rendaAnual = rendaAnual;
    }
    
    public double getRendaAnual() {
        return rendaAnual;
    }
}