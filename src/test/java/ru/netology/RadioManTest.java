package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioManTest {
    RadioMan radioMan = new RadioMan();

    @Test
    void shouldGetCurrentRadioStation() {
        int expected = 1;
        radioMan.setCurrentRadioStation(expected);

        Assertions.assertEquals(expected, radioMan.getCurrentRadioStation());
    }

    @Test
    void shouldSetNextRadioStation() {
        int station = 8;
        int expected = 9;

        radioMan.setCurrentRadioStation(station);
        radioMan.setNextRadioStation();
        Assertions.assertEquals(expected, radioMan.getCurrentRadioStation());
    }

    @Test
    void shouldSetPrevRadioStation() {
        int station = 8;
        int expected = 7;

        radioMan.setCurrentRadioStation(station);
        radioMan.setPrevRadioStation();
        Assertions.assertEquals(expected, radioMan.getCurrentRadioStation());
    }

    @Test
    void shouldSwitchAfterLastStation() {
        int station = 9;
        int expected = 0;

        radioMan.setCurrentRadioStation(station);
        radioMan.setNextRadioStation();
        Assertions.assertEquals(expected, radioMan.getCurrentRadioStation());
    }

    @Test
    void shouldSwitchAfterFirstStation() {
        int station = 0;
        int expected = 9;

        radioMan.setCurrentRadioStation(station);
        radioMan.setPrevRadioStation();
        Assertions.assertEquals(expected, radioMan.getCurrentRadioStation());
    }

    @Test
    void shouldCheckStationsLimitsDown() {
        int station = -1;
        int expected = 0;

        radioMan.setCurrentRadioStation(station);
        Assertions.assertEquals(expected, radioMan.getCurrentRadioStation());
    }

    @Test
    void shouldCheckStationsLimitsUp() {
        int station = 10;
        int expected = 0;

        radioMan.setCurrentRadioStation(station);
        Assertions.assertEquals(expected, radioMan.getCurrentRadioStation());
    }

    @Test
    void shouldGetCurrentVolume() {
        int volume = 1;
        int expected = 1;

        radioMan.setCurrentVolume(volume);
        Assertions.assertEquals(expected, radioMan.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolume() {
        int volume = 8;
        int expected = 9;

        radioMan.setCurrentVolume(volume);
        radioMan.increaseVolume();
        Assertions.assertEquals(expected, radioMan.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        int volume = 8;
        int expected = 7;

        radioMan.setCurrentVolume(volume);
        radioMan.decreaseVolume();
        Assertions.assertEquals(expected, radioMan.getCurrentVolume());
    }

    @Test
    void shouldCheckVolumeUp() {
        int volume = 10;
        int expected = 10;

        radioMan.setCurrentVolume(volume);
        radioMan.increaseVolume();
        Assertions.assertEquals(expected, radioMan.getCurrentVolume());
    }

    @Test
    void shouldCheckVolumeDown() {
        int volume = 0;
        int expected = 0;

        radioMan.setCurrentVolume(volume);
        radioMan.decreaseVolume();
        Assertions.assertEquals(expected, radioMan.getCurrentVolume());
    }

    @Test
    void shouldCheckVolumeLimitUp() {
        int volume = 11;
        int expected = 0;

        radioMan.setCurrentVolume(volume);
        Assertions.assertEquals(expected, radioMan.getCurrentVolume());
    }

    @Test
    void shouldCheckVolumeLimitDown() {
        int volume = -1;
        int expected = 0;

        radioMan.setCurrentVolume(volume);
        Assertions.assertEquals(expected, radioMan.getCurrentVolume());
    }
}








