
public class Main {

    public static void main(String[] args) {
        Produto teclado = new Produto("Teclado Mecânico", 10);

        AreaCompras compras = new AreaCompras();
        AreaVendas vendas = new AreaVendas();
        AreaAuditoria auditoria = new AreaAuditoria();

        teclado.adicionarObservador(compras);
        teclado.adicionarObservador(vendas);
        teclado.adicionarObservador(auditoria);

        alterarEstoque(teclado, 8);
        alterarEstoque(teclado, 8);
        alterarEstoque(teclado, 3);
        alterarEstoque(teclado, 0);
        alterarEstoque(teclado, 20);

        System.out.println();
        System.out.println(">> Removendo a área de Compras do produto " + teclado.getNome());
        teclado.removerObservador(compras);

        alterarEstoque(teclado, 2);

        System.out.println();
        System.out.println("Total de alterações registradas pela Auditoria: " + auditoria.getRegistros().size());
    }

    private static void alterarEstoque(Produto produto, int novaQuantidade) {
        System.out.println();
        System.out.println(">> Alterando estoque de " + produto.getNome()
                + ": " + produto.getQuantidade() + " -> " + novaQuantidade);
        produto.setQuantidade(novaQuantidade);
    }
}
