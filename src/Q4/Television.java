package Q4;

public class Television {
    private int volume;
    private int channel;

    public Television() {
        this.volume = 0;
        this.channel = 0;
    }

    int getVolume() {
        return this.volume;
    }

    int getChannel() {
        return this.channel;
    }

    void setChannel(int channel) {
        this.channel = channel;
    }

    void setVolume(int volume) {
        this.volume = volume;
    }
}
