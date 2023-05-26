/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.dataart.starter.demo.lib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleConfig {

    Logger log = LoggerFactory.getLogger(SampleConfig.class);

    public String someBean() {
        log.info("Some bean injected into Spring context");
        return "Some String bean";
    }

}
