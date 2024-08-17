package smr.shop.product.service.dto.response;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class ProductDiscountResponse {

    UUID discountId;

    Double discountPrice;
}
