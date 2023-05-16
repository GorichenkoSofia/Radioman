package  ru.netology;

public class Radioman {
    private int currentRadioStation;
    private int currentVolume;
    private int minRadioStation = 0;
    private int maxRadioStation = 10;
    private int maxVolume = 100;
    private int minVolume = 0;

    public Radioman(int currentRadioStation, int currentVolume, int minRadioStation, int maxRadioStation, int minVolume, int maxVolume) {
        this.currentRadioStation = currentRadioStation;
        this.currentVolume = currentVolume;
        this.minRadioStation = minRadioStation;
        this.maxRadioStation = maxRadioStation;
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
    }

    public Radioman(int currentRadioStation, int currentVolume) {
        this.currentRadioStation = currentRadioStation;
        this.currentVolume = currentVolume;

    }

    public Radioman(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation-1;
    }


    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < maxRadioStation) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setCurrentValume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseCurrentVolume() {
        if (currentVolume < maxVolume) currentVolume++;
    }

    public void decreaseCurrentVolume() {
        if (currentVolume > minVolume) currentVolume--;
    }

    public void nextStation() {
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = minRadioStation;
            return;
        }
        currentRadioStation++;
    }

    public void prevStation() {
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = maxRadioStation;
            return;
        }
        currentRadioStation--;
    }

    public int getMinRadioStation(int expected) {
        return minRadioStation;
    }

    public int getMaxRadioStation(int expected) {
        return maxRadioStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
}