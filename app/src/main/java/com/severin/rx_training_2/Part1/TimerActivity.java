package com.severin.rx_training_2.Part1;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.severin.rx_training_2.R;
import com.severin.rx_training_2.databinding.ActivityTimerBinding;

public class TimerActivity extends AppCompatActivity {

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityTimerBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_timer);
        TimerVm vm = TimerVm.getInstance();
        binding.setVm(vm);

        // AC:
        //   - TextView should display text in format "X seconds have elapsed"
        //   - X should update once per second
        // TODO update TextView here
    }
}
