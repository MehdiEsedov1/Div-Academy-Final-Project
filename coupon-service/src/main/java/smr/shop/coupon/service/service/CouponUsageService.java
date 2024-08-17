package smr.shop.coupon.service.service;

import smr.shop.libs.common.dto.message.UseCouponMessageModel;

import java.util.UUID;

public interface CouponUsageService {


    void createCouponUsage(UseCouponMessageModel useCouponMessageModel);

    Boolean getCouponUsage(UUID couponId, UUID userId);
}
