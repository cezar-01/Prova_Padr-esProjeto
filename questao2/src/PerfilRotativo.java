
public class PerfilRotativo implements PerfilCobranca {

    private static final double VALOR_POR_HORA = 8.00;
    private static final int MINUTOS_POR_HORA = 60;

    @Override
    public String getNome() {
        return "Rotativo";
    }

    @Override
    public double calcularValor(int minutosPermanencia) {
        int horasIniciadas = (int) Math.ceil((double) minutosPermanencia / MINUTOS_POR_HORA);
        return horasIniciadas * VALOR_POR_HORA;
    }
}
