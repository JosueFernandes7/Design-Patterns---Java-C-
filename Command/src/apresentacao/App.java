package apresentacao;

import negocio.Joystick;
import negocio.comandos.CorridaCommand;
import negocio.comandos.FutebolCommand;
import negocio.comandos.LutaCommand;
import negocio.games.CorridaGame;
import negocio.games.FutebolGame;
import negocio.games.LutaGame;

public class App {
    public static void main(String[] args) throws Exception {
        Joystick joystick = new Joystick();

        CorridaGame corridaGame = new CorridaGame();
        FutebolGame futebolGame = new FutebolGame();
        LutaGame lutaGame = new LutaGame();
        
        CorridaCommand corridaCommand = new CorridaCommand(corridaGame);
        FutebolCommand futebolCommand = new FutebolCommand(futebolGame);
        LutaCommand lutaCommand = new LutaCommand(lutaGame);

        joystick.setSlot(corridaCommand, 0);
        joystick.setSlot(futebolCommand, 1);
        joystick.setSlot(lutaCommand, 2);

        joystick.pressionarBotaoA(0);
        joystick.pressionarBotaoB(0);

        joystick.pressionarBotaoB(1);
        joystick.pressionarBotaoA(1);

        joystick.pressionarBotaoA(2);
        joystick.pressionarBotaoB(2);

    }
}
