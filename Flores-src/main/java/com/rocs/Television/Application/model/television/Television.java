package com.rocs.Television.Application.model.television;

public class Television {
    private int currentChannel;
    private int currentVolume;

    public Television() {
        this(1, 1);
    }

    public Television(int channel, int volume) {
        if (this.isValidChannel(channel) && this.isValidVolume(volume)) {
            this.currentChannel = channel;
            this.currentVolume = volume;
        } else {
            this.currentChannel = 3;
            this.currentVolume = 5;
        }

    }

    public int getChannel() {
        return this.currentChannel;
    }

    public int getVolume() {
        return this.currentVolume;
    }

    public void increaseChannel() {
        ++this.currentChannel;
        if (this.currentChannel > 100) {
            this.currentChannel = 1;
        }

    }

    public void decreaseChannel() {
        --this.currentChannel;
        if (this.currentChannel < 1) {
            this.currentChannel = 100;
        }

    }

    public void selectChannel(int channel) {
        if (this.isValidChannel(channel)) {
            this.currentChannel = channel;
        }

    }

    public void increaseVolume() {
        if (this.currentVolume < 10) {
            ++this.currentVolume;
        }

    }

    public void decreaseVolume() {
        if (this.currentVolume > 1) {
            --this.currentVolume;
        }

    }

    private boolean isValidChannel(int channel) {
        return channel >= 1 && channel <= 100;
    }

    private boolean isValidVolume(int volume) {
        return volume >= 1 && volume <= 10;
    }
}