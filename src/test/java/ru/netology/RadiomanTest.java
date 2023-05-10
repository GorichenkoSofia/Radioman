package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadiomanTest {
    private int minVolume = 0;
    private int maxVolume = 100;
    private int minRadioStation = 0;
    private int maxRadioStation = 10;

    @Test
    void shouldSetCurrentVolume() {
        Radioman radio = new Radioman(1, 34, minRadioStation, maxRadioStation, minVolume, maxVolume);
        int expected = 34;
        radio.setCurrentValume(expected);
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldInvalidMaxSetCurrentVolume() {
        int expected = 100;
        Radioman radio = new Radioman(1, expected);
        radio.setCurrentValume(101);
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldInvalidMinSetCurrentVolume() {
        // Текущая громкость
        int expected = 1;
        Radioman radio = new Radioman(1, 1);
        // Установить значение громкости больше максимальной
        radio.setCurrentValume(-1);
        // Проверить, что текущая громкость не изменилась
        Assertions.assertEquals(expected, radio.getCurrentVolume());
    }

    @Test
    void shouldIncreaseCurrentVolume() {
        Radioman radio = new Radioman(1, 99, minRadioStation, maxRadioStation, minVolume, maxVolume);
        radio.increaseCurrentVolume();
        radio.increaseCurrentVolume();
        Assertions.assertEquals(radio.getMaxVolume(), radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseCurrentVolume() {
        Radioman radio = new Radioman(1, 1, minRadioStation, maxRadioStation, minVolume, maxVolume);
        radio.decreaseCurrentVolume();
        radio.decreaseCurrentVolume();
        Assertions.assertEquals(radio.getMinVolume(), radio.getCurrentVolume());
    }

    @Test
    void shouldSetCurrentRadioStation() {
        Radioman radio = new Radioman(9, 50, minRadioStation, maxRadioStation, minVolume, maxVolume);
        int expected = 9;
        radio.setCurrentRadioStation(expected);
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetMinRadioStation() {
        Radioman radio = new Radioman(0, 35);
        int expected = 0;
        radio.getMinRadioStation(expected);
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());

    }

    @Test
    void shouldSetMaxRadioStation() {
        Radioman radio = new Radioman(10, 35);
        int expected = 10;
        radio.getMaxRadioStation(expected);
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());

    }

    @Test
    void shouldSetMinVolume() {
        Radioman radio = new Radioman(2, 0);
        int expected = 0;
        radio.setMinVolume(expected);
        Assertions.assertEquals(expected, radio.getCurrentVolume());

    }

    @Test
    void shouldSetMaxVolume() {
        Radioman radio = new Radioman(2, 100);
        int expected = 100;
        radio.setMaxVolume(expected);
        Assertions.assertEquals(expected, radio.getCurrentVolume());

    }


    @Test
    void shouldNextRadioStation() {
        Radioman radio = new Radioman(9, 50, minRadioStation, maxRadioStation, minVolume, maxVolume);
        // Нажать 2 раза next
        radio.nextStation();
        radio.nextStation();
        // Ожидаемый результат
        int expected = 0;
        // Проверить, что станция 0 теперь текущая
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldPrevRadioStation() {
        Radioman radio = new Radioman(1, 50, minRadioStation, maxRadioStation, minVolume, maxVolume);
        radio.prevStation();
        radio.prevStation();
        int expected = 10;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }


}







