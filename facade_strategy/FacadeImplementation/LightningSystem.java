package facade_strategy.FacadeImplementation;

public class LightningSystem {
    private boolean status;

    public void turnOn(){
        this.status=true;
    }
    public void turnOff(){
        this.status=false;
    }

    public String getStatus(){
        return "Lights are " + (status ? "on" : "off");
    }
}
