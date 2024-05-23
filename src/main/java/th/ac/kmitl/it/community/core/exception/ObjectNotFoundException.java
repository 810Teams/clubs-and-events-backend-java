package th.ac.kmitl.it.community.core.exception;

public class ObjectNotFoundException extends RuntimeException {
    public ObjectNotFoundException() {
        super("Object not found.");
    }

    public ObjectNotFoundException(String message) {
        super(message);
    }

    public ObjectNotFoundException(int id) {
        super(String.format("Object with ID %d not found.", id));
    }

    public ObjectNotFoundException(String objectName, int id) {
        super(String.format("Object '%s' with ID %d not found.", objectName, id));
    }
}
