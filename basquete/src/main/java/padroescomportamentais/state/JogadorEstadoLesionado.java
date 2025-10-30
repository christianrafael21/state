package padroescomportamentais.state;

public class JogadorEstadoLesionado extends JogadorEstado {

    private JogadorEstadoLesionado() {};
    private static JogadorEstadoLesionado instance = new JogadorEstadoLesionado();
    public static JogadorEstadoLesionado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Lesionado";
    }

    public boolean ativar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoAtivo.getInstance());
        return true;
    }

    public boolean aposentar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        return true;
    }

    public boolean dispensar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoDispensado.getInstance());
        return true;
    }

}