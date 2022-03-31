package com.ttsnetwork.template.web.errors;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Zanaboni
 *
 * You can define custom exception in order to handle different types of error.
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TemplateException extends Exception {
    private final String debugMessage;

    public TemplateException(String errorMessage, String debugMessage) {
        super(errorMessage);
        this.debugMessage = debugMessage;
    }
}
