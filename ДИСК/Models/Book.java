package com.epam.entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "book", schema = "public")
@EntityListeners(AuditingEntityListener.class)
public class Book extends Auditable {

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "price", nullable = false)
    private float price;

    @Column(name = "writing_date", nullable = false)
    private String writingDate;

    @Column(name = "page_number", nullable = false)
    private int numberOfPages;

    @Column(name = "title", nullable = false)
    private String title;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id", nullable = false)
    private long bookId;

    @Column(name = "image_name", nullable = false)
    private String imageName;

    @Transient
    private List<Genre> genres;

    public Book() {
    }

    public Book(String author, String description, float price, String writingDate, int numberOfPages, String title) {
        this.author = author;
        this.description = description;
        this.price = price;
        this.writingDate = writingDate;
        this.numberOfPages = numberOfPages;
        this.title = title;
    }

    public Book(String author, String description, float price, String writingDate, int numberOfPages, String title,
            long bookId) {
        this.author = author;
        this.description = description;
        this.price = price;
        this.writingDate = writingDate;
        this.numberOfPages = numberOfPages;
        this.title = title;
        this.bookId = bookId;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getWritingDate() {
        return this.writingDate;
    }

    public void setWritingDate(String writingDate) {
        this.writingDate = writingDate;
    }

    public int getNumberOfPages() {
        return this.numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Book book = (Book) o;

        if (Float.compare(book.price, price) != 0)
            return false;
        if (numberOfPages != book.numberOfPages)
            return false;
        if (bookId != book.bookId)
            return false;
        if (!Objects.equals(author, book.author))
            return false;
        if (!Objects.equals(description, book.description))
            return false;
        if (!Objects.equals(writingDate, book.writingDate))
            return false;
        if (!Objects.equals(title, book.title))
            return false;
        if (!Objects.equals(imageName, book.imageName))
            return false;
        return Objects.equals(genres, book.genres);
    }

    @Override
    public int hashCode() {
        int result = author != null ? author.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (price != +0.0f ? Float.floatToIntBits(price) : 0);
        result = 31 * result + (writingDate != null ? writingDate.hashCode() : 0);
        result = 31 * result + numberOfPages;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (int) (bookId ^ (bookId >>> 32));
        result = 31 * result + (imageName != null ? imageName.hashCode() : 0);
        result = 31 * result + (genres != null ? genres.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", writingDate='" + writingDate + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", title='" + title + '\'' +
                ", bookId=" + bookId +
                ", imageName='" + imageName + '\'' +
                ", genres=" + genres +
                '}';
    }
}
