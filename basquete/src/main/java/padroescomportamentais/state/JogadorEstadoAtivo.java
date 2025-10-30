package padroescomportamentais.state;

public class JogadorEstadoAtivo extends JogadorEstado {

    private JogadorEstadoAtivo() {};
    private static JogadorEstadoAtivo instance = new JogadorEstadoAtivo();
    public static JogadorEstadoAtivo getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Ativo";
    }
    
    public boolean aposentar(Jogador jogador) {
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        return true;
    }
    
    public boolean suspender(Jogador jogador) {
        jogador.setEstado(JogadorEstadoSuspenso.getInstance());
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

    public boolean transferir(Jogador jogador) {
        jogador.setEstado(JogadorEstadoTransferido.getInstance());
        return true;
    }

}