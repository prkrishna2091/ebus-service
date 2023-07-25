package com.rktravles.ebusservice.repo;

import com.rktravles.ebusservice.entity.BusEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<BusEntity,String> {
}
