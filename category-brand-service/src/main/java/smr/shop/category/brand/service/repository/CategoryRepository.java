package smr.shop.category.brand.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import smr.shop.category.brand.service.model.CategoryEntity;

import java.util.List;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

    List<CategoryEntity> findByParentIdIsNull();

    CategoryEntity findBySlug(String slug);

    List<CategoryEntity> findByParentIdIsNullAndIsDeletedFalse();
}
