package negocio.comandos;

import negocio.Command;
import negocio.games.LutaGame;

public class LutaCommand implements Command{
  private LutaGame game;

  public LutaCommand(LutaGame game){
    this.game = game;
  }
  
  @Override
  public void undo() {
    this.game.defender();
  }
  @Override
  public void execute() {
    this.game.atacar();
  }
}
