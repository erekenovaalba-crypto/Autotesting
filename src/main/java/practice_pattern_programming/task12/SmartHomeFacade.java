package practice_pattern_programming.task12;

public class SmartHomeFacade {
    private final ClimateControlSystem climateControlSystem;
    private final LightingSystem lightingSystem;
    private final SecuritySystem securitySystem;

    public SmartHomeFacade(ClimateControlSystem climateControlSystem, LightingSystem lightingSystem, SecuritySystem securitySystem) {
        this.climateControlSystem = climateControlSystem;
        this.lightingSystem = lightingSystem;
        this.securitySystem = securitySystem;
    }
    public void smartHomeTurnOn(){
        climateControlSystem.turnOn();
        lightingSystem.turnOn();
        securitySystem.turnOn();
    }
    public void smartHomeTurnOf(){
        climateControlSystem.turnOff();
        lightingSystem.turnOff();
        securitySystem.turnOff();
    }
}
