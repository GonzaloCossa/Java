package exceptions;

/**
 *
 * @author Gonzalo Agustín Cossa
 */
public class TareaInvalidaException extends RuntimeException {
    public TareaInvalidaException(String message) {
        super(message);
    }
}
