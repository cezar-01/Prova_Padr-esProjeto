
public class Main {

    public static void main(String[] args) {
        Bebida pedido1 = new Chantilly(new Leite(new Espresso()));

        Bebida pedido2 = new Calda(new Calda(new Cha()));

        Bebida pedido3 = new Espresso();
        pedido3 = new Leite(pedido3);
        pedido3 = new Leite(pedido3);
        pedido3 = new Chantilly(pedido3);
        pedido3 = new Calda(pedido3);

        Bebida pedido4 = new Cha();

        imprimirPedido(1, pedido1);
        imprimirPedido(2, pedido2);
        imprimirPedido(3, pedido3);
        imprimirPedido(4, pedido4);
    }

    private static void imprimirPedido(int numero, Bebida pedido) {
        System.out.printf("Pedido %d: %s | Total: R$ %.2f%n", numero, pedido.getDescricao(), pedido.getPreco());
    }
}
