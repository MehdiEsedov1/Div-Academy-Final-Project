package smr.shop.flash.service.service;

import smr.shop.flash.service.dto.request.FlashDealProductCreateRequest;
import smr.shop.flash.service.dto.request.FlashDealProductUpdateRequest;
import smr.shop.flash.service.dto.response.FlashDealProductResponse;
import smr.shop.flash.service.model.FlashDealProductEntity;

import java.util.List;
import java.util.UUID;

public interface FlashDealProductService {

    FlashDealProductResponse createFlashDealProduct(FlashDealProductCreateRequest request);

    FlashDealProductResponse updateFlashDealProduct(UUID flashDealProductId, FlashDealProductUpdateRequest request);

    void deleteFlashDealProduct(UUID flashDealProductId);

    FlashDealProductResponse getFlashDealProductById(UUID flashDealProductId);

    List<FlashDealProductResponse> getAllFlashDealProducts(Integer page);

    //
    FlashDealProductEntity findById(UUID flashDealProductId);
}
