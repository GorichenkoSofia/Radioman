public class Radio {
    private int stationNumber;
    private int volume;

    public void next() {
        if (stationNumber != 9) {
            stationNumber++;
        } else {
            stationNumber = 0;
        }
    }

    public void prev() {
        if (stationNumber != 0) {
            stationNumber--;
        } else {
            stationNumber = 9;
        }
    }

    public void volumeMax() {
        if (volume >= 10) {
            return;
        } else {
            volume++;
        }
    }

    public void volumeMin() {
        if (volume <= 0) {
            volume = 0;
        } else {
            volume--;
        }
    }


    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int stationNumber) {
        if (stationNumber < 0) {
            return;
        }
        if (stationNumber > 9) {
            return;
        }
        this.stationNumber = stationNumber;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 10) {
            return;
        }
        this.volume = volume;
    }
}
