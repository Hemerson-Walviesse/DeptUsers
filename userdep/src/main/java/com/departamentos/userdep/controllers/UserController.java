package com.departamentos.userdep.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.departamentos.userdep.entities.Usuarios;
import com.departamentos.userdep.repository.userRepository;

@RestController
@RequestMapping(value = "/usuarios")
public class UserController {
    
    @Autowired
    private userRepository repository;
    
    @GetMapping
    public List<Usuarios> findAll(){
       List<Usuarios> result = repository.findAll();
        return result;
    }
    
    @GetMapping(value = "/{id}")
    public Usuarios findById(@PathVariable Long id){
       Usuarios result = repository.findById(id).get();
        return result;
    }

    
    
    @PostMapping
    public Usuarios insertUsuarios(@RequestBody Usuarios usuarios){
       
        Usuarios result = repository.save(usuarios);
        System.out.println("O json que chega no log e " + usuarios);
        return result;
    }

     @PutMapping(value = "/{id}")
    public ResponseEntity<Usuarios> update(@PathVariable("id") Long id, @RequestBody Usuarios usuarios) {
        return repository.findById(id)
            .map(record -> {
                record.setName(usuarios.getName());
                record.setEmail(usuarios.getEmail());
                Usuarios update = repository.save(record);
                return ResponseEntity.ok().body(update);
            }).orElse(ResponseEntity.notFound().build());
    }

}
