package smr.shop.flash.service.dto.response;

import lombok.Builder;
import lombok.Value;

import java.util.UUID;

@Value
@Builder
public class FlashDealProductResponse {

    UUID id;

    Long flashDealEntityId;

    Long productId;
}
