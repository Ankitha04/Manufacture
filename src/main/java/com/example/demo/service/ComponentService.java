package com.example.demo.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Component;
import com.example.demo.repository.ComponentRepository;

@Service
public class ComponentService {

	@Autowired
	ComponentRepository componentRepository;

	public Iterable<Component> getComponentDetail() {
		return componentRepository.findAll();
	}

	public Optional<Component> getComponentDetails(Integer componentId) {
		return componentRepository.findById(componentId);
	}

	public void saveComponent(@Valid Component component) {
		componentRepository.save(component);
	}

	public void deleteComponent(Integer componentId) {
		componentRepository.deleteById(componentId);
	}

	public Component updateComponent(Component component) {
		return componentRepository.save(component);
	}
}
