package com.wisercat.petManagement.controllers;

import com.wisercat.petManagement.models.Pet;
import com.wisercat.petManagement.services.PetService;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController("/api/pet")
public class PetController {
    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping
    public List<Pet> getAll() {
        return petService.getAllPets();
    }

    @PostMapping("/create-new")
    public Pet addNewPet(@RequestBody Pet pet) {
        return petService.create(pet);
    }

    @PutMapping
    public Pet editPet(@RequestBody Pet pet) {
        return petService.editPet(pet);
    }

    @DeleteMapping
    public void deletePet(@RequestBody Pet pet) {
        petService.deletePet(pet);
    }
}
