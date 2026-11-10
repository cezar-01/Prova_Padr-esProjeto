
public class AreaCompras implements ObservadorEstoque {

    private static final int ESTOQUE_MINIMO = 5;

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        if (novaQuantidade < ESTOQUE_MINIMO) {
            System.out.println("[Compras] ALERTA: estoque baixo de " + nomeProduto
                    + " (" + novaQuantidade + " un.). Providenciar reposição.");
        }
    }
}
