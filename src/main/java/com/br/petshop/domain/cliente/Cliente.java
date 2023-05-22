package com.br.petshop.domain.cliente;

import com.br.petshop.domain.contato.Contato;
import com.br.petshop.domain.endereco.Endereco;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "clientes")
@Entity(name = "clientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cliente {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String nome;
        @Enumerated(EnumType.STRING)
        private Sexo sexo;

        private String aniversario;

        @Embedded
        private Endereco endereco;

       // @Embedded
        private Contato contato;

        private Boolean clientativo;

        public Cliente(DadosCadastroCliente dadosCadastroCliente) {
                this.nome = dadosCadastroCliente.nome();
                this.sexo = dadosCadastroCliente.sexo();
                this.aniversario = dadosCadastroCliente.aniversario();
                this.endereco = new Endereco(dadosCadastroCliente.dadosCadastroEndereco());
                this.contato = new Contato(dadosCadastroCliente.dadosCadastroContato());
                this.clientativo = true;
        }

    public Cliente(Cliente cliente) {
    }

    public void atualizarInformacoesCliente(DadosAtualizacaoCliente dadosAtualizacaoCliente){
            if(dadosAtualizacaoCliente.nome() != null){
                this.nome = dadosAtualizacaoCliente.nome();
            }
            if(dadosAtualizacaoCliente.contato1() != null){
                this.contato.setContato1(dadosAtualizacaoCliente.contato1());
            }
            if(dadosAtualizacaoCliente.contato2() != null){
                this.contato.setContato2(dadosAtualizacaoCliente.contato2());
            }
            if(dadosAtualizacaoCliente.contato3() != null){
                this.contato.setContato3(dadosAtualizacaoCliente.contato3());
            }
        }

        public void excluir(){
            this.clientativo = false;
        }
}
