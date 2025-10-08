package facade_strategy.FacadeImplementation;

public class HeatingSystem {
    private int temperature=20;
    private boolean status;

    public void setTemperature(int temp){
        this.temperature=temp;
    }
    public void turnOn(){
        this.status=true;
    }
    public void turnOff(){
        this.status=false;
    }
    public String getStatus(){
        return "Heating system is " + (status ? "on":"off") + ", Temperature is " + temperature + "C";
    }
}
