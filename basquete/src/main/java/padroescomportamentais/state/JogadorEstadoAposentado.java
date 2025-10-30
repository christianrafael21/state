package padroescomportamentais.state;

public class JogadorEstadoAposentado extends JogadorEstado {

    private JogadorEstadoAposentado() {};
    private static JogadorEstadoAposentado instance = new JogadorEstadoAposentado();
    public static JogadorEstadoAposentado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Aposentado";
    }

}