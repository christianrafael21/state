# State Pattern - Basquete

Implementação do padrão State aplicado ao contexto de estados de jogadores de basquete.

## Como executar

```bash
cd basquete
mvn clean test
```

## Classes

### Estado Base
- **JogadorEstado**: Classe abstrata base para todos os estados

### Estados Concretos
- **JogadorEstadoAtivo**: Estado inicial, permite todas as transições
- **JogadorEstadoSuspenso**: Permite ativar, lesionar e dispensar
- **JogadorEstadoLesionado**: Permite ativar, aposentar e dispensar
- **JogadorEstadoAposentado**: Estado final, não permite transições
- **JogadorEstadoDispensado**: Permite apenas lesionar
- **JogadorEstadoTransferido**: Estado final, não permite transições

### Contexto
- **Jogador**: Mantém o estado atual e delega ações
- **JogadorTest**: Testes para todas as transições de estado

## Exemplo

```java
Jogador jogador = new Jogador(); // Inicia como Ativo

jogador.suspender(); // Ativo -> Suspenso
jogador.ativar();    // Suspenso -> Ativo
jogador.aposentar(); // Ativo -> Aposentado (final)
```