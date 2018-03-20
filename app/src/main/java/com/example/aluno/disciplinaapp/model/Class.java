package com.example.aluno.disciplinaapp.model;

import java.io.Serializable;
import java.util.HashMap;

public class Class implements Serializable{

    private String name;
    private String situation;
    private Double avg;

    public Class() {
    }

    public Class(String name, String situation) {
        this.name = name;
        this.situation = situation;
    }

    public Class(String name, String situation, Double avg) {
        this.name = name;
        this.situation = situation;
        this.avg = avg;
    }

    public Class(String name, int n1, int n2, int n3) {
        this.name = name;
        this.situation = situation;
        this.avg = this.getAvg(n1, n2, n3);

        this.situation = this.avg >= 7 ? "A" : "R";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public Double getAvg(int n1, int n2, int n3) {
        return ((n1 + n2 + n3) / 3D);
    }
}
