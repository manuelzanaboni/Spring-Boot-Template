package com.ttsnetwork.template.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

/**
 * @author Zanaboni
 */
@Configuration
public class AppConfigurer {
    private static final Logger log = LoggerFactory.getLogger(AppConfigurer.class);

    @Autowired
    private Environment environment;

    // methods annotated with @PostConstruct can be used to run con at startup
    // after the application has been "constructed"
    @PostConstruct
    public void appConstructed() {
        log.info("Log from AppConfigurer, env props loaded!");
        log.info("HTTP server listening on port: {}", environment.getProperty("server.port"));
        log.info("Remember to edit pom.xml and application-dev.yml config file");
    }
}
