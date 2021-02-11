package itzamic.springframework.petclinic.repositories;

import itzamic.springframework.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastname(String lastname);
}
