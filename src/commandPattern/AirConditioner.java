package commandPattern;

public class AirConditioner {
    boolean isOn;
    int temperature;

    public AirConditioner() {
    }

    public void turnOnAc() {
        this.isOn = true;
        System.out.println("A.c got turned ON");
    }

    public void turnOfAc() {
        this.isOn = false;
        System.out.println("A.c got turned OFF");

    }

}
