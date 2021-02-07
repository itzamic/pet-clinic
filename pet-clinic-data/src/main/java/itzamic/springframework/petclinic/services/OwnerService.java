package itzamic.springframework.petclinic.services;

import itzamic.springframework.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastname);
}
