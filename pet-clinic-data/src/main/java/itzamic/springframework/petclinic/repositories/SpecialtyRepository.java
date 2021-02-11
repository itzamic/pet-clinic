package itzamic.springframework.petclinic.repositories;

import itzamic.springframework.petclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
