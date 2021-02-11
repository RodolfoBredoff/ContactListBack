package br.pucminas.tecweb.DTO;

import br.pucminas.tecweb.model.Contact;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactDTO {

    private List<Contact> results;


}
