package com.wisercat.petManagement.services;

import com.wisercat.petManagement.models.Pet;
import com.wisercat.petManagement.repo.PetsRepo;

import java.util.List;

public class PetService {
    private final PetsRepo petsRepo;

    public PetService(PetsRepo petsRepo) {
        this.petsRepo = petsRepo;
    }

    public List<Pet> getAllPets(){
        return petsRepo.findAll();
    }
    public Pet create(Pet pet){
        //check field?
        return petsRepo.save(pet);
    }
    public void deletePet(Pet pet){
        petsRepo.delete(pet);
    }

    public Pet editPet(Pet pet) {

        return petsRepo.save(pet);
    }
}
