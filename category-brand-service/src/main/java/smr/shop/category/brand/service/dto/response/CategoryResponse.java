package smr.shop.category.brand.service.dto.response;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class CategoryResponse {

    Long id;

    String name;

    String slug;

    String description;

    List<CategoryResponse> children;
}
