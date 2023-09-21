package com.example.hibernateenvers.example;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Audited
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @NotAudited
    private Long pages;
}
