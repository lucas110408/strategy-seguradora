package strategy;

public class PagamentoBoleto implements Pagamento {

    public float calcularParcela(float premio, int numeroParcelas) {
        if (numeroParcelas == 0) {
            throw new IllegalArgumentException("Número de parcelas inválido");
        }
        else {
            return premio / numeroParcelas;
        }
    }
}
