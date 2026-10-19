package practice_pattern_programming.task12;

public class Main {
    static void main() {
        LightingSystem lightingSystem = new LightingSystem();
        ClimateControlSystem climateControlSystem = new ClimateControlSystem();
        SecuritySystem securitySystem = new SecuritySystem();
        SmartHomeAdapter smartHomeAdapter = new SmartHomeAdapter(climateControlSystem,lightingSystem,securitySystem);
        smartHomeAdapter.smartHomeTurnOn();
        smartHomeAdapter.smartHomeTurnOf();
    }
}
