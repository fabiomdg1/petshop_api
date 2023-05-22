package com.br.petshop.domain.endereco;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroEndereco(

        @NotBlank
        String logradouro,

        @NotBlank
        String bairro,

        @Pattern(regexp = "\\d{8}")
        String cep,

        @NotBlank
        String cidade,

        String uf,
        String complemento,
        String numero) {
}
