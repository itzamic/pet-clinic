package itzamic.springframework.petclinic.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public class Person extends BaseEntity {
    @Column(name = "first_name")
    private String firstname;
    @Column(name = "last_name")
    private String lastname;
}
