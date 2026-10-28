package strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeguradoTest {

    @Test
    void devePagarAVistaComDesconto() {
        Segurado segurado = new Segurado();
        segurado.pagarAVista(1000.0f);
        assertEquals(900.0f, segurado.getValorParcela());
    }

    @Test
    void devePagarNoBoletoSemJuros() {
        Segurado segurado = new Segurado();
        segurado.pagarNoBoleto(1200.0f, 4);
        assertEquals(300.0f, segurado.getValorParcela());
    }

    @Test
    void devePagarNoCartaoComJuros() {
        Segurado segurado = new Segurado();
        segurado.pagarNoCartao(1000.0f, 10);
        assertEquals(110.0f, segurado.getValorParcela());
    }

    @Test
    void naoDevePagarNoBoletoComZeroParcelas() {
        try {
            Segurado segurado = new Segurado();
            segurado.pagarNoBoleto(1200.0f, 0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de parcelas inválido", e.getMessage());
        }
    }

    @Test
    void naoDevePagarNoCartaoComZeroParcelas() {
        try {
            Segurado segurado = new Segurado();
            segurado.pagarNoCartao(1000.0f, 0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número de parcelas inválido", e.getMessage());
        }
    }

}
