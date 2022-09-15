package main.exceptions.handler;

import lombok.extern.slf4j.Slf4j;
import main.exceptions.AcessoNegadoException;
import main.exceptions.LoginInvalidoException;
import main.exceptions.SenhaInvalidaException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler({LoginInvalidoException.class})
    public ResponseEntity<String> exception (final LoginInvalidoException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler({SenhaInvalidaException.class})
    public ResponseEntity<String> exception (final SenhaInvalidaException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.UNAUTHORIZED);
    }

    @ExceptionHandler({AcessoNegadoException.class})
    public ResponseEntity<String> exception (final AcessoNegadoException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.FORBIDDEN);
    }
}
