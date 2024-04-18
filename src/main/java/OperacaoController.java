public class OperacaoController {
    public int operacaoValor(int numero) throws ParametroNegativo {
        if (numero < 0) {
            throw new ParametroNegativo("O parâmetro não pode ser negativo.");
        }

        if (numero % 2 == 0) {
            return numero * numero;
        } else {
            return numero * numero * numero;
        }
    }
}
