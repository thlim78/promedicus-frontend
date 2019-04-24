package com.promedicus.frontend.model;

import com.promedicus.frontend.model.type.Category;
import com.promedicus.frontend.model.type.Gender;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Admission implements Serializable {
    private Long id;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime dateAdmission;

    @NotBlank(message = "Patient name is mandatory.")
    @Size(max = 40, message = "Invalid patient name. Max 40 characters long.")
    private String patientName;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @NotNull(message = "Birth date is mandatory.")
    @PastOrPresent(message = "Birth date must not be in future.")
    private LocalDate dateOfBirth;

    private Gender gender;

    private Category category;

    private String source;
}
