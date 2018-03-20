package com.example.aluno.disciplinaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.NumberPicker;

public class SecondActivity extends AppCompatActivity {
    private NumberPicker numberPicker1;
    private NumberPicker numberPicker2;
    private NumberPicker numberPicker3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        this.initViews();
    }

    private void initViews() {
        numberPicker1 = findViewById(R.id.picker2_1);
        numberPicker2 = findViewById(R.id.picker2_2);
        numberPicker3 = findViewById(R.id.picker2_3);

        this.configNumberPicker(numberPicker1);
        this.configNumberPicker(numberPicker2);
        this.configNumberPicker(numberPicker3);
    }

    private void configNumberPicker(NumberPicker numberPicker) {
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(10);
        numberPicker.setValue(10);
    }

}
