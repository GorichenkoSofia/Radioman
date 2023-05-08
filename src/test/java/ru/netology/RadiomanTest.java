package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadiomanTest {
    Radioman radioman = new Radioman();

    @Test
    void shouldGetCurrentRadioStation() {
        int expected = 1;
        radioman.setCurrentRadioStation(expected);

        Assertions.assertEquals(expected, radioman.getCurrentRadioStation());
    }

    @Test
    void shouldSetNextRadioStation() {
        int station = 8;
        int expected = 9;

        radioman.setCurrentRadioStation(station);
        radioman.setNextRadioStation();
        Assertions.assertEquals(expected, radioman.getCurrentRadioStation());
    }

    @Test
    void shouldSetPrevRadioStation() {
        int station = 8;
        int expected = 7;

        radioman.setCurrentRadioStation(station);
        radioman.setPrevRadioStation();
        Assertions.assertEquals(expected, radioman.getCurrentRadioStation());
    }

    @Test
    void shouldSwitchAfterLastStation() {
        int station = 9;
        int expected = 0;

        radioman.setCurrentRadioStation(station);
        radioman.setNextRadioStation();
        Assertions.assertEquals(expected, radioman.getCurrentRadioStation());
    }

    @Test
    void shouldSwitchAfterFirstStation() {
        int station = 0;
        int expected = 9;

        radioman.setCurrentRadioStation(station);
        radioman.setPrevRadioStation();
        Assertions.assertEquals(expected, radioman.getCurrentRadioStation());
    }

    @Test
    void shouldCheckStationsLimitsDown() {
        int station = -1;
        int expected = 0;

        radioman.setCurrentRadioStation(station);
        Assertions.assertEquals(expected, radioman.getCurrentRadioStation());
    }

    @Test
    void shouldCheckStationsLimitsUp() {
        int station = 10;
        int expected = 0;

        radioman.setCurrentRadioStation(station);
        Assertions.assertEquals(expected, radioman.getCurrentRadioStation());
    }

    @Test
    void shouldGetCurrentVolume() {
        int volume = 1;
        int expected = 1;

        radioman.setCurrentVolume(volume);
        Assertions.assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    void shouldIncreaseVolume() {
        int volume = 8;
        int expected = 9;

        radioman.setCurrentVolume(volume);
        radioman.increaseVolume();
        Assertions.assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        int volume = 8;
        int expected = 7;

        radioman.setCurrentVolume(volume);
        radioman.decreaseVolume();
        Assertions.assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    void shouldCheckVolumeUp() {
        int volume = 10;
        int expected = 10;

        radioman.setCurrentVolume(volume);
        radioman.increaseVolume();
        Assertions.assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    void shouldCheckVolumeDown() {
        int volume = 0;
        int expected = 0;

        radioman.setCurrentVolume(volume);
        radioman.decreaseVolume();
        Assertions.assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    void shouldCheckVolumeLimitUp() {
        int volume = 11;
        int expected = 0;

        radioman.setCurrentVolume(volume);
        Assertions.assertEquals(expected, radioman.getCurrentVolume());
    }

    @Test
    void shouldCheckVolumeLimitDown() {
        int volume = -1;
        int expected = 0;

        radioman.setCurrentVolume(volume);
        Assertions.assertEquals(expected, radioman.getCurrentVolume());
    }
}








