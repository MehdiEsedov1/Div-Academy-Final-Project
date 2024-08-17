package smr.shop.cart.service.dto.response;

import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;
import java.util.UUID;

@Value
@Builder
public class CartItemResponse {
    UUID id;

    Long productId;

    String name;

    Integer quantity;

    Double unitPrice;

    Double totalPrice;

    BigDecimal discountPrice;

    String attributeName;

    String thumbnail;

}
