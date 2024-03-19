package com.Company.Company.company;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import jakarta.validation.constraints.*;
@Data
@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 5)
    private String companyName;

    @Email
    @NotBlank
    private String email;

    @PositiveOrZero
    private Integer strength;

    private String webSiteURL;

    @Size(max = 5)
    @Pattern(regexp = "^[a-zA-Z]{2}[0-9]{2}[EN]$", message = "Company code format is invalid")
    private String companyCode;
}
