public class TesteOperacaoController {
    public static void main(String[] args) {
        OperacaoController operacaoController = new OperacaoController();

        try {
            int numero1 = 4;
            int resultado1 = operacaoController.operacaoValor(numero1);
            System.out.println("Resultado para " + numero1 + ": " + resultado1);

            int numero2 = 5;
            int resultado2 = operacaoController.operacaoValor(numero2);
            System.out.println("Resultado para " + numero2 + ": " + resultado2);

            int numero3 = -2;
            int resultado3 = operacaoController.operacaoValor(numero3);
            System.out.println("Resultado para " + numero3 + ": " + resultado3);
        } catch (ParametroNegativo e) {
            System.err.println(e.getMessage());
        }
    }
}
