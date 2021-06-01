package com.epam.dto.request.create;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CreateBookDTO {

    @Size(min = 2, max = 30, message = "Incorrect author name(Should have size 2-30)")
    @Pattern(regexp = "[a-z A-Z]+", message = "Incorrect author name(Should only contain Latin letters")
    @NotBlank(message = "Incorrect author name(Should contain not only spaces)")
    @NotEmpty(message = "Incorrect author name(Should contain some information)")
    private String author;

    @Size(min = 2, max = 30, message = "Incorrect description (Should have size 2-30)")
    @Pattern(regexp = "[a-zA-Z 0-9]+",
            message = "Incorrect description (Should contain Latin letters, spaces or numbers)")
    @NotBlank(message = "Incorrect description (Should contain not only spaces)")
    @NotEmpty(message = "Incorrect description (Should contain some information)")
    private String description;

    @NotNull
    @NotEmpty
    private String imageName;

    @Min(value = 1, message = "Incorrect price value(Value must be more then 0)")
    private float price;

    @Pattern(regexp = "(?:19|20)[0-9]{2}.(?:(?:0[1-9]|1[0-2]).(?:0[1-9]|1[0-9]|2[0-9])|(?:(?!02)(?:0[1-9]|1[0-2]).(?:30))" +
            "|(?:(?:0[13578]|1[02])-31))", message = "Incorrect writingDate " +
            "(Date must follow pattern yyyy.mm.dd and be correct)")
    @NotBlank(message = "Incorrect writingDate (Should contain not only spaces)")
    @NotEmpty(message = "Incorrect writingDate (Should contain some information)")
    private String writingDate;

    @Min(value = 1, message = "Incorrect numberOfPages value(Value must be more then 0)")
    private int numberOfPages;

    @Size(min = 2, max = 30, message = "Incorrect title (Should have size 2-30)")
    @Pattern(regexp = "[a-zA-Z 0-9]+",
            message = "Incorrect title (Should contain Latin letters, spaces or numbers)")
    @NotBlank(message = "Incorrect title (Should contain not only spaces)")
    @NotEmpty(message = "Incorrect title (Should contain some information)")
    private String title;

    @NotEmpty(message = "Incorrect genres (Should contain some information)")
    @Valid
    private List<CreateGenreDTO> genres;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getWritingDate() {
        return writingDate;
    }

    public void setWritingDate(String writingDate) {
        this.writingDate = writingDate;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<CreateGenreDTO> getGenres() {
        return genres;
    }

    public void setGenres(List<CreateGenreDTO> genres) {
        this.genres = genres;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}

