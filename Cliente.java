public abstract class Cliente {
    
    private String nome, cpf, endereco, kyc;
    private int id;
    
    public Cliente(int id, String nome, String cpf, String endereco, String kyc) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.kyc = kyc;
    }
    
    
}