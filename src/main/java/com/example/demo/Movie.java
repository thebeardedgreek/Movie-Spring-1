package com.example.demo;

public class Movie {
    private String title;
    private String director;
    private int yearRelease;

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }
}
