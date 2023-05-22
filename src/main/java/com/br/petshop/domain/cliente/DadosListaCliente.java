package com.br.petshop.domain.cliente;

public record DadosListaCliente(Long id, String nome, String sexo, String contato1, String contato2, String contato3) {

    public DadosListaCliente(Cliente cliente){
        this(cliente.getId(),
                cliente.getNome(),
                cliente.getSexo().toString(),
                cliente.getContato().getContato1().toString(),
                cliente.getContato().getContato2().toString(),
                cliente.getContato().getContato3().toString());
    }

}
