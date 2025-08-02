package com.configurator.system_model_service.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "system_models")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SystemModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String type;

    private LocalDateTime createdAt = LocalDateTime.now();
}
