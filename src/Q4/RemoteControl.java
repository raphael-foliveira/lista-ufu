package Q4;

public class RemoteControl {

    Television television;

    public RemoteControl(Television television) {
        this.television = television;
    }

    public void increaseChannel() {
        int currentChannel = this.television.getChannel();
        this.television.setChannel(currentChannel + 1);
    }

    public void decreaseChannel() {
        int currentChannel = this.television.getChannel();
        this.television.setChannel(currentChannel - 1);
    }

    public void increaseVolume() {
        int currentVolume = this.television.getVolume();
        this.television.setVolume(currentVolume + 1);
    }

    public void decreaseVolume() {
        int currentVolume = this.television.getVolume();
        this.television.setVolume(currentVolume - 1);
    }

    public void switchToChannel(int channel) {
        this.television.setChannel(channel);
    }

    private void displayCurrentChannel() {
        int channel = this.television.getChannel();
        System.out.printf("Canal: %d.\n", channel);
    }

    private void displayCurrentVolume() {
        int volume = this.television.getVolume();
        System.out.printf("Volume: %d.\n", volume);
    }

    public void displayCurrentInfo() {
        displayCurrentChannel();
        displayCurrentVolume();
        System.out.println();
    }
}
