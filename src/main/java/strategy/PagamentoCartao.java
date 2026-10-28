package strategy;

public class PagamentoCartao implements Pagamento {

    public float calcularParcela(float premio, int numeroParcelas) {
        if (numeroParcelas == 0) {
            throw new IllegalArgumentException("Número de parcelas inválido");
        }
        else {
            return premio * 1.1f / numeroParcelas;
        }
    }
}
