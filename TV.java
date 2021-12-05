public class TV {
    boolean power = true; // create a method for tv powerOnOff
    int channel = 0;
    int volume = 0;

    public void turnOnOff() {
        if (power = true) {
            power = false;

        } else {
            power = true;

        }

    }

    public void setChannel(int newValue) {
        channel = newValue;
    }

    public void incVolume() {
        volume = volume + 1;
    }

    public int getChanel() {
        return channel;

    }

    public int getVolume() {
        return volume;

    }

    public boolean getFlag() {
        return power;

    }
}
