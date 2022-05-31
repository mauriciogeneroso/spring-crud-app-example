package com.spring.crud.lib.exception;

import lombok.NoArgsConstructor;

/**
 * Exception thrown when a resource is not found
 *
 * @author Mauricio Generoso
 */
@NoArgsConstructor
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
