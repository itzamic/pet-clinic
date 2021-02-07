package itzamic.springframework.petclinic.services;

import itzamic.springframework.petclinic.model.Vet;

import java.util.Set;

public interface VetInterface {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
