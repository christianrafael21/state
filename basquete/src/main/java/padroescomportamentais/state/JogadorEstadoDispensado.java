package padroescomportamentais.state;

public class JogadorEstadoDispensado extends JogadorEstado {

    private JogadorEstadoDispensado() {};
    private static JogadorEstadoDispensado instance = new JogadorEstadoDispensado();
    public static JogadorEstadoDispensado getInstance() {
        return instance;
    }
    
    public String getEstado() {
        return "Dispensado";
    }
     
   public boolean lesionar(Jogador jogador) {
         jogador.setEstado(JogadorEstadoLesionado.getInstance());
         return true;
   }
}