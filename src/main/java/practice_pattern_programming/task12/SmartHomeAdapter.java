package practice_pattern_programming.task12;

public class SmartHomeAdapter {
    private ClimateControlSystem climateControlSystem;
    private LightingSystem lightingSystem;
    private SecuritySystem securitySystem;

    public SmartHomeAdapter(ClimateControlSystem climateControlSystem, LightingSystem lightingSystem, SecuritySystem securitySystem) {
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
