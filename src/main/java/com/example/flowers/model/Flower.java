package com.example.flowers.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import jakarta.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "virag")
public class Flower {
    @Id
    @GeneratedValue
    private Long id;
    @NonNull
    private String name;
}
