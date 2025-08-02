package com.configurator.system_model_service.repository;


import com.configurator.system_model_service.model.SystemModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SystemModelRepository extends JpaRepository<SystemModel, Long> {
}