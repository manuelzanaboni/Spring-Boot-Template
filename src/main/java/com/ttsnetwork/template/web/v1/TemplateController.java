package com.ttsnetwork.template.web.v1;

import com.ttsnetwork.template.domain.TemplateClass;
import com.ttsnetwork.template.services.TemplateService;
import com.ttsnetwork.template.web.errors.TemplateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.util.UUID;

/**
 * @author Zanaboni
 */
@RestController
@RequestMapping("/api/v1")
public class TemplateController {
    private static final Logger log = LoggerFactory.getLogger(TemplateController.class);

    @Autowired
    private TemplateService templateService;

    /**
     *  An example of GET request handler with {@link TemplateClass} JSON serialization through Jackson
     */
    @GetMapping("/hello")
    public ResponseEntity<TemplateClass> getHelloMessage() {
        log.info("HTTP request: GET /hello");

        TemplateClass templateClass = new TemplateClass(UUID.randomUUID(), templateService.hello());
        return ResponseEntity.ok(templateClass);
    }

    /**
     *  An example of POST request handler with TemplateClass json serialization through Jackson
     *
     *  Send a json body like:
     *  <pre>
     *  {
     *      "id": "e140a7ce-b9d7-499b-897f-938931b821cd",
     *      "message": "Hello World"
     *  }</pre>
     *  and Jackson will take care of the deserialization into a {@link TemplateClass}.
     *  <p>
     *  If an unsupported value is sent the
     *  {@link com.ttsnetwork.template.web.errors.ApiExceptionHandler#handleHttpMessageNotReadable(HttpMessageNotReadableException, HttpHeaders, HttpStatus, WebRequest)}
     *  method gets called.
     */
    @PostMapping("/hello")
    public ResponseEntity<Void> createHelloMessage(@RequestBody TemplateClass templateClass) {
        log.info("HTTP request: POST /hello");

        log.info("Received UUID: {}, message: {}", templateClass.getId(), templateClass.getMessage());
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/hello/error")
    public ResponseEntity<Void> handleErrors() throws TemplateException {
        log.info("HTTP request: GET /hello/error");

        templateService.handleError();
        return ResponseEntity.notFound().build();
    }

}
