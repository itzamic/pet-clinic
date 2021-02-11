package itzamic.springframework.petclinic.repositories;

import itzamic.springframework.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
