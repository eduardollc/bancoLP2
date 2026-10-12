
import javax.swing.JOptionPane;

public class ContaCorrente extends Conta {

    public ContaCorrente(String numeroConta, String agencia, Double saldo) {
        super(numeroConta, agencia, saldo);
    }

    public void depositar(Double valor) {

        if (valor <= 0) {
            JOptionPane.showMessageDialog(null, "Erro, não é possivel depositar um valor abaixo ou igual a 0 !!!");
        } else {
            setSaldo(getSaldo() + valor);
            JOptionPane.showMessageDialog(null, "Sucesso");
        }

    }

    public void sacar(Double valor) {

        if (valor > getSaldo()) {
            JOptionPane.showMessageDialog(null, "Erro, não é possível sacar um valor maior que o saldo.");
        } else if (valor <= 0) {
            JOptionPane.showMessageDialog(null, "Erro, não é possível sacar um valor menor ou igual a 0.");

        } else {
            setSaldo(getSaldo() - valor);
            JOptionPane.showMessageDialog(null, "Sucesso");
        }

    }

    public void transferir(ContaPoupanca conta, Double valor) {

        if (valor <= 0) {
            JOptionPane.showMessageDialog(null, "Digite um valor maior que zero.");
            return;
        } else if (valor > getSaldo()) {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
            return;
        } else {
            setSaldo(getSaldo() - valor);
            conta.setSaldo(conta.getSaldo() + valor);
            
            JOptionPane.showMessageDialog(null, "Sucesso");
        }

    }

    public Double obterSaldo() {

        return getSaldo();

    }
}
