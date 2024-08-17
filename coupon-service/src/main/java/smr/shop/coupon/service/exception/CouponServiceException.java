package smr.shop.coupon.service.exception;

import org.springframework.http.HttpStatus;
import smr.shop.libs.common.exception.GlobalException;

public class CouponServiceException extends GlobalException {

    public CouponServiceException(String message, HttpStatus status) {
        super(message, status);
    }

    public CouponServiceException(String message, HttpStatus status, Throwable cause) {
        super(message, status, cause);
    }

}
