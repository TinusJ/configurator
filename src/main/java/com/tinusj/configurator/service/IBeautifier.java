package com.tinusj.configurator.service;

/**
 * Interface for the beautifier service
 */
public interface IBeautifier {

    /**
     * Beautify the file
     *
     * @param fileAsString
     * @return
     */
    String beautify(String fileAsString);
}
