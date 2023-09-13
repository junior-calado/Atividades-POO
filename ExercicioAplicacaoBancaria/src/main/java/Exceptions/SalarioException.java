package Exceptions;

public class SalarioException extends RuntimeException {

    private static final long serialVersionUID = 1l;

    public SalarioException(String msg) {
        super(msg);
    }
}
