package itzamic.springframework.petclinic.services.jpa;

import itzamic.springframework.petclinic.model.Owner;
import itzamic.springframework.petclinic.repositories.OwnerRepository;
import itzamic.springframework.petclinic.repositories.PetRepository;
import itzamic.springframework.petclinic.repositories.PetTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OwnerJPAServiceTest {
    public static final String SMITH = "Smith";
    @Mock
    OwnerRepository ownerRepository;
    @Mock PetRepository petRepository;
    @Mock PetTypeRepository petTypeRepository;

    @InjectMocks
    OwnerJPAService service;

    Owner returnedOwner;

    @BeforeEach
    void setUp() {
        returnedOwner = Owner.builder().build();
        returnedOwner.setId(1L);
        returnedOwner.setLastname(SMITH);
    }

    @Test
    void findAll() {
        Set<Owner> returnedOwners = new HashSet<>();
        Owner owner = new Owner();
        owner.setId(2L);
        Owner owner1 = new Owner();
        owner1.setId(3L);
        returnedOwners.add(owner);
        returnedOwners.add(owner1);

        when(ownerRepository.findAll()).thenReturn(returnedOwners);
        Set<Owner> owners = service.findAll();
        assertNotNull(owners);
        assertEquals(2, owners.size());
    }

    @Test
    void findById() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.of(returnedOwner));
        Owner owner = service.findById(1L);
        assertNotNull(owner);
    }

    @Test
    void findById_NotFound() {
        when(ownerRepository.findById(anyLong())).thenReturn(Optional.empty());
        Owner owner = service.findById(1L);
        assertNull(owner);
    }

    @Test
    void save() {
        Owner ownerToSave = Owner.builder().build();
        ownerToSave.setId(1L);
        when(ownerRepository.save(any())).thenReturn(returnedOwner);
        Owner savedOwner = service.save(ownerToSave);
        assertNotNull(savedOwner);
        verify(ownerRepository).save(any());
    }

    @Test
    void delete() {
        service.delete(returnedOwner);
        verify(ownerRepository).delete(any());
    }

    @Test
    void deleteById() {
        service.deleteById(anyLong());
        verify(ownerRepository).deleteById(any());
    }

    @Test
    void findByLastName() {
        when(ownerRepository.findByLastname(any())).thenReturn(returnedOwner);
        Owner smith = service.findByLastName(SMITH);
        assertEquals(SMITH, smith.getLastname());
        verify(ownerRepository).findByLastname(any());
    }
}