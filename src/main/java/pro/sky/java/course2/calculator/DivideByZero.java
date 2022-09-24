package pro.sky.java.course2.calculator;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class DivideByZero extends IllegalArgumentException {
    public DivideByZero() {
        super("Деление на нуль запрещено");
    }
}
