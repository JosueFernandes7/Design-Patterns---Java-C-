package negocio.comandos;

import negocio.Command;
import negocio.games.FutebolGame;

public class FutebolCommand implements Command{
  private FutebolGame game;

  public FutebolCommand(FutebolGame game){
    this.game = game;
  }
  
  @Override
  public void undo() {
    this.game.chutar();
  }
  @Override
  public void execute() {
    this.game.carrinho();
  }
}
