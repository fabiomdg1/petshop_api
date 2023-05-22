package com.br.petshop.domain.cliente;

import com.br.petshop.domain.endereco.DadosCadastroEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoCliente(
        @NotNull
        Long id,
        String nome,
        String contato1,
        String contato2,
        String contato3,
        DadosCadastroEndereco dadosCadastroEndereco) {

}
