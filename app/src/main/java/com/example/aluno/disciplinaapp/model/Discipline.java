package com.example.aluno.disciplinaapp.model;

import java.io.Serializable;
import java.util.HashMap;

public class Discipline implements Serializable{

    private String name;
    private String situation;
    private Double avg;

    public Discipline() {
    }

    public Discipline(String name, String situation) {
        this.name = name;
        this.situation = situation;
    }

    public Discipline(String name, String situation, Double avg) {
        this.name = name;
        this.situation = situation;
        this.avg = avg;
    }

    public Discipline(String name, int n1, int n2, int n3) {
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

    public Double getAvg() {
        return avg;
    }

    public void setAvg(Double avg) {
        this.avg = avg;
    }

    public Double getAvg(int n1, int n2, int n3) {
        return ((n1 + n2 + n3) / 3D);
    }
}
