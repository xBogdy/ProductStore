package com.company;

import java.time.LocalDate;

public class Magazin {
    private String nume;
    private float pretC;
    private float pretV;
    private LocalDate data;
    private String descrierea;
    private int stoc;

    public Magazin(String nume, float pretC, float pretV, LocalDate data, String descrierea, int stoc, float profit) {
        this.nume = nume;
        this.pretC = pretC;
        this.pretV = pretV;
        this.data = data;
        this.descrierea = descrierea;
        this.stoc = stoc;
        this.profit = profit;
    }

    public float getProfit() {
        return profit;
    }

    public void setProfit(float profit) {
        this.profit = profit;
    }

    private float profit;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getPretC() {
        return pretC;
    }

    public void setPretC(float pretC) {
        this.pretC = pretC;
    }

    public float getPretV() {
        return pretV;
    }

    public void setPretV(float pretV) {
        this.pretV = pretV;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescrierea() {
        return descrierea;
    }

    public void setDescrierea(String descrierea) {
        this.descrierea = descrierea;
    }

    public int getStoc() {
        return stoc;
    }

    public void setStoc(int stoc) {
        this.stoc = stoc;
    }

    public Magazin(String nume, float pretC, float pretV, LocalDate data, String descrierea, int stoc) {
        this.nume = nume;
        this.pretC = pretC;
        this.pretV = pretV;
        this.data = data;
        this.descrierea = descrierea;
        this.stoc = stoc;
    }



}
