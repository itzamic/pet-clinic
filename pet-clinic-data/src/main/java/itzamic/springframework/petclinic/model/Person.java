package itzamic.springframework.petclinic.model;

import lombok.Data;

@Data
public class Person extends BaseEntity {
    private String firstname;
    private String lastname;
}
