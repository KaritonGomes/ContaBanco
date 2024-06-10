public class ContaTerminal {

    public static void main(String[] args) {
        // Primeira simulação com saldo 25 e valor solicitado 18
        int saldo = 25;
        double valorSolicitado = 18.0;

        // Operação de saque
        if (saldo >= valorSolicitado) {
            saldo -= valorSolicitado;
            System.out.println("Saque realizado com sucesso! Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }

        // Imprimir saldo após operação
        System.out.println("Saldo após operação: " + saldo);

        // Segunda simulação com saldo 15 e valor solicitado 22
        saldo = 15;
        valorSolicitado = 22.0;

        // Operação de saque
        if (saldo >= valorSolicitado) {
            saldo -= valorSolicitado;
            System.out.println("Saque realizado com sucesso! Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }

        // Imprimir saldo após operação
        System.out.println("Saldo após operação: " + saldo);
    }
}
