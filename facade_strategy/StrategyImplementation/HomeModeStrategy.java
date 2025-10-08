package facade_strategy.StrategyImplementation;


import facade_strategy.FacadeImplementation.HeatingSystem;
import facade_strategy.FacadeImplementation.LightningSystem;
import facade_strategy.FacadeImplementation.SecuritySystem;

public interface HomeModeStrategy {
    void activate(LightningSystem light, HeatingSystem heating, SecuritySystem security);
}
