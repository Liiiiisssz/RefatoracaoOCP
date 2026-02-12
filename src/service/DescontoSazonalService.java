package service;

import model.Pedido;
import model.TipoDesconto;

public class DescontoSazonalService implements AplicarDesconto {
    @Override
    public boolean aceita(TipoDesconto tipo) {
        return tipo == TipoDesconto.SAZONAL;
    }

    @Override
    public double aplicarDesconto(Pedido pedido) {
        return pedido.getValorBruto() * 0.95;
    }
}
