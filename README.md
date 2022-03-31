# Spring-Boot-Template

This repository is to be considered as a template for Spring Boot applications' development.

## Dependencies
It contains the following dependencies:

* **spring-boot-starter-web** - provide an HTTP server through *undertow* container
* **spring-boot-starter-data-jpa** - for database manipulation
* **liquibase-core** - for database migration
* **postgresql** - as database
* **lombok** - to enhance development
* **spring-boot-starter-test** - to handle application's tests
* **springdoc-openapi-ui** - to automatically generate Swagger endpoint documentation

## Profiles
This template provides two Spring Boot profiles: **dev** and **prod**, 
which can be activated using **Maven** profiles (*-Pdev* e *-Pprod*)

> Check out *YAML* files in the resources' section for Spring properties definition.

## Liquibase
Liquibase has been chosen as database migration tool, and it can be used through the **liquibase-maven-plugin**.
> Check out *liquibase.properties* file in the resources section for Liquibase configuration.

## Error handling
The package *com.ttsnetwork.template.web.errors* defines the logic to handle HTTP errors.

## Using this template
These are the steps to follow if you want to use this template:
* update project's information in the **pom.xml**
```xml
    <project>
        <groupId>com.ttsnetwork</groupId>
        <artifactId>template</artifactId>
        <version>0.0.1-SNAPSHOT</version>
        <name>template</name>
        <description>Template project for Spring Boot</description>
        ...
    </project>
```
* rename package *com.ttsnetwork.template*
* rename the main class *TemplateApplication*
* rename the test class *TemplateApplicationTests*
* configure properties' files in the resources' section. (Remember to remove **spring.autoconfigure.exclude** prop from *application-dev.yml* and configure the datasource)

## Run
To run the application:

    spring-boot:run -Pdev