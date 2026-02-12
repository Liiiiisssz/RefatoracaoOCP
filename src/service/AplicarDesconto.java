package service;

import model.Pedido;
import model.TipoDesconto;

public interface AplicarDesconto {
    boolean aceita(TipoDesconto tipo);
    double aplicarDesconto(Pedido pedido);
}
