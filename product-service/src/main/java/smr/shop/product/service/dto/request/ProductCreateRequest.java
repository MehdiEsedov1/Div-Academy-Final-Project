package smr.shop.product.service.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.util.List;

@Value
public class ProductCreateRequest {
    @NotBlank
    Long categoryId;

    @NotBlank
    Long brandId;

    @NotBlank
    String name;

    @NotBlank
    String slug;

    @NotBlank
    String description;

    @NotBlank
    String thumbnail;

    @NotBlank
    List<String> imageIds;

    @NotBlank
    String tags;

    @NotNull
    Double price;

    @NotNull
    Double minPrice;

    @NotNull
    Double maxPrice;

    @NotNull
    Double shippingPrice;

    @NotBlank
    ProductStockRequest stock;

}
