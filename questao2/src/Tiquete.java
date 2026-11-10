
public class Tiquete {

    private final String placa;
    private final int minutosPermanencia;
    private PerfilCobranca perfil;

    public Tiquete(String placa, int minutosPermanencia, PerfilCobranca perfil) {
        if (minutosPermanencia < 0) {
            throw new IllegalArgumentException("O tempo de permanencia nao pode ser negativo.");
        }
        this.placa = placa;
        this.minutosPermanencia = minutosPermanencia;
        setPerfil(perfil);
    }

    public void setPerfil(PerfilCobranca perfil) {
        if (perfil == null) {
            throw new IllegalArgumentException("O perfil de cobrança é obrigatorio.");
        }
        this.perfil = perfil;
    }

    public double calcularValor() {
        return perfil.calcularValor(minutosPermanencia);
    }

    public void imprimirResumo() {
        System.out.printf("Placa %s | %d min | Perfil %-10s | Valor a pagar: R$ %.2f%n",
                placa, minutosPermanencia, perfil.getNome(), calcularValor());
    }

    public String getPlaca() {
        return placa;
    }

    public int getMinutosPermanencia() {
        return minutosPermanencia;
    }

    public PerfilCobranca getPerfil() {
        return perfil;
    }
}
