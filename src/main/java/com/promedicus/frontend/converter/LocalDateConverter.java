package com.promedicus.frontend.converter;

import org.springframework.core.convert.converter.Converter;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public final class LocalDateConverter implements Converter<String, LocalDate> {

    private final DateTimeFormatter formatter;

    public LocalDateConverter(String dateFormat) {
        this.formatter = DateTimeFormatter.ofPattern(dateFormat);
    }

    @Override
    public LocalDate convert(String source) {
        if (source == null || source.isEmpty()) {
            return null;
        }

        return LocalDate.parse(source, formatter);
    }
}