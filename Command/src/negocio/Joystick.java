
package negocio;

public class Joystick {    
    private Command[] slots;  

    public Joystick(){
        this.slots = new Command[3];
        for (int i = 0; i < this.slots.length; i++) {
            this.slots[i] = new NoCommand();            
        }
    }

    public Command[] getSlot() {
        return slots;
    }

    public void setSlot(Command[] slots) {
        this.slots = slots;
    }  
    
    public void setSlot(Command command, int slotNumber) {
        this.slots[slotNumber] = command;
    }  
        
    public void pressionarBotaoA(int slotNumber){
        this.slots[slotNumber].execute();
    }
    public void pressionarBotaoB(int slotNumber){
      this.slots[slotNumber].undo();
    }
}