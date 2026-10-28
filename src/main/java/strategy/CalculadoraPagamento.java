package strategy;

public class CalculadoraPagamento {

    private float premio;
    private int numeroParcelas;

    public CalculadoraPagamento(float premio, int numeroParcelas) {
        this.premio = premio;
        this.numeroParcelas = numeroParcelas;
    }

    public float calcular(Pagamento pagamento) {
        return pagamento.calcularParcela(premio, numeroParcelas);
    }
}
