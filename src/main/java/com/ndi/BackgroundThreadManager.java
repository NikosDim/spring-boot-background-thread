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

    private BackgroundThread backgroundThread;

    public BackgroundThreadManager(BackgroundThread backgroundThread) {
        this.backgroundThread = backgroundThread;
    }

    @PostConstruct
    private void runThread() {
        executorService = Executors.newSingleThreadExecutor();
        submittedThread = executorService.submit(backgroundThread);
    }
}
