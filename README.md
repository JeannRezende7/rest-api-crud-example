# rest-api-crud-example
Crud mais simplificado possivel.
- Entity      --  Carro.java
- Repository  --  CarroRepository.java
- Controller  --  CarroController.java
# Dependencias

H2Database <br />
Spring Boot DevTools <br />
Lombok <br />
Spring Data JPA <br />
Spring Web <br />

# Anotações
 
 Para o ID a ser salvo no banco.
 ```
 @Id 
 @GeneratedValue(strategy = GenerationType.AUTO) 
 Long id; 
 ``` 
 No Controler usar ```@RestController```
 
```
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
   ```
