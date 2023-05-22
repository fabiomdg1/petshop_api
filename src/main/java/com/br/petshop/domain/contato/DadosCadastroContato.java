package com.br.petshop.domain.contato;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroContato(
        @NotBlank
        String contato1,
        String contato2,
        String contato3,
        String email,
        String redesocial1,
        String redesocial2,
        String redesocial3) {
}
