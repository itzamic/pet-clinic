package itzamic.springframework.petclinic.repositories;

import itzamic.springframework.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
    Owner findByLastname(String lastname);
    List<Owner> findAllByLastnameLike(String lastname);
}
