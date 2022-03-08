package DependancyInversion;

public class ElectricPowerSwitchWhichVioletsDependencyInversionPrinciple {
    public LightBulb lightBulb;
    public boolean on;

    public ElectricPowerSwitchWhichVioletsDependencyInversionPrinciple(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }

    public void press() {
        boolean checkOn = isOn();
        if (checkOn) {
            lightBulb.turnOff();
            this.on = false;
        } else {
            lightBulb.turnOn();
            this.on = true;
        }

    }
}
