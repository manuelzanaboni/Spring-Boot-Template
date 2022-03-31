package com.ttsnetwork.template.services;

import com.ttsnetwork.template.web.errors.TemplateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author Zanaboni
 *
 * A @Service class which can be @Autowired into classes managed by Spring.
 */
@Service
public class TemplateService {
    private static final Logger log = LoggerFactory.getLogger(TemplateService.class);

    public String hello() {
        log.info("Call to hello().");
        return "Hello World";
    }

    /**
     * @throws TemplateException the exception handled by {@link com.ttsnetwork.template.web.errors.ApiExceptionHandler#handleTemplateException(TemplateException)}
     */
    public void handleError() throws TemplateException {
        // do something
        
        // throw exception if an error occurs
        throw new TemplateException(
                "This is how error are managed.",
                "This is the debug message.");
    }
    
}
