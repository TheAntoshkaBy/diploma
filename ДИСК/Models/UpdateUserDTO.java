package com.epam.dto.request.update;

import javax.validation.constraints.*;

public class UpdateUserDTO {
    @Size(min = 2, max = 30, message = "Incorrect username(Should have size 2-30)")
    @Pattern(regexp = "[a-zA-Z 0-9]+",
            message = "Incorrect username (Should contain Latin letters, spaces or numbers)")
    @NotBlank(message = "Incorrect username(Should contain not only spaces)")
    @NotEmpty(message = "Incorrect username(Should contain some information)")
    private String username;
    @Size(min = 4, max = 30, message = "Incorrect password(Should have size 2-30)")
    @Pattern(regexp = "[a-zA-Z0-9]+",
            message = "Incorrect password (Should contain Latin letters, spaces or numbers)")
    @NotBlank(message = "Incorrect password(Should contain not only spaces)")
    @NotEmpty(message = "Incorrect password(Should contain some information)")
    private String password;

    @Pattern(regexp = "[a-zA-Z]+", message = "Incorrect role (Should contain Latin letters, spaces or numbers)")
    @NotBlank(message = "Incorrect role(Should contain not only spaces)")
    @NotEmpty(message = "Incorrect role(Should contain some information)")
    private String role;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
