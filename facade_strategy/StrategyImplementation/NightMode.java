package facade_strategy.StrategyImplementation;

import facade_strategy.FacadeImplementation.HeatingSystem;
import facade_strategy.FacadeImplementation.LightningSystem;
import facade_strategy.FacadeImplementation.SecuritySystem;

public class NightMode implements HomeModeStrategy{
    @Override
    public void activate(LightningSystem light, HeatingSystem heating, SecuritySystem security){
        light.turnOff();
        heating.turnOn();
        heating.setTemperature(25);
        security.activateAlarm();
        security.lockDoors();

    }


}
