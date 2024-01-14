package com.departamentos.userdep.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.departamentos.userdep.entities.Departamentos;
import com.departamentos.userdep.repository.depRepository;

@RestController
@RequestMapping(value = "/departamentos")
public class DepController {
    
    @Autowired
    private depRepository  repository;

    @GetMapping
    public List<Departamentos> findAll(){
        List<Departamentos> result = repository.findAll();
        return result;
    }

    @GetMapping(value = "/{id}")
    public Departamentos findById(@PathVariable Long id){
       Departamentos result = repository.findById(id).get();
        return result;
    }

    
    
    @PostMapping
    public Departamentos inser(@RequestBody Departamentos departamentos){
       Departamentos result = repository.save(departamentos);
       System.out.println("O json que chega no log e " + departamentos);
        return result;
    }

}
