import java.util.ArrayList;

public class BancoSistemaCentral {
    
    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<ContaBancaria> contas = new ArrayList<>();
    ArrayList<Cartao> cartoes = new ArrayList<>();
    ArrayList<AuditoriaSeguranca> auditorias = new ArrayList<>();
    
    public void cadastrarCliente(Cliente cliente) {
        
        clientes.add(cliente);
    }
    
    public void abrirConta(ContaBancaria conta) {
        contas.add(conta);
    }
    
    public void emitirCartao(Cartao cartao) {
        cartoes.add(cartao);
    }
    
    public void registrarAuditoria(AuditoriaSeguranca auditoria) {
        auditorias.add(auditoria);
    }
    
    public void depositar(ContaBancaria conta, int deposito) {
        int saldoAtual = conta.getSaldoDisponivel();
        conta.setsaldoDisponivel(saldoAtual + deposito);
        System.out.println("Depósito realizado!  \nSeu novo saldo é: " + conta.getSaldoDisponivel());
    }
    
    public void sacar(ContaBancaria conta, int saque) {
        int saldoAtual = conta.getSaldoDisponivel();
        if(saque > saldoAtual) {
            System.out.println("O valor de saque não pode ser maior do que o disponível na conta.");
            System.out.println("Seu saldo atual é: " + saldoAtual);
        }
        
        else {
            conta.setsaldoDisponivel(saldoAtual - saque);
            System.out.println("Saque Realizado! \nSeu novo saldo é: " + conta.getSaldoDisponivel());
        }
    }
    
    public void transferir(ContaBancaria origem, ContaBancaria destino, int valor) {
        int saldoOrigem = origem.getSaldoDisponivel();
        int saldoDestino = destino.getSaldoDisponivel();
        
        if(valor > saldoOrigem) {
            System.out.println("Você não tem esse valor disponível.");
            System.out.println("Seu saldo atual é: " + saldoOrigem);
        }
        
        else {
            destino.setsaldoDisponivel(saldoDestino + valor);
            origem.setsaldoDisponivel(saldoOrigem - valor);
            System.out.println("Transferência Realizada! \nNovo Saldo da conta de origem: " + origem.getSaldoDisponivel()
            + " \nNovo saldo da conta de destino: " + destino.getSaldoDisponivel());
        }
    }
    
    public void solicitarEmprestimo(EmprestimoFinanciamento emprestimo) {
        
        Cliente cliente = emprestimo.getCliente();
        double valor = emprestimo.getValorSolicitado();
        
        if(cliente instanceof ClientePessoaFisica) {
            ClientePessoaFisica pessoaFisica = (ClientePessoaFisica) cliente;
            double renda = pessoaFisica.getRendaMensal();
            
            if (valor <= renda * 12) {
           System.out.println("Empréstimo aprovado!");
           emprestimo.setStatus("Aprovado.");
               }
            else {
              System.out.println("Empréstimo recusado!");
              emprestimo.setStatus("Recusado.");
            }
        }
        
        if(cliente instanceof ClientePessoaJuridica) {
            ClientePessoaJuridica pessoaJuridica = (ClientePessoaJuridica) cliente;
            double rendaAnual = pessoaJuridica.getRendaAnual();
            
            if (valor <= rendaAnual) {
                System.out.println("Empréstimo Aprovado!");
                emprestimo.setStatus("Aprovado.");
            }
            
            else {
                System.out.println("Empréstimo Recusado!");
                emprestimo.setStatus("Recusado.");
            }
        }
        
    }
    
    public void fazerCompra(CartaoCredito cartao, double valor) {
        
        double limiteDisponivel = cartao.getLimiteDisponivel();
        double faturaAtual = cartao.getFaturaAtual();
        
        if(valor <= limiteDisponivel) {
            System.out.println("Compra Realizada!");
            cartao.setLimiteDisponivel(limiteDisponivel - valor);
            cartao.setFaturaAtual(faturaAtual + valor);
            System.out.println("Limite Disponível: " + cartao.getLimiteDisponivel());
            System.out.println("Fatura Atual: " + cartao.getFaturaAtual());
        }
        
        else {
            System.out.println("Cartão Recusado. Limite indisponível.");
            System.out.println("Seu limite é: " + cartao.getLimiteDisponivel());
        }
        
    }
    
    public void fazerCompraDebito(CartaoDebito cartao, int valor) {
    ContaBancaria conta = cartao.getConta();
    int saldoAtual = conta.getSaldoDisponivel();

    if (valor <= saldoAtual) {
        conta.setsaldoDisponivel(saldoAtual - valor);
        System.out.println("Compra realizada!");
        System.out.println("Saldo disponível: " + conta.getSaldoDisponivel());
    } 
    
    else {
        System.out.println("Compra recusada. Saldo insuficiente.");
        System.out.println("Seu saldo é: " + saldoAtual);
    }
}
    
    public void exibirExtratos() {
        
        for(int x = 0; x < contas.size(); x++) {
            
            System.out.println("Saldo da conta " + (x+1) + ":" + contas.get(x).getSaldoDisponivel());
            
        }
        
    }
    
    public void exibirRelatorioAuditoria() {

    for (int x = 0; x < auditorias.size(); x++) {

        AuditoriaSeguranca auditoria = auditorias.get(x);

        System.out.println("===== AUDITORIA " + (x + 1) + " =====");
        System.out.println("Tentativas: " + auditoria.getTentativas());
        System.out.println("Bloqueios: " + auditoria.getBloqueios());
        System.out.println("Logs: " + auditoria.getLogs());
        System.out.println("Data e hora: " + auditoria.getDataHora());
    }
}
    
}
