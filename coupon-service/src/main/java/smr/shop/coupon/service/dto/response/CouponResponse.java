package smr.shop.coupon.service.dto.response;

import lombok.Builder;
import lombok.Value;
import smr.shop.libs.common.model.valueobject.CouponDiscountType;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.UUID;

@Value
@Builder
public class CouponResponse {

    UUID id;
    String code;
    CouponDiscountType type;
    String details;
    Long shopId;
    BigDecimal amount;
    Short percentage;
    BigDecimal maxDiscountPrice;
    ZonedDateTime endDate;

}
