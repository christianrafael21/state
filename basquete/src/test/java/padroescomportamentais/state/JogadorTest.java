package padroescomportamentais.state;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JogadorTest {

    Jogador jogador;

    @BeforeEach
    public void setUp() {
        jogador = new Jogador();
    }

    // Jogador ativo

    @Test
    public void naoDeveAtivarJogadorAtivo() {
        jogador.setEstado(JogadorEstadoAtivo.getInstance());
        assertFalse(jogador.ativar());
    }

    @Test
    public void deveAposentarJogadorAtivo() {
        jogador.setEstado(JogadorEstadoAtivo.getInstance());
        assertTrue(jogador.aposentar());
        assertEquals(JogadorEstadoAposentado.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveSuspenderJogadorAtivo() {
        jogador.setEstado(JogadorEstadoAtivo.getInstance());
        assertTrue(jogador.suspender());
        assertEquals(JogadorEstadoSuspenso.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveLesionarJogadorAtivo() {
        jogador.setEstado(JogadorEstadoAtivo.getInstance());
        assertTrue(jogador.lesionar());
        assertEquals(JogadorEstadoLesionado.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveDispensarJogadorAtivo() {
        jogador.setEstado(JogadorEstadoAtivo.getInstance());
        assertTrue(jogador.dispensar());
        assertEquals(JogadorEstadoDispensado.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveTransferirJogadorAtivo() {
        jogador.setEstado(JogadorEstadoAtivo.getInstance());
        assertTrue(jogador.transferir());
        assertEquals(JogadorEstadoTransferido.getInstance(), jogador.getEstado());
    }

    // Jogador suspenso

    @Test
    public void deveAtivarJogadorSuspenso() {
        jogador.setEstado(JogadorEstadoSuspenso.getInstance());
        assertTrue(jogador.ativar());
        assertEquals(JogadorEstadoAtivo.getInstance(), jogador.getEstado());
    }

    @Test
    public void naoDeveAposentarJogadorSuspenso() {
        jogador.setEstado(JogadorEstadoSuspenso.getInstance());
        assertFalse(jogador.aposentar());
    }

    @Test
    public void naoDeveSuspenderJogadorSuspenso() {
        jogador.setEstado(JogadorEstadoSuspenso.getInstance());
        assertFalse(jogador.suspender());
    }

    @Test
    public void deveLesionarJogadorSuspenso() {
        jogador.setEstado(JogadorEstadoSuspenso.getInstance());
        assertTrue(jogador.lesionar());
        assertEquals(JogadorEstadoLesionado.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveDispensarJogadorSuspenso() {
        jogador.setEstado(JogadorEstadoSuspenso.getInstance());
        assertTrue(jogador.dispensar());
        assertEquals(JogadorEstadoDispensado.getInstance(), jogador.getEstado());
    }

    @Test
    public void naoDeveTransferirJogadorSuspenso() {
        jogador.setEstado(JogadorEstadoSuspenso.getInstance());
        assertFalse(jogador.transferir());
    }

    // Jogador lesionado

    @Test
    public void deveAtivarJogadorLesionado() {
        jogador.setEstado(JogadorEstadoLesionado.getInstance());
        assertTrue(jogador.ativar());
        assertEquals(JogadorEstadoAtivo.getInstance(), jogador.getEstado());
    }

    @Test
    public void deveAposentarJogadorLesionado() {
        jogador.setEstado(JogadorEstadoLesionado.getInstance());
        assertTrue(jogador.aposentar());
        assertEquals(JogadorEstadoAposentado.getInstance(), jogador.getEstado());
    }

    @Test
    public void naoDeveSuspenderJogadorLesionado() {
        jogador.setEstado(JogadorEstadoLesionado.getInstance());
        assertFalse(jogador.suspender());
    }

    @Test
    public void naoDeveLesionarJogadorLesionado() {
        jogador.setEstado(JogadorEstadoLesionado.getInstance());
        assertFalse(jogador.lesionar());
    }

    @Test
    public void deveDispensarJogadorLesionado() {
        jogador.setEstado(JogadorEstadoLesionado.getInstance());
        assertTrue(jogador.dispensar());
        assertEquals(JogadorEstadoDispensado.getInstance(), jogador.getEstado());
    }

    @Test
    public void naoDeveTransferirJogadorLesionado() {
        jogador.setEstado(JogadorEstadoLesionado.getInstance());
        assertFalse(jogador.transferir());
    }

    // Jogador aposentado

    @Test
    public void naoDeveAtivarJogadorAposentado() {
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        assertFalse(jogador.ativar());
    }

    @Test
    public void naoDeveAposentarJogadorAposentado() {
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        assertFalse(jogador.aposentar());
    }

    @Test
    public void naoDeveSuspenderJogadorAposentado() {
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        assertFalse(jogador.suspender());
    }

    @Test
    public void naoDeveLesionarJogadorAposentado() {
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        assertFalse(jogador.lesionar());
    }

    @Test
    public void naoDeveDispensarJogadorAposentado() {
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        assertFalse(jogador.dispensar());
    }

    @Test
    public void naoDeveTransferirJogadorAposentado() {
        jogador.setEstado(JogadorEstadoAposentado.getInstance());
        assertFalse(jogador.transferir());
    }

    // Jogador dispensado

    @Test
    public void naoDeveAtivarJogadorDispensado() {
        jogador.setEstado(JogadorEstadoDispensado.getInstance());
        assertFalse(jogador.ativar());
    }

    @Test
    public void naoDeveAposentarJogadorDispensado() {
        jogador.setEstado(JogadorEstadoDispensado.getInstance());
        assertFalse(jogador.aposentar());
    }

    @Test
    public void naoDeveSuspenderJogadorDispensado() {
        jogador.setEstado(JogadorEstadoDispensado.getInstance());
        assertFalse(jogador.suspender());
    }

    @Test
    public void deveLesionarJogadorDispensado() {
        jogador.setEstado(JogadorEstadoDispensado.getInstance());
        assertTrue(jogador.lesionar());
        assertEquals(JogadorEstadoLesionado.getInstance(), jogador.getEstado());
    }

    @Test
    public void naoDeveDispensarJogadorDispensado() {
        jogador.setEstado(JogadorEstadoDispensado.getInstance());
        assertFalse(jogador.dispensar());
    }

    @Test
    public void naoDeveTransferirJogadorDispensado() {
        jogador.setEstado(JogadorEstadoDispensado.getInstance());
        assertFalse(jogador.transferir());
    }

    // Jogador transferido

    @Test
    public void naoDeveAtivarJogadorTransferido() {
        jogador.setEstado(JogadorEstadoTransferido.getInstance());
        assertFalse(jogador.ativar());
    }

    @Test
    public void naoDeveAposentarJogadorTransferido() {
        jogador.setEstado(JogadorEstadoTransferido.getInstance());
        assertFalse(jogador.aposentar());
    }

    @Test
    public void naoDeveSuspenderJogadorTransferido() {
        jogador.setEstado(JogadorEstadoTransferido.getInstance());
        assertFalse(jogador.suspender());
    }

    @Test
    public void naoDeveLesionarJogadorTransferido() {
        jogador.setEstado(JogadorEstadoTransferido.getInstance());
        assertFalse(jogador.lesionar());
    }

    @Test
    public void naoDeveDispensarJogadorTransferido() {
        jogador.setEstado(JogadorEstadoTransferido.getInstance());
        assertFalse(jogador.dispensar());
    }

    @Test
    public void naoDeveTransferirJogadorTransferido() {
        jogador.setEstado(JogadorEstadoTransferido.getInstance());
        assertFalse(jogador.transferir());
    }
}