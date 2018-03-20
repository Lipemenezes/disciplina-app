package com.example.aluno.disciplinaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;

import com.example.aluno.disciplinaapp.model.Class;

public class MainActivity extends AppCompatActivity {
    private NumberPicker numberPicker1;
    private NumberPicker numberPicker2;
    private NumberPicker numberPicker3;
    private EditText editClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.initViews();
    }

    private void initViews() {
        numberPicker1 = findViewById(R.id.picker1);
        numberPicker2 = findViewById(R.id.picker2);
        numberPicker3 = findViewById(R.id.picker3);
        editClass = findViewById(R.id.edit_class1);

        this.configNumberPicker(numberPicker1);
        this.configNumberPicker(numberPicker2);
        this.configNumberPicker(numberPicker3);
    }

    private void configNumberPicker(NumberPicker numberPicker) {
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(10);
        numberPicker.setValue(10);
    }

    public void nextActivity(View view) {
        Class c = new Class(
            editClass.getText().toString(),
            numberPicker1.getValue(),
            numberPicker2.getValue(),
            numberPicker3.getValue()
        );

        Intent it = new Intent(this, SecondActivity.class);
        it.putExtra("class", c);
    }

}
