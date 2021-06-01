package com.epam.dto.request.create;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CreateGenreDTO {

    @Size(min = 2, max = 30, message = "Incorrect genre name(Should have size 2-30)")
    @Pattern(regexp = "[a-zA-Z 0-9]+",
            message = "Incorrect genre name(Should contain Latin letters, spaces or numbers)")
    @NotBlank(message = "Incorrect genre name(Should contain not only spaces)")
    @NotEmpty(message = "Incorrect genre name(Should contain some information)")
    private String genreName;

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }
}
