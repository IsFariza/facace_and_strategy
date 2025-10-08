package facade_strategy.FacadeImplementation;

public class SecuritySystem {
    private boolean lockDoors;
    private boolean alarm;

    public void lockDoors(){
        this.lockDoors=true;
    }
    public void unLockDoors(){
        this.lockDoors=false;
    }

    public void activateAlarm(){
        this.alarm = true;
    }
    public void deactivateAlarm(){
        this.alarm = false;
    }
    public String getStatus(){
        return "Guard system is " + (alarm ? "on" : "off") + ", Doors are " + (lockDoors ? "locked" : "unlocked");
    }
}
