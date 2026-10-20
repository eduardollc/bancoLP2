
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class ContaCorrente extends Conta {
    
    private Double saldo;

    public ContaCorrente(String numeroConta, String agencia, LocalDate dataConta, Double saldo, String senha) {
        super(numeroConta, agencia, dataConta, senha);
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
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

        if (valor > getSaldo()) {
            JOptionPane.showMessageDialog(null, "Erro, não é possível sacar um valor maior que o saldo.");
        } else if (valor <= 0) {
            JOptionPane.showMessageDialog(null, "Erro, não é possível sacar um valor menor ou igual a 0.");

        } else {
            saldo -= valor;
            JOptionPane.showMessageDialog(null, "Sucesso");
        }

    }

    public void transferir(ContaPoupanca contaPoupanca, Double valor) {

        if (valor <= 0) {
            JOptionPane.showMessageDialog(null, "Digite um valor maior que zero.");
            return;
        } else if (valor > getSaldo()) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
            return;
        } else {
            saldo -= valor;
            contaPoupanca.setSaldo(contaPoupanca.getSaldo() + valor);
            
            JOptionPane.showMessageDialog(null, "Sucesso");
        }

    }

    public Double obterSaldo() {

        return saldo;

    }
}
