package service;

import model.Pedido;
import model.TipoDesconto;

public class DescontoVipService implements AplicarDesconto {
    @Override
    public boolean aceita(TipoDesconto tipo) {
        return tipo == TipoDesconto.VIP;
    }

    @Override
    public double aplicarDesconto(Pedido pedido) {
        return pedido.getValorBruto() * 0.85;
    }
}
