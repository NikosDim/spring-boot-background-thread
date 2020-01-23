package com.ndi;

import org.springframework.stereotype.Component;

@Component
public class BackgroundThread implements Runnable {

    private Dependency dependency;

    public BackgroundThread(Dependency dependency) {
        this.dependency = dependency;
    }

    @Override
    public void run() {
        while(true) {
            System.out.println(dependency.getMessage());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
