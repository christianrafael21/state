package padroescomportamentais.state;

public class JogadorEstadoSuspenso extends JogadorEstado {

    private JogadorEstadoSuspenso() {};
    private static JogadorEstadoSuspenso instance = new JogadorEstadoSuspenso();
    public static JogadorEstadoSuspenso getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Suspenso";
    }

    public boolean ativar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoAtivo.getInstance());
        return true;
    }

    public boolean lesionar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoLesionado.getInstance());
        return true;
    }

    public boolean dispensar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoDispensado.getInstance());
        return true;
    }

}