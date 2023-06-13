package br.com.terceiroperiodo.controller;

import br.com.terceiroperiodo.model.Cidade;
import br.com.terceiroperiodo.model.Estado;
import br.com.terceiroperiodo.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cidade")
public class CidadeController {

    @Autowired
    CidadeService cidadeService;

    @PostMapping()
    public ResponseEntity<Cidade> salvarCidade(@RequestBody Cidade cidade){

        Cidade response = cidadeService.salvar(cidade);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/all", produces = "application/json")
    public ResponseEntity<List<Cidade>> buscarTodos(){

        List<Cidade> response = cidadeService.buscarTodos();
        return ResponseEntity.ok(response);
    }

}
