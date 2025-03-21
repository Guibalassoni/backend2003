package main.java.com.seusite.petapi.service;

import com.seusite.petapi.model.Pet;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetService {

    private List<Pet> pets = new ArrayList<>();
    private Long nextId = 1L;

    public Pet cadastrar(Pet pet) {
        pet.setId(nextId++);
        pets.add(pet);
        return pet;
    }

    public List<Pet> listar() {
        return pets;
    }

    public void remover(Long id) {
        pets.removeIf(pet -> pet.getId().equals(id));
    }
}