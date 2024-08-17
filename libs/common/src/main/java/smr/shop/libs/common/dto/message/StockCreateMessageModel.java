package smr.shop.libs.common.dto.message;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import smr.shop.libs.common.messaging.BaseMessageModel;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class StockCreateMessageModel implements BaseMessageModel {

    String attributeName;

    Integer quantity;

}
