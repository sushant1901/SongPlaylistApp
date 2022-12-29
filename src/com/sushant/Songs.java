package com.sushant;

public class Songs {
    String tittle;
    double duration;

    public Songs(String tittle, double duration) {
        this.tittle = tittle;
        this.duration = duration;
    }

    public Songs() {

    }

    public String getTittle() {
        return tittle;
    }

    public double getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Songs{" +
                "tittle='" + tittle + '\'' +
                ", duration=" + duration +
                '}';
    }
}
