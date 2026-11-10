import java.util.HashSet;
import java.util.Set;

public class AreaVendas implements ObservadorEstoque {

    private final Set<String> produtosZerados = new HashSet<>();

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        if (novaQuantidade == 0) {
            produtosZerados.add(nomeProduto);
            return;
        }
        if (produtosZerados.remove(nomeProduto)) {
            System.out.println("[Vendas] ALERTA: " + nomeProduto
                    + " voltou a ter estoque (" + novaQuantidade + " un.). Liberar para venda.");
        }
    }
}
