package com.ndi;

import org.springframework.stereotype.Component;

@Component
public class Dependency {
    public String getMessage() {
        return "Dependency: I am still running :)";
    }
}
