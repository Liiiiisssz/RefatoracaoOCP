import model.Pedido;
import model.TipoDesconto;
import service.CalculadoraDescontoService;

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido(
                "123",
                349.99,
                1,
                "lucas@gmail.com",
                TipoDesconto.ANIVERSARIO
        );

        double valorFinal = CalculadoraDescontoService.aplicarDesconto(pedido);
        System.out.println("Valor inicial: " + pedido.getValorBruto());
        System.out.println("Valor final: " + valorFinal);
    }
}