
public class Calda extends Complemento {

    private static final double VALOR = 1.00;

    public Calda(Bebida bebida) {
        super(bebida);
    }

    @Override
    protected String getNome() {
        return "Calda";
    }

    @Override
    protected double getValor() {
        return VALOR;
    }
}
