package app.exception;

import java.util.InputMismatchException;

public class AppUserInputException extends InputMismatchException {
    public AppUserInputException(String message) {
        super(message);
    }
}
