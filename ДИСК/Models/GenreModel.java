package com.epam.model;

import org.springframework.hateoas.RepresentationModel;

public class GenreModel extends RepresentationModel<GenreModel> {

    private String genreName;

    private long genreId;

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

    public long getGenreId() {
        return genreId;
    }

    public void setGenreId(long genreId) {
        this.genreId = genreId;
    }
}
