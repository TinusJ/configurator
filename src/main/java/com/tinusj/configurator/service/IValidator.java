package com.tinusj.configurator.service;

/**
 * Interface for the validator service
 */
public interface IValidator {

    /**
     * Validate the file
     *
     * @param fileAsString as String
     * @return as boolean
     */
    boolean validate(String fileAsString);
}
