package com.configurator.system_model_service.service;

import com.configurator.system_model_service.model.SystemModel;
import com.configurator.system_model_service.repository.SystemModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SystemModelService {

    @Autowired
    private SystemModelRepository repository;

    public List<SystemModel> getAllModels() {
        return repository.findAll();
    }

    public Optional<SystemModel> getModelById(Long id) {
        return repository.findById(id);
    }

    public SystemModel createModel(SystemModel model) {
        return repository.save(model);
    }

    public SystemModel updateModel(Long id, SystemModel model) {
        return repository.findById(id).map(existing -> {
            existing.setName(model.getName());
            existing.setType(model.getType());
            return repository.save(existing);
        }).orElse(null);
    }

    public void deleteModel(Long id) {
        repository.deleteById(id);
    }
}
