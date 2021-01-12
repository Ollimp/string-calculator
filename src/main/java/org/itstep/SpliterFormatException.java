package org.itstep;

public class SpliterFormatException extends Exception {

    public SpliterFormatException() {
    }

    public SpliterFormatException(String message) {
        super(message);
    }

    public SpliterFormatException(String message, Throwable cause) {
        super(message, cause);
    }

    public SpliterFormatException(Throwable cause) {
        super(cause);
    }

    public SpliterFormatException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
