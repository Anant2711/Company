package com.Company.Company.companydto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class CompanyDTO {

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
