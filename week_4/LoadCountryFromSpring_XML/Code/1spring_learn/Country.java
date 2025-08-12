package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Country {
	// Logger to print debug messages
    private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);

    // Two variables to store country details
    private String code;
    private String name;

    // Empty constructor - required by Spring
    public Country() {
        LOGGER.debug("Inside Country Constructor.");
    }

    // Getter and setter for 'code'
    public String getCode() {
        LOGGER.debug("Inside getCode() Method");
        return code;
    }

    public void setCode(String code) {
        LOGGER.debug("Inside setCode() Method");
        this.code = code;
    }

    // Getter and setter for 'name'
    public String getName() {
        LOGGER.debug("Inside getName() Method");
        return name;
    }

    public void setName(String name) {
        LOGGER.debug("Inside setName() Method");
        this.name = name;
    }

    // toString() method to print country object
    @Override
    public String toString() {
        return "[code=" + code + ", name=" + name + "]";
    }

}
