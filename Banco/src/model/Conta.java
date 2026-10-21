package model;

import java.time.LocalDate;
import javax.swing.JOptionPane;

public class Conta {
    
    private String numeroConta;
    private String agencia;
    private LocalDate dataAberturaConta; 
    private String senha;

    public Conta(String numeroConta, String agencia, String senha) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        //Data atual quando cria conta
        this.dataAberturaConta = LocalDate.now();
        this.senha = senha;
    }

    public LocalDate getDataAberturaConta() {
        return dataAberturaConta;
    }

    public void setDataAberturaConta(LocalDate dataAberturaConta) {
        this.dataAberturaConta = dataAberturaConta;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void mostrarDados() {
        JOptionPane.showMessageDialog(null,
                "Agencia " + agencia + 
                "\n" + " Numero da conta " + numeroConta + 
                "\n" + "Abertura " + dataAberturaConta);
    }
    
}
