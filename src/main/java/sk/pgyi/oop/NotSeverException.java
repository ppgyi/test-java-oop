package sk.pgyi.oop;

// Vytvorena vlastna vynimka --- jednoducha len extends Exceptions + pridame
// override methods prve 4

public class NotSeverException extends Exception{
    public NotSeverException() {
        super();
    }

    public NotSeverException(String message) {
        super(message);
    }

    public NotSeverException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotSeverException(Throwable cause) {
        super(cause);
    }
}
