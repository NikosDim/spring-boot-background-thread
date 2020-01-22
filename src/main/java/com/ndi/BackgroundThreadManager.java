package com.ndi;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@Component
public class BackgroundThreadManager {
    private ExecutorService executorService;
    private Future<?> submittedThread;


    @PostConstruct
    private void runThread() {
        BackgroundThread backgroundThread = new BackgroundThread();

        executorService = Executors.newSingleThreadExecutor();
        submittedThread = executorService.submit(backgroundThread);
    }
}
