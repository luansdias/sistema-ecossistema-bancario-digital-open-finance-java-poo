public class ClientePessoaFisica extends Cliente {
    
    private String dataNascimento, estadoCivil;
    private double rendaMensal;
    
    public ClientePessoaFisica(int id, String nome, String cpf, String endereco, 
    String kyc, String dataNascimento, String estadoCivil, double rendaMensal) {
        
        super(id, nome, cpf, endereco, kyc);
        
        this.dataNascimento = dataNascimento;
        this.estadoCivil = estadoCivil;
        this.rendaMensal = rendaMensal;
        
    }
    
    public double getRendaMensal() {
        return rendaMensal;
    }
    
    
}