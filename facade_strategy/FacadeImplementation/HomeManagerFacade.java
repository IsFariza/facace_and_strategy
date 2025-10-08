package facade_strategy.FacadeImplementation;

import facade_strategy.StrategyImplementation.HomeModeStrategy;

public class HomeManagerFacade {
    private LightningSystem lights;
    private HeatingSystem heating;
    private SecuritySystem security;

    public HomeManagerFacade(){
        this.lights = new LightningSystem();
        this.heating = new HeatingSystem();
        this.security = new SecuritySystem();
    }

    public void activateMode(HomeModeStrategy mode){
        mode.activate(lights, heating, security);
    }

    public void showStatus(){
        System.out.println(lights.getStatus());
        System.out.println(heating.getStatus());
        System.out.println(security.getStatus());
    }
}
