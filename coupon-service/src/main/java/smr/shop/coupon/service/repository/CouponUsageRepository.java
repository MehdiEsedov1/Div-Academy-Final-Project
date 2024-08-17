package smr.shop.coupon.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import smr.shop.coupon.service.model.CouponUsageEntity;

import java.util.Optional;
import java.util.UUID;

public interface CouponUsageRepository extends JpaRepository<CouponUsageEntity, UUID> {

    Optional<CouponUsageEntity> findCouponUsageByCouponId(UUID couponId);


    Optional<CouponUsageEntity> findByCouponIdAndUserId(UUID couponId, UUID userId);
}

