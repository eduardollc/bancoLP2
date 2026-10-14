import java.time.LocalDate;

public class Conta {
    
    private String numeroConta;
    private String agencia;
    private LocalDate dataConta; 

    public Conta(String numeroConta, String agencia, LocalDate dataConta) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.dataConta = dataConta;
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
    
    
 
    @Override
    public String toString() {
        return String.format("%s \n%s: %s \n%s: %s",
                "Sucesso ao acessar conta",
                "Número da conta", numeroConta,
                "Agência", agencia);
    }
    
}
