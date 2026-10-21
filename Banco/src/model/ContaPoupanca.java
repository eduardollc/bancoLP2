package model;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;

public class ContaPoupanca extends Conta {

    private Double saldo;
    private LocalDate dataUltimoRendimento;

    public ContaPoupanca(String numeroConta, String agencia, LocalDate dataUltimoRendimento, Double saldo, String senha) {
        super(numeroConta, agencia, senha);
        this.saldo = saldo;
        //Começa a contar apartir da data de abertura
        this.dataUltimoRendimento = getDataAberturaConta();
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public LocalDate getDataUltimoRendimento() {
        return dataUltimoRendimento;
    }

    public void setDataUltimoRendimento(LocalDate dataUltimoRendimento) {
        this.dataUltimoRendimento = dataUltimoRendimento;
    }

    public void aplicarJuros() {

        LocalDate dataPresente = LocalDate.now();
        long dias = ChronoUnit.DAYS.between(dataUltimoRendimento, dataPresente);

        if (saldo == 0) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente");
            return;
        }

        long periodos = dias / 30;

        if (periodos == 0) {
            long diasRestantes = 30 - dias;
            JOptionPane.showMessageDialog(null, "Faltam " + diasRestantes + " para o saldo receber o rendimento");
            return;
        }

        for (int i = 0; i < periodos; i++) {
            saldo += saldo * 0.015;
        }

        dataUltimoRendimento = dataPresente;

    }

    public void depositar(Double valor) {

        if (valor <= 0) {
            JOptionPane.showMessageDialog(null, "Erro, não é possivel depositar um valor abaixo ou igual a 0 !!!");
        } else {
            saldo += valor;
            JOptionPane.showMessageDialog(null, "Sucesso");
        }

    }

    public void sacar(Double valor) {

        if (valor > saldo) {
            JOptionPane.showMessageDialog(null, "Erro, não é possível sacar um valor maior que o saldo.");
        } else if (valor <= 0) {
            JOptionPane.showMessageDialog(null, "Erro, não é possível sacar um valor menor ou igual a 0.");
        } else {
            saldo -= valor;
            JOptionPane.showMessageDialog(null, "Sucesso");
        }

    }

    public void transferir(ContaCorrente contaCorrente, Double valor) {

        if (valor <= 0) {
            JOptionPane.showMessageDialog(null, "Digite um valor maior que zero.");
            return;
        } else if (valor > saldo) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
            return;
        } else {
            saldo -= valor;
            contaCorrente.setSaldo(contaCorrente.getSaldo() + valor);

            JOptionPane.showMessageDialog(null, "Sucesso");
        }

    }

    public Double obterSaldo() {

        return saldo;

    }
    
    @Override
    public void mostrarDados()
    {
        super.mostrarDados();
        JOptionPane.showMessageDialog(null,"Tipo de conta: Poupança");
    }

}
