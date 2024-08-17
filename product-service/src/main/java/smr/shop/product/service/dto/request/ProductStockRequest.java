package smr.shop.product.service.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class ProductStockRequest {

    @NotBlank
    String attributeName;

    @NotNull
    Integer quantity;



}
