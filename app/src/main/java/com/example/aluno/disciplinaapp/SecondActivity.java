package com.example.aluno.disciplinaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;

import com.example.aluno.disciplinaapp.model.Discipline;

public class SecondActivity extends AppCompatActivity {
    private NumberPicker numberPicker1;
    private NumberPicker numberPicker2;
    private NumberPicker numberPicker3;
    private EditText editDiscipline;

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
        editDiscipline = findViewById(R.id.edit_discipline2);

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
        Bundle p = getIntent().getExtras();
        Discipline discipline = new Discipline(
                editDiscipline.getText().toString(),
                numberPicker1.getValue(),
                numberPicker2.getValue(),
                numberPicker3.getValue()
        );

        Intent it = new Intent(this, ResultActivity.class);
        it.putExtra("discipline2", discipline);
        it.putExtra("discipline1", p.getSerializable("discipline"));
        startActivity(it);
    }

}
