package smr.shop.product.service.dto.response;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ProductShopResponse {

    String shopSlug;

    String shopName;

    String shopThumbNail;
}