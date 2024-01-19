package br.com.laurawebster.gestao_vagas.modules.candidate.controllers;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import java.util.UUID;

@Data
public class CandidateEntity {

    private UUID id;
    private String name;

    @NotBlank()
    @Pattern(regexp = "\\S+", message = "O campo [username] não deve conter espaços")
    private String username;
    @Email(message = "O campo [e-mail] deve conter um e-mail válido")
    private String email;
    @Length(min = 10, max = 100, message = "A senha deve conter entre 10 e 100 caracteres")
    private String password;
    private String description;
    private String curriculum;


}
