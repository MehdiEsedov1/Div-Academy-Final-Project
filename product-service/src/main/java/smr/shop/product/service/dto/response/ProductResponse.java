package smr.shop.product.service.dto.response;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class ProductResponse {

    Long id;

    ProductShopResponse shopDetail;

    ProductCategoryResponse category;

    ProductBrandResponse brand;

    ProductDiscountResponse discount;

    String productName;

    String productSlug;

    String productDescription;

    String productThumbnail;

    List<String> images;

    List<String> tags;

    Double price;

    Double shippingPrice;

    Float rating;

}
