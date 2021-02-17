package itzamic.springframework.petclinic.services;

import itzamic.springframework.petclinic.model.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastname);

    List<Owner> findAllByLastnameLike(String lastname);
}
