package com.configurator.system_model_service.controller;

import com.configurator.system_model_service.model.SystemModel;
import com.configurator.system_model_service.service.SystemModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/models")
public class SystemModelController {

    @Autowired
    private SystemModelService service;

    @GetMapping
    public List<SystemModel> getAll() {
        return service.getAllModels();
    }

    @GetMapping("/{id}")
    public SystemModel getById(@PathVariable Long id) {
        return service.getModelById(id).orElse(null);
    }

    @PostMapping
    public SystemModel create(@RequestBody SystemModel model) {
        return service.createModel(model);
    }

    @PutMapping("/{id}")
    public SystemModel update(@PathVariable Long id, @RequestBody SystemModel model) {
        return service.updateModel(id, model);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteModel(id);
    }
}