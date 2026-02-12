package service;

import model.Pedido;
import model.TipoDesconto;

public class DescontoCupomService implements AplicarDesconto {
    @Override
    public boolean aceita(TipoDesconto tipo) {
        return tipo == TipoDesconto.CUPOM;
    }
    @Override
    public double aplicarDesconto(Pedido pedido) {
        return pedido.getValorBruto() * 0.90;
    }
}
