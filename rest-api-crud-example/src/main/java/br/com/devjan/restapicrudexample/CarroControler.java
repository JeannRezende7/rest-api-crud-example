package br.com.devjan.restapicrudexample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class CarroControler {
    
    @Autowired
    CarroRepository repository;

    @GetMapping ("/carro")
    public List <Carro> getAllCarros (){
        return repository.findAll();
    }
    @PostMapping("/carro")
    public Carro saveCarro (@RequestBody Carro carro){
        return repository.save(carro);
    }
    @GetMapping("/carro{id}")
    public Carro getCarroById(@PathVariable Long id){
        return repository.getById(id);
    }

    @DeleteMapping("/carro{id}")
    public Carro deketeCarroById(@PathVariable Long id){
        return repository.getById(id);
    }


}
