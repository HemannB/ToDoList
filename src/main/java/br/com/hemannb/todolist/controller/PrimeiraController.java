package br.com.hemannb.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
//http://localhost:8080/----
public class PrimeiraController {
    
    /**
     * Método de acesso HTTP
     * GET - Buscar info
     * POST - Adicionar dado/info
     * PUT - Altera dado/info
     * DELETE - Remove dado/info
     * PATCH - Altera parte de um dado/info
     */
    // Método de uma classe

    @GetMapping("/primeiroMetodo")
    public String primeiraMensagem(){
        return "Funcionou";
    }

}
