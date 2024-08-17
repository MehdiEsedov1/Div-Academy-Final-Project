package smr.shop.libs.common.dto.message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import smr.shop.libs.common.messaging.BaseMessageModel;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CouponMessageMode implements BaseMessageModel {


    private UUID id;

    private Long shopId;

    private String code;

    private String details;

//    private CouponDiscountType discountType;

    private BigDecimal amount;

    private Short percentage;

    private BigDecimal maxDiscountPrice;

    private ZonedDateTime expirationTime;

}
