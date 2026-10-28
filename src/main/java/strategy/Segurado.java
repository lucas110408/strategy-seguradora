package strategy;

public class Segurado {

    private float valorParcela;

    public float getValorParcela() {
        return valorParcela;
    }

    public void pagarAVista(float premio) {
        CalculadoraPagamento calculadora = new CalculadoraPagamento(premio, 1);
        this.valorParcela = calculadora.calcular(new PagamentoAVista());
    }

    public void pagarNoBoleto(float premio, int numeroParcelas) {
        CalculadoraPagamento calculadora = new CalculadoraPagamento(premio, numeroParcelas);
        this.valorParcela = calculadora.calcular(new PagamentoBoleto());
    }

    public void pagarNoCartao(float premio, int numeroParcelas) {
        CalculadoraPagamento calculadora = new CalculadoraPagamento(premio, numeroParcelas);
        this.valorParcela = calculadora.calcular(new PagamentoCartao());
    }

}
