package org.overlake.mat803.counter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import org.overlake.mat803.counter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private int mCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }

    public void change(View v) {
        mCount += v.getId() == R.id.plus ? 1 : -1;

    }
}