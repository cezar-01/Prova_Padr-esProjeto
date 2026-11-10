
public abstract class Complemento implements Bebida {

    private final Bebida bebida;

    protected Complemento(Bebida bebida) {
        if(bebida == null) {
             throw new IllegalArgumentException("O complemento precisa de uma bebida.");
        }

         this.bebida = bebida;
    }

    protected abstract String getNome();

    protected abstract double getValor();

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + "+" + getNome();
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + getValor();
    }
}
