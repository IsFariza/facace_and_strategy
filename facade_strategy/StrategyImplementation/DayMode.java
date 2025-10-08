package facade_strategy.StrategyImplementation;


import facade_strategy.FacadeImplementation.HeatingSystem;
import facade_strategy.FacadeImplementation.LightningSystem;
import facade_strategy.FacadeImplementation.SecuritySystem;

public class DayMode implements HomeModeStrategy{
    @Override
    public void activate(LightningSystem light, HeatingSystem heating, SecuritySystem security){
        light.turnOn();
        heating.turnOn();
        heating.setTemperature(22);
        security.deactivateAlarm();
        security.unLockDoors();

    }

}
