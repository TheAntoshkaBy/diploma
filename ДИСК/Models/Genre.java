package com.epam.entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@Table(name = "genre", schema = "public")
@EntityListeners(AuditingEntityListener.class)
public class Genre extends Auditable{

    @Column(name = "genre_name", nullable = false, unique = true)
    private String genreName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "genre_id", nullable = false)
    private long genreId;

    public Genre() {
    }

    public Genre(String genreName) {
        this.genreName = genreName;
    }

    public Genre(String genreName, long id) {
        this.genreName = genreName;
        this.genreId = id;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Genre genre = (Genre) o;

        if (genreId != genre.genreId) return false;
        return genreName != null ? genreName.equals(genre.genreName) : genre.genreName == null;
    }

    @Override
    public int hashCode() {
        int result = genreName != null ? genreName.hashCode() : 0;
        result = 31 * result + (int) (genreId ^ (genreId >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "genreName='" + genreName + '\'' +
                ", genreId=" + genreId +
                '}';
    }
}
