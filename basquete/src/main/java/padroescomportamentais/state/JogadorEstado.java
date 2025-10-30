package padroescomportamentais.state;

public abstract class JogadorEstado {
    
    public abstract String getEstado();

    public boolean ativar(Jogador jogador) {
        return false;
    }

    public boolean aposentar(Jogador jogador) {
        return false;
    }

    public boolean suspender(Jogador jogador) {
        return false;
    }

    public boolean lesionar(Jogador jogador) {
        return false;
    }

    public boolean dispensar(Jogador jogador) {
        return false;
    }

    public boolean transferir(Jogador jogador) {
        return false;
    }
    
}