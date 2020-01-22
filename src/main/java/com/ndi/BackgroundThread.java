package com.ndi;

public class BackgroundThread implements Runnable {

    //TODO I want to be able to autowire objects here...

    @Override
    public void run() {
        while(true) {
            System.out.println("I am still running :)");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
