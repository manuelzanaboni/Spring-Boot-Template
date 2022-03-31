package com.ttsnetwork.template.repositories;

import com.ttsnetwork.template.domain.TemplateClass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * @author Zanaboni
 */
public interface TemplateRepository extends JpaRepository<TemplateClass, UUID> {
}
