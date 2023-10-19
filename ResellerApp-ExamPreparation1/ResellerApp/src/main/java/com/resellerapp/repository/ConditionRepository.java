package com.resellerapp.repository;

import com.resellerapp.model.entity.ConditionEntity;
import com.resellerapp.model.enums.ConditionName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConditionRepository extends JpaRepository<ConditionEntity, Long> {
    ConditionEntity findByName(ConditionName condition);
}
