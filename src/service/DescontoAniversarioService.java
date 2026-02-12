package service;

import model.Pedido;
import model.TipoDesconto;

public class DescontoAniversarioService implements AplicarDesconto {
    @Override
    public boolean aceita(TipoDesconto tipo) {
        return tipo == TipoDesconto.ANIVERSARIO;
    }

    @Override
    public double aplicarDesconto(Pedido pedido) {
        return pedido.getValorBruto() * 0.80;
    }
}
