package padroescomportamentais.state;

public class JogadorEstadoTransferido extends JogadorEstado {

    private JogadorEstadoTransferido() {};
    private static JogadorEstadoTransferido instance = new JogadorEstadoTransferido();
    public static JogadorEstadoTransferido getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Transferido";
    }

}