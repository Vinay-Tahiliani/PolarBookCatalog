package com.polarbookshop.catalog_service.domain;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

public record Book(
        @NotBlank(message = "The book ISBN must be defined.")
        @Pattern(regexp = "^([0-9]{10}|[0-9]{13})$",
                message = "The ISBN format must be valid."
        )

        String isbn,
        @NotBlank(message = "The book author must be defined.")
        String author,
        @NotBlank(message = "The book title must be defined."
        )
        String title,
        @NotNull(message = "The book price must be defined.")
        @Positive(message = "The book price must be greater than zero."
        )
        Double price) {

}