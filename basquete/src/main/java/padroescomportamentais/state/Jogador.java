package padroescomportamentais.state;

public class Jogador {
    
    private String nome;
    private JogadorEstado estado;    

    public Jogador() {
        this.estado = JogadorEstadoAtivo.getInstance();
    }
    
    public void setEstado(JogadorEstado estado) {
        this.estado = estado;
    }
    
    public boolean ativar() {
        return estado.ativar(this);
    }
    
    public boolean aposentar() {
        return estado.aposentar(this);
    }
    
    public boolean suspender() {
        return estado.suspender(this);
    }
    
    public boolean lesionar() {
        return estado.lesionar(this);
    }
    
    public boolean dispensar() {
        return estado.dispensar(this);
    }

    public boolean transferir() {
        return estado.transferir(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public JogadorEstado getEstado() {
        return estado;
    }    
}