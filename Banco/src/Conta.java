import java.time.LocalDate;

public class Conta {
    
    private String numeroConta;
    private String agencia;
    private LocalDate dataConta; 
    private String senha;

    public Conta(String numeroConta, String agencia, LocalDate dataConta, String senha) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.dataConta = dataConta;
        this.senha = senha;
    }

    public LocalDate getDataConta() {
        return dataConta;
    }

    public void setDataConta(LocalDate dataConta) {
        this.dataConta = dataConta;
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
    
    
 
    @Override
    public String toString() {
        return String.format("%s \n%s: %s \n%s: %s",
                "Sucesso ao acessar conta",
                "Número da conta", numeroConta,
                "Agência", agencia);
    }
    
}
