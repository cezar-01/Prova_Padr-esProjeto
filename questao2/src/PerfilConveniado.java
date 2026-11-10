
public class PerfilConveniado implements PerfilCobranca {

    private static final double VALOR_POR_HORA = 8.00;
    private static final int MINUTOS_POR_HORA = 60;
    private static final int MINUTOS_GRATUITOS = 30;
    private static final double PERCENTUAL_DESCONTO = 0.20;

    @Override
    public String getNome() {
        return "Conveniado";
    }

    @Override
    public double calcularValor(int minutosPermanencia) {
        int minutosCobrados = Math.max(0, minutosPermanencia - MINUTOS_GRATUITOS);
        int horasIniciadas = (int) Math.ceil((double) minutosCobrados / MINUTOS_POR_HORA);
        return horasIniciadas * VALOR_POR_HORA * (1 - PERCENTUAL_DESCONTO);
    }
}
