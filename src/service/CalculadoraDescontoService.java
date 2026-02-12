package service;

import model.Pedido;

import java.util.List;

public class CalculadoraDescontoService {
    private static List<AplicarDesconto> descontos = List.of(
            new DescontoAniversarioService(),
            new DescontoCupomService(),
            new DescontoSazonalService(),
            new DescontoVipService());
    public static double aplicarDesconto(Pedido pedido){
        return descontos.stream()
                .filter(d -> d.aceita(pedido.getTipoDesconto()))
                .findFirst()
                .orElseThrow()
                .aplicarDesconto(pedido);
    }
}
