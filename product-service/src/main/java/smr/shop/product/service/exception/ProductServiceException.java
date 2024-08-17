package smr.shop.product.service.exception;

import org.springframework.http.HttpStatus;
import smr.shop.libs.common.exception.GlobalException;

public class ProductServiceException extends GlobalException {

    public ProductServiceException(String message, HttpStatus status) {
        super(message, status);
    }

    public ProductServiceException(String message, HttpStatus status, Throwable cause) {
        super(message, status, cause);
    }
}
