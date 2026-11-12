import java.time.LocalDateTime;

public class AuditoriaSeguranca {
    
    private String tentativas, bloqueios, logs;
    private LocalDateTime dataHora;
    
    public AuditoriaSeguranca(String tentativas, String bloqueios, String logs) {
        
        this.tentativas = tentativas;
        this.bloqueios = bloqueios;
        this.logs = logs;
        this.dataHora = LocalDateTime.now();
    }
    
    public String getTentativas() {
    return tentativas;
    }

    public String getBloqueios() {
    return bloqueios;
    }

    public String getLogs() {
    return logs;
    }

    public LocalDateTime getDataHora() {
    return dataHora;
    }
    
}
