package com.br.petshop.controller;

import com.br.petshop.domain.cliente.DadosCadastroCliente;
import com.br.petshop.domain.cliente.DadosAtualizacaoCliente;
import com.br.petshop.domain.cliente.Cliente;
import com.br.petshop.domain.cliente.ClienteRepository;
import com.br.petshop.domain.cliente.DadosListaCliente;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroCliente dadosCadastroCliente){
        clienteRepository.save(new Cliente(dadosCadastroCliente));
    }

    @PostMapping("/post")
        public void cadastro(@RequestBody String string){
            System.out.println(string);
        }


    @GetMapping("/listaClientes")
    public Page<DadosListaCliente> listarClientes(@PageableDefault(size = 10, page = 0, sort = {"nome"}) Pageable paginacao){
        return clienteRepository.findAllByclientativoTrue(paginacao).map(DadosListaCliente::new);
    }

    @GetMapping("/{id}")
    public ResponseEntity detalhar(@PathVariable Long id){
        var cliente = clienteRepository.getReferenceById(id);
        return ResponseEntity.ok(new DadosListaCliente(cliente));
    }

    @PutMapping
    @Transactional
    public void atualizarDadosCliente(@RequestBody @Valid DadosAtualizacaoCliente dadosAtualizacaoCliente){
        System.out.println("Requisição put");
        var cliente = clienteRepository.getReferenceById(dadosAtualizacaoCliente.id());
        cliente.atualizarInformacoesCliente(dadosAtualizacaoCliente);
    }


    @DeleteMapping("/teste")
    public void deletar(){
        System.out.println("teste delete");
    }

    @DeleteMapping("/delete/{id}")
    @Transactional
    public void deletarDadosCliente(@PathVariable Long id){
        //clienteRepository.deleteById(id);
        var cliente = clienteRepository.getReferenceById(id);
        cliente.excluir();
    }

}
