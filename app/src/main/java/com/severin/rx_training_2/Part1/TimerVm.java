package com.severin.rx_training_2.Part1;

import android.databinding.BindingMethod;
import android.databinding.ObservableField;
import android.databinding.ObservableLong;

public class TimerVm {

    private static TimerVm instance;

    private TimerVm() {}

    static TimerVm getInstance() {
        if (instance == null) {
            instance = new TimerVm();
        }
        return instance;
    }

    private ObservableLong elapsedTime = new ObservableLong();
    private ObservableField<String> displayString = new ObservableField<>();

    void setElapsedTime(long time) {
        elapsedTime.set(time);
        displayString.set(time + " seconds have elapsed");
    }

    long getElapsedTime() {
        return elapsedTime.get();
    }

    public ObservableField<String> getDisplayString() {
        return displayString;
    }
}
