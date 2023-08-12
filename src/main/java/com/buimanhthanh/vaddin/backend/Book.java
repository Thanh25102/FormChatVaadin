package com.buimanhthanh.vaddin.backend;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;


@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name="book")
@Entity
public class Book {

    @EqualsAndHashCode.Include
    @Id
    @UuidGenerator(style = UuidGenerator.Style.RANDOM)
    private String id;

    private String title;

    private LocalDate published;

    private Integer rating;

    public Book() {
    }

    public Book(String id, String title, LocalDate published, Integer rating) {
        this.id = id;
        this.title = title;
        this.published = published;
        this.rating = rating;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getPublished() {
        return published;
    }

    public void setPublished(LocalDate published) {
        this.published = published;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
