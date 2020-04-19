package com.cosef.decorator;

public class Movie extends Type {
    private String name;
    private String director;
    public Movie(String name, String director) {
        this.director = director;
        this.name = name;
        type = "Movie";
    }

    @Override
    public String getContents() {
        return name + " is directed by " + director + " and is a/an" + getType();
    }

}
