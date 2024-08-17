package smr.shop.flash.service.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Value;

@Value
public class FlashDealProductUpdateRequest {

    @NotBlank
    Long flashDealEntityId;

    @NotBlank
    Long productId;
}
