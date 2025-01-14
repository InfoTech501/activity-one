public class television {

    private boolean tvOn;
    private int Channel;
    private int volume;


    public television() {
        this.tvOn = false;
        this.Channel = 1;
        this.volume = 10;
    }


    public void power() {
        tvOn = !tvOn;
        System.out.println(tvOn ? "The TV is now ON." : "The TV is now OFF.");
    }


    public boolean isOn() {
        return tvOn;
    }

    public void changeChannel(int newChannel) {
        if (newChannel > 0) {
            Channel = newChannel;
            System.out.println("Channel changed to: " + Channel);
        } else {
            System.out.println("Invalid channel. Please enter a number.");
        }
    }


    public void increaseVolume() {
        if (volume < 100) {
            volume++;
            System.out.println("Volume increased to: " + volume);
        } else {
            System.out.println("Volume is already at maximum.");
        }
    }


    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume decreased to: " + volume);
        } else {
            System.out.println("Volume is already at minimum.");
        }
    }

    public void displayStatus() {
        System.out.println("TV Status:");
        System.out.println("Power: " + (tvOn ? "ON" : "OFF"));
        System.out.println("Channel: " + Channel);
        System.out.println("Volume: " + volume);
    }
}
