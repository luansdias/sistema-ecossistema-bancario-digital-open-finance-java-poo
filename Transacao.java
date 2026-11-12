import java.time.LocalDateTime;

public class Transacao {
    
    private String codigoTransacao, descricao;
    private LocalDateTime dataTransacao;
    private double valor;
    
    public Transacao(String codigoTransacao, double valor, String descricao) {
        
        this.codigoTransacao = codigoTransacao;
        this.valor = valor;
        this.descricao = descricao;
        this.dataTransacao = LocalDateTime.now();
    }
    
}