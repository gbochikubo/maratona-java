package main.exceptions;

public class AcessoNegadoException extends Exception {
    public AcessoNegadoException() {
        super("Acesso negado");
    }

    public AcessoNegadoException(String message) {
        super(message);
    }
}
