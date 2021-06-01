package com.epam.dto.request.update;

import javax.validation.constraints.*;

public class UpdateGenreDTO {
    @Size(min = 2, max = 30, message = "Incorrect genre name(Should have size 2-30)")
    @Pattern(regexp = "[a-zA-Z 0-9]+",
            message = "Incorrect genre name(Should contain Latin letters, spaces or numbers)")
    @NotBlank(message = "Incorrect genre name(Should contain not only spaces)")
    @NotEmpty(message = "Incorrect genre name(Should contain some information)")
    private String genreName;

    @Min(value = 1, message = "Incorrect genreId value (Value must be more then 0)")
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
