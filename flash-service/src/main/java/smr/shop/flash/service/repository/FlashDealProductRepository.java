package smr.shop.flash.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import smr.shop.flash.service.model.FlashDealProductEntity;

import java.util.UUID;

public interface FlashDealProductRepository extends JpaRepository<FlashDealProductEntity, UUID> {
}
