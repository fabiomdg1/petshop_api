package com.br.petshop.domain.cliente;

import com.br.petshop.domain.contato.DadosCadastroContato;
import com.br.petshop.domain.endereco.DadosCadastroEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroCliente(
        @NotBlank
        String nome,
        Sexo sexo,
        String aniversario,

        @NotNull @Valid
        DadosCadastroEndereco dadosCadastroEndereco,

        @NotNull @Valid
        DadosCadastroContato dadosCadastroContato) {
}
