
public class Leite extends Complemento {

    private static final double VALOR = 1.50;

    public Leite (){

        super(bebida);

    }

    @Override
    protected String getNome() {
        return "Leite";
    }

    @Override
    protected double getValor() {
        return VALOR;
    }
}
