package com.br.petshop.domain.contato;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Contato {
    private String contato1;
    private String contato2;
    private String contato3;
    private String email;
    private String redesocial1;
    private String redesocial2;
    private String redesocial3;

    public Contato(DadosCadastroContato dadosCadastroContato) {
        this.contato1 = dadosCadastroContato.contato1();
        this.contato2 = dadosCadastroContato.contato2();
        this.contato3 = dadosCadastroContato.contato3();
        this.email = dadosCadastroContato.email();
        this.redesocial1 = dadosCadastroContato.redesocial1();
        this.redesocial2 = dadosCadastroContato.redesocial2();
        this.redesocial3 = dadosCadastroContato.redesocial3();

    }
}


