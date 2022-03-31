package com.ttsnetwork.template.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

/**
 * @author Zanaboni
 */
@Entity
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class TemplateClass {

    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "message")
    private String message;
}
