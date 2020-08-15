package cotn.expense.tracker.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author kaustavbasu
 * @Date 8/8/20
 * @Time 9:14 PM
 */
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class WebException extends RuntimeException {
    public WebException(String message) {
        super(message);
    }
}
