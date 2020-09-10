package ru.netology.domain;

public class Radio {
    int currentStationNumber;
    int maxStationNumber;
    int minStationNumber;
    int currentVolume;
    int maxVolume;
    int minVolume;

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        this.currentStationNumber = currentStationNumber;
    }

    public int getMaxStationNumber() {
        return maxStationNumber;
    }

    public void setMaxStationNumber(int maxStationNumber) {
        this.maxStationNumber = maxStationNumber;
    }

    public int getMinStationNumber() {
        return minStationNumber;
    }

    public void setMinStationNumber(int minStationNumber) {
        this.minStationNumber = minStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int volume) {
        this.currentVolume = volume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public void increaseStationNumber() {
        if (currentStationNumber < maxStationNumber) {
            currentStationNumber += 1;
        } else if (currentStationNumber == maxStationNumber) {
            currentStationNumber = 0;
        }
    }

    public void decreaseStationNumber() {
        if (currentStationNumber > minStationNumber) {
            currentStationNumber -= 1;
        }
        if (currentStationNumber == minStationNumber) {
            currentStationNumber = 9;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume += 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume -= 1;
        }
    }

}
