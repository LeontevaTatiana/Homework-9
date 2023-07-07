package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(6);

        int expected = 6;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-3);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(15);

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingStationsBetweenEndsNext() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);

        radio.next();

        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void switchingStationsBetweenEndsPrev() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);

        radio.prev();

        int expected = 5;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(55);

        int expected = 55;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeAtMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeAtMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.turnDownTheVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnUpTheSoundBetweenEnds() {
        Radio radio = new Radio();

        radio.setCurrentVolume(70);
        radio.increaseVolume();

        int expected = 71;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnDownTheSoundBetweenEnds() {
        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        radio.turnDownTheVolume();

        int expected = 49;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNotSetVolumeUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-5);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(115);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}

