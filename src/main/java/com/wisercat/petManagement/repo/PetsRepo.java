package com.wisercat.petManagement.repo;

import com.wisercat.petManagement.models.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetsRepo extends JpaRepository<Pet,Long> {
}
