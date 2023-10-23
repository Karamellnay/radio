package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void checkVolumeOnIncrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(20);
        radio.increaseVolume();
        int expected = 21;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkVolumeOnDecrease() {
        Radio radio = new Radio();
        radio.setCurrentVolume(35);
        radio.decreaseVolume();
        int expected = 34;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void checkRadioStationOnIncrease() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(6);
        radio.increaseRadioStation();
        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkRadioStationOnDecrease() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        radio.decreaseRadioStation();
        int expected = 4;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void chooseRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(3);
        int expected = 3;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void checkVolumeOnIncreaseMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkVolumeOnDecreaseMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void checkRadiostationOnIncreaseMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        radio.increaseRadioStation();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkRadiostationOnDecreaseMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.decreaseRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void chooseRadioStationBoundary() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void chooseVolumeBoundary() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void chooseRadioStationBoundaryNegative() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(- 1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void chooseVolumeBoundaryNegative() {
        Radio radio = new Radio();
        radio.setCurrentVolume(- 1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void checkVolumeOnIncreaseBoundary() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void quantityTest() {
        Radio radio = new Radio(15);
        Assertions.assertEquals(15,radio.getQuantityRadioStation());
    }
    @Test
    public void chooseMaxRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        int expected = 9;
        int actual = radio.getMaxNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void chooseMinRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        int expected = 0;
        int actual = radio.getMinNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void chooseMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getMaxVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void chooseMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getMinVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void checkRadiostationOnIncreaseMaxBoundary() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.increaseRadioStation();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void chooseRadioStationNew() {
        Radio radio = new Radio(20);
        radio.setCurrentRadioStation(15);
        int expected = 15;
        int actual = radio.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

}
