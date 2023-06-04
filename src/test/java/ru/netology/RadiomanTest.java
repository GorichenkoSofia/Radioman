package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadiomanTest {
    @Test
    public void shouldNotSetVolumeOverMax() {
        Radioman radio = new Radioman();

        radio.setCurrentVolume(101);

        int expected = radio.getCurrentVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeUnderMin() {
        Radioman radio = new Radioman();

        radio.setCurrentVolume(-1);

        int expected = radio.getCurrentVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radioman radio = new Radioman();

        radio.setCurrentVolume(5);
        radio.increaseCurrentVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeOverMax() {
        Radioman radio = new Radioman();

        radio.setCurrentVolume(100);
        radio.increaseCurrentVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeUnderMin() {

        Radioman radio = new Radioman();

        radio.setCurrentVolume(0);
        radio.decreaseCurrentVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radioman radio = new Radioman();

        radio.setCurrentVolume(10);
        radio.decreaseCurrentVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationOverMax() {
        Radioman radio = new Radioman(15);

        radio.setCurrentStation(16);

        int expected = radio.getCurrentStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationUnderMin() {
        Radioman radio = new Radioman();

        radio.setCurrentStation(-1);

        int expected = radio.getCurrentStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeToNextStation() {
        Radioman radio = new Radioman(15);

        radio.setCurrentStation(12);
        radio.nextStation();

        int expected = 13;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldChangeToPrevStation() {
        Radioman radio = new Radioman(15);

        radio.setCurrentStation(12);
        radio.prevStation();

        int expected = 11;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeToNextStationOverMax() {
        Radioman radio = new Radioman(15);

        radio.setCurrentStation(14);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeToPrevStationUnderMin() {
        Radioman radio = new Radioman(15);

        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = 14;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldShowNumOfMaxStations() {
        Radioman radio = new Radioman(11);

        int expected = 10;
        int actual = radio.getNumOfMaxStations();

        Assertions.assertEquals(expected, actual);
    }
}