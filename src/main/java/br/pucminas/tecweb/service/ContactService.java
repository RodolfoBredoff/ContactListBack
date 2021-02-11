package br.pucminas.tecweb.service;

import br.pucminas.tecweb.DTO.ContactDTO;
import br.pucminas.tecweb.model.Contact;
import br.pucminas.tecweb.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
public class ContactService {
    @Autowired
    private ContactRepository repository;


    public Flux<ContactDTO> loadNext(Integer numberOfNewUsers) {

        String baseURL = "https://randomuser.me/api/?inc=name,email,gender,picture,phone,nat,registered&noinfo&results=" + numberOfNewUsers;
        Flux<ContactDTO> contacts = WebClient.create()
                                    .get()
                                    .uri(baseURL)
                                    .retrieve()
                                    .bodyToFlux(ContactDTO.class);

        return contacts;

    }

    public List<Contact> saveAll(List<Contact> contacts) {
        return repository.saveAll(contacts);
    }

    public Contact save(Contact newContact) {
        return repository.save(newContact);
    }

    public List<Contact> findAll(){
        return repository.findAll(Sort.by(Sort.Direction.ASC, "favorited"));
    }

    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
