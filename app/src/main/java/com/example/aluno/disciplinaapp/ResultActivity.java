package com.example.aluno.disciplinaapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.aluno.disciplinaapp.model.Discipline;

public class ResultActivity extends AppCompatActivity {
    private LinearLayout layoutDiscipline1;
    private LinearLayout layoutDiscipline2;
    private LinearLayout layoutAverage1;
    private LinearLayout layoutAverage2;
    private LinearLayout layoutSituation1;
    private LinearLayout layoutSituation2;
    private LinearLayout layoutAverageFinal;
    private LinearLayout layoutSituationFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        this.initViews();

        Bundle p = getIntent().getExtras();
        Discipline d1 = (Discipline) p.getSerializable("discipline1");
        Discipline d2 = (Discipline) p.getSerializable("discipline2");

        TextView textDiscipline1 = new TextView(this);
        textDiscipline1.setText(d1.getName());
        TextView textAvg1 = new TextView(this);
        textAvg1.setText(d1.getAvg().toString());
        TextView textSituation1 = new TextView(this);
        textSituation1.setText(d1.getSituation());
        layoutDiscipline1.addView(textDiscipline1);
        layoutAverage1.addView(textAvg1);
        layoutSituation1.addView(textSituation1);

        TextView textDiscipline2 = new TextView(this);
        textDiscipline2.setText(d2.getName());
        TextView textAvg2 = new TextView(this);
        textAvg2.setText(d2.getAvg().toString());
        TextView textSituation2 = new TextView(this);
        textSituation2.setText(d2.getSituation());
        layoutDiscipline2.addView(textDiscipline2);
        layoutAverage2.addView(textAvg2);
        layoutSituation2.addView(textSituation2);

        String finalSituation = (d1.getSituation().equalsIgnoreCase("A") &&
                d2.getSituation().equalsIgnoreCase("A")) ? "A" : "R";
        TextView textFinalSituation = new TextView(this);
        textFinalSituation.setText(finalSituation);
        layoutSituationFinal.addView(textFinalSituation);

        Double finalAvg = ((d1.getAvg() + d2.getAvg()) / 2D);
        TextView textFinalAvg = new TextView(this);
        textFinalAvg.setText(finalAvg.toString());
        layoutAverageFinal.addView(textFinalAvg);

    }

    private void initViews() {
        layoutDiscipline1 = findViewById(R.id.layout_discipline1);
        layoutDiscipline2 = findViewById(R.id.layout_discipline2);
        layoutAverage1 = findViewById(R.id.layout_avg1);
        layoutAverage2 = findViewById(R.id.layout_avg2);
        layoutSituation1 = findViewById(R.id.layout_situation1);
        layoutSituation2 = findViewById(R.id.layout_situation2);
        layoutAverageFinal = findViewById(R.id.layout_final_avg);
        layoutSituationFinal = findViewById(R.id.layout_final_situation);
    }

}
