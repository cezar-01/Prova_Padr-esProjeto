import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AreaAuditoria implements ObservadorEstoque {

    private final List<String> registros = new ArrayList<>();

    @Override
    public void atualizar(String nomeProduto, int novaQuantidade) {
        String registro = nomeProduto + " -> " + novaQuantidade + " un.";
        registros.add(registro);
        System.out.println("[Auditoria] Registro #" + registros.size() + ": " + registro);
    }

    public List<String> getRegistros() {
        return Collections.unmodifiableList(registros);
    }
}
