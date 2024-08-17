package smr.shop.flash.service.exception;

import org.springframework.http.HttpStatus;
import smr.shop.libs.common.exception.GlobalException;

public class FlashDealProductException extends GlobalException {
    public FlashDealProductException(String message, HttpStatus status) {
        super(message, status);
    }

    public FlashDealProductException(String message, HttpStatus status, Throwable cause) {
        super(message, status, cause);
    }
}
