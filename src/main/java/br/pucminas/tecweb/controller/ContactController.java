package br.pucminas.tecweb.controller;

import br.pucminas.tecweb.DTO.ContactDTO;
import br.pucminas.tecweb.model.Contact;
import br.pucminas.tecweb.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/contact")
public class ContactController {

    @Autowired
    private ContactService service;

    @GetMapping(value = "buscar/{quantity}")
    public Flux<ContactDTO> loadNext(@PathVariable(name = "quantity") Integer quantity){
        return service.loadNext(quantity);
    }

    @GetMapping
    public  List<Contact> findAll(){
        return service.findAll();
    }

    @PostMapping("saveAll")
    public List<Contact> saveAll(@RequestBody List<Contact> contacts ){
        return service.saveAll(contacts);
    }

    @PostMapping
    public Contact save (@RequestBody Contact newContact){
        return service.save(newContact);
    }

    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable( name = "id") Integer id){
        service.delete(id);
        return id;
    }

}