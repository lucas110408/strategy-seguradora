package strategy;

public class PagamentoAVista implements Pagamento {

    public float calcularParcela(float premio, int numeroParcelas) {
        return premio * 0.9f;
    }
}
