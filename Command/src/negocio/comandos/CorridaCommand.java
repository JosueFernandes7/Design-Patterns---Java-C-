package negocio.comandos;

import negocio.Command;
import negocio.games.CorridaGame;

public class CorridaCommand implements Command{

  private CorridaGame game;
  

  public CorridaCommand(CorridaGame game) {
    this.game = game;
  }
  @Override
  public void undo() {
    this.game.reduzir();
  }
  @Override
  public void execute() {
    this.game.correr();
  }

  
}
