
public class Chantilly extends Complemento {

    private static final double VALOR = 2.00;

    public Chantilly(Bebida bebida) {
        super(bebida);
    }

    @Override
    protected String getNome() {
        return "Chantilly";
    }

    @Override
    protected double getValor() {
        return VALOR;
    }
}
