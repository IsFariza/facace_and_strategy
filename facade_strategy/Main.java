package facade_strategy;

import facade_strategy.FacadeImplementation.HomeManagerFacade;
import facade_strategy.StrategyImplementation.DayMode;
import facade_strategy.StrategyImplementation.HomeModeStrategy;
import facade_strategy.StrategyImplementation.LeavingHome;
import facade_strategy.StrategyImplementation.NightMode;

public class Main {
    public static void main(String[] args){
        HomeManagerFacade home = new HomeManagerFacade();

        HomeModeStrategy mode = new DayMode();
        home.activateMode(mode);
        home.showStatus();

    }
}
