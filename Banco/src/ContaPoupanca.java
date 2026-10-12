
import javax.swing.JOptionPane;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String numeroConta, String agencia, Double saldo) {
        super(numeroConta, agencia, saldo);
    }

    public void rendimento() {

        double porcentagem = 0.0105;
        setSaldo(getSaldo() + (getSaldo() * porcentagem));

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

    public void transferir(ContaCorrente conta, Double valor) {

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
