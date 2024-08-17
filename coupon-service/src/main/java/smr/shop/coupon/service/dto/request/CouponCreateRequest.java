package smr.shop.coupon.service.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;
import smr.shop.libs.common.model.valueobject.CouponDiscountType;

import java.math.BigDecimal;
import java.time.ZonedDateTime;

@Value
public class CouponCreateRequest {

    @NotBlank
    String code;

    @NotBlank
    String details;

    @NotNull
    CouponDiscountType type;

    BigDecimal amount;

    Short percentage;

    @NotNull
    BigDecimal maxDiscountPrice;

    @NotNull
    ZonedDateTime endDate;

}
