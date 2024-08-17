package smr.shop.category.brand.service.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Value;

@Value
public class CategoryUpdateRequest {

    @NotBlank
    @Size(min = 4)
    String name;

    @NotBlank
    @Size(min = 4)
    String slug;

    @NotBlank
    @Size(min = 50)
    String description;

    @NotBlank
    Long parentId;
}
