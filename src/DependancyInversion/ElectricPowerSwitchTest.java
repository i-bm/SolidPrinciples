package DependancyInversion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectricPowerSwitchTest {

    @Test
    public void testPress() throws Exception {
        Switchable switchableFan = new Fan();
        Switch fanPowerSwitch = new ElectricPowerSwitch(switchableFan);
        fanPowerSwitch.press();
        fanPowerSwitch.press();
    }
}