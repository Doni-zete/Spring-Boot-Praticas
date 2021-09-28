package com.digitalinovation.RestfullApplication.repository;

import com.digitalinovation.RestfullApplication.entity.SoldadoEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface SoldadoRepository extends  JpaRepository<SoldadoEntity, Long>{
}
