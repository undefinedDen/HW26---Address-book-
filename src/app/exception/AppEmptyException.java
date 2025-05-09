package app.exception;

public class AppEmptyException extends NullPointerException {
    public AppEmptyException(String message) {
        super(message);
    }
}
