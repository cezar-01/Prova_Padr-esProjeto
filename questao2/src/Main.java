
public class Main {

    private static final int MINUTOS_PERMANENCIA = 150;

    public static void main(String[] args) {
        System.out.println("== Mesmo tempo de permanencia (" + MINUTOS_PERMANENCIA + " min) nos tres perfis ==");
        new Tiquete("ABC1D23", MINUTOS_PERMANENCIA, new PerfilRotativo()).imprimirResumo();
        new Tiquete("EFG4H56", MINUTOS_PERMANENCIA, new PerfilMensalista()).imprimirResumo();
        new Tiquete("IJK7L89", MINUTOS_PERMANENCIA, new PerfilConveniado()).imprimirResumo();

        System.out.println();
        System.out.println("== Troca de perfil no mesmo tiquete, em tempo de execucao ==");
        Tiquete tiquete = new Tiquete("XYZ9W87", MINUTOS_PERMANENCIA, new PerfilRotativo());
        tiquete.imprimirResumo();

        tiquete.setPerfil(new PerfilConveniado());
        tiquete.imprimirResumo();

        tiquete.setPerfil(new PerfilMensalista());
        tiquete.imprimirResumo();
    }
}
