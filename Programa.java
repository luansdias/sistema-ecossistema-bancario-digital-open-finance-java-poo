public class Programa {
    
    public static void main(String[] args) {
        
        BancoSistemaCentral banco = new BancoSistemaCentral();
        
        Cliente clienteFisico = new ClientePessoaFisica(0001, "Luan Silva Dias", "123.456.789-10",
        "Rua Tanto Faz, 28", "Aprovado", "06/03/2002", "Solteiro", 1000);
        
        Cliente clienteJuridico = new ClientePessoaJuridica(0002, "Epaminondas da Silva", "12.345.678/0001-90",
        "Rua Não faz nada, 24", "Aprovado", "Epaminondas Comércio", "Comércio varejista", 80000);
        
        banco.cadastrarCliente(clienteFisico);
        banco.cadastrarCliente(clienteJuridico);
        
        ContaBancaria contaCorrente = new ContaCorrente(clienteFisico, 1234, 1000, 7070, 2424, 10, 500);
        ContaBancaria contaPoupanca = new ContaPoupanca(clienteFisico, 4321, 500, 5566, 1234, 0.05, 22);
        ContaBancaria contaInvestimento = new ContaInvestimento(clienteJuridico, 8989, 2000, 7070, 1234, 0.12, "Conservador");
        
        banco.abrirConta(contaCorrente);
        banco.abrirConta(contaPoupanca);
        banco.abrirConta(contaInvestimento);
        
        CartaoCredito cartaoCreditoFisica = new CartaoCredito("1234-5678,9101-0182", "20/12/2034", "Luan Silva Dias", "Ativo", 123, 2000, 2500, 200, 15);
        CartaoCredito cartaoCreditoJuridico = new CartaoCredito("1724-5128,9101-0182", "20/12/2044", "Epaminondas da Silva", "Ativo", 189, 1000, 3500, 2000, 1);
        
        CartaoDebito cartaoDebitoFisica = new CartaoDebito("1234-5678,9101-0182", "20/12/2034", "Luan Silva Dias", "Ativo", 123, contaCorrente);
        CartaoDebito cartaoDebitoJuridico = new CartaoDebito("1234-5678,9101-0182", "20/12/2034", "Epaminondas da Silva", "Ativo", 123, contaInvestimento);
        
        banco.emitirCartao(cartaoCreditoFisica);
        banco.emitirCartao(cartaoCreditoJuridico);
        banco.emitirCartao(cartaoDebitoFisica);
        banco.emitirCartao(cartaoDebitoJuridico);
        
        System.out.println("=======DEPOSITO=======");
        banco.depositar(contaCorrente, 400);
        
        //sacando um valor maior q o disponivel
        System.out.println("========SAQUE=========");
        banco.sacar(contaCorrente, 2000);
        //agr um valor q é possivel
        banco.sacar(contaCorrente, 1000);
        
        System.out.println("====TRANSFERENCIA====");
        //transferindo um valor maior q o disponivel
        banco.transferir(contaCorrente, contaPoupanca, 500);
        // transferindo um valor possivel
        banco.transferir(contaCorrente, contaPoupanca, 200);
        
        System.out.println("=========EMPRESTIMO========");
        //simulando um emprestimo aprovado
        EmprestimoFinanciamento emprestimo1 = new EmprestimoFinanciamento(clienteFisico, 10000, 0.05, 12);
        banco.solicitarEmprestimo(emprestimo1);
        //emprestimo recusado
        EmprestimoFinanciamento emprestimo2 = new EmprestimoFinanciamento(clienteFisico, 15000, 0.05, 12);
        banco.solicitarEmprestimo(emprestimo2);
        
        System.out.println("==========CARTAO DE CREDITO===========");
        //compra aprovada
        banco.fazerCompra(cartaoCreditoFisica, 400);
        //compra recusada
        banco.fazerCompra(cartaoCreditoFisica, 1700);
        
        System.out.println("=======CARTAO DE DEBITO=======");
        //compra aprovada
        banco.fazerCompraDebito(cartaoDebitoFisica, 100);
        //compra recusada
        banco.fazerCompraDebito(cartaoDebitoFisica, 300);
        
        //auditoria
        
        AuditoriaSeguranca auditoria = new AuditoriaSeguranca("3 tentativas suspeitas", "1 bloqueio de acesso",
        "Acesso não autorizado detectado");
        banco.registrarAuditoria(auditoria);

        System.out.println("===== RELATÓRIO DE AUDITORIA =====");
        banco.exibirRelatorioAuditoria();
       
        // extrato
       
        System.out.println("===== EXTRATO CONSOLIDADO =====");
        banco.exibirExtratos();
        
        
}
}