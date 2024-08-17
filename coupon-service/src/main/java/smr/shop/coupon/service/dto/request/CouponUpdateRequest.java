package smr.shop.coupon.service.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Value
public class CouponUpdateRequest {

    @NotBlank
    String code;

    @NotBlank
    String details;

    BigDecimal amount;

    Short percentage;

    @NotNull
    BigDecimal maxDiscountPrice;

    @NotNull
    ZonedDateTime endDate;

}
