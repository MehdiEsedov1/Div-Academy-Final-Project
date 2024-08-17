package smr.shop.cart.service.dto.response;

import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Value
@Builder
public class CartResponse {
    UUID id;

    String couponCode;

    Double price;

    BigDecimal discountPrice;

    List<CartItemResponse> items;
}
