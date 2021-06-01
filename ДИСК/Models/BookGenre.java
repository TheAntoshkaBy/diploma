package com.epam.entity;

import javax.persistence.*;

@Entity
@Table(name = "book_genre", schema = "public")
@NamedQuery(name = "BookGenre.getAllBooksByGenre", query = "SELECT c FROM BookGenre sc INNER JOIN Book c ON " +
        "c.bookId=sc.bookId WHERE sc.genreId= :genreId")
@NamedQuery(name = "BookGenre.getAllGenresOnBook", query = "SELECT c FROM BookGenre sc INNER JOIN Genre c ON " +
        "c.genreId=sc.genreId WHERE sc.bookId= :bookId")

@SqlResultSetMapping(name = "deleteResult", columns = {@ColumnResult(name = "count")})
@NamedNativeQueries({
        @NamedNativeQuery(name = "BookGenre.remove",
                query = "DELETE FROM book_genre WHERE genre_id = ? AND book_id=?",
                resultSetMapping = "deleteResult")
})
public class BookGenre {
    @Column(name = "book_id", nullable = false)
    private long bookId;
    @Id
    @Column(name = "genre_id", nullable = false)
    private long genreId;

    public BookGenre() {
    }

    public BookGenre(long bookId, long genreId) {
        this.bookId = bookId;
        this.genreId = genreId;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
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

        BookGenre bookGenre = (BookGenre) o;

        if (bookId != bookGenre.bookId) return false;
        return genreId == bookGenre.genreId;
    }

    @Override
    public int hashCode() {
        int result = (int) (bookId ^ (bookId >>> 32));
        result = 31 * result + (int) (genreId ^ (genreId >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "BookGenre{" +
                "bookId=" + bookId +
                ", genreId=" + genreId +
                '}';
    }

    public static final class QueryNames {
        public static final String BOOKS_BY_GENRE = "BookGenre.getAllBooksByGenre";
        public static final String GENRE_ON_BOOK = "BookGenre.getAllGenresOnBook";
        public static final String REMOVE = "BookGenre.remove";

        public QueryNames() {
        }
    }
}
