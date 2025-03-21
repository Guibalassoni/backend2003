package main.java.com.seusite.petapi.controller;

import com.seusite.petapi.model.Pet;
import com.seusite.petapi.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private PetService petService;

    @PostMapping
    public Pet cadastrar(@RequestBody Pet pet) {
        return petService.cadastrar(pet);
    }

    @GetMapping
    public List<Pet> listar() {
        return petService.listar();
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id) {
        petService.remover(id);
    }
}