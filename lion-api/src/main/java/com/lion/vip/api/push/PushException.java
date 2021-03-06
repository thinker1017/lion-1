package com.lion.vip.api.push;

/**
 * 推送异常类
 */
public class PushException extends RuntimeException {
    public PushException(String message) {
        super(message);
    }

    public PushException(Throwable cause) {
        super(cause);
    }

    public PushException(String message, Throwable cause) {
        super(message, cause);
    }
}
