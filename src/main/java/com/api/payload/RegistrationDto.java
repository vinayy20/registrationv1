package com.api.payload;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter

public class RegistrationDto implements Serializable {

    @NotEmpty
    @Size(min=2, message = "Min should be 2 letters")
    private String name;

    @Email
    private String email;

    @Size(min=10, max=10, message = "Should be 10 Digits")
    private String mobile;

}