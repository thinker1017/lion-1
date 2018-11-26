/**
 * FileName: Service
 * Author:   Ren Xiaotian
 * Date:     2018/11/21 10:00
 */

package com.lion.vip.api.service;

import java.util.concurrent.CompletableFuture;

public interface Service {

    void start(Listener listener);
    void stop(Listener listener);
    CompletableFuture<Boolean> start();
    CompletableFuture<Boolean> stop();
    boolean syncStart();
    boolean syncStop();
    void init();
    boolean isRunning();

}