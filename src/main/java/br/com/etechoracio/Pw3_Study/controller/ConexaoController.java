package br.com.etechoracio.Pw3_Study.controller;

import br.com.etechoracio.Pw3_Study.Service.ConexaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(" /conexao")
@CrossOrigin (origins = "*")
public class ConexaoController {

    @Autowired
    private ConexaoService service;

    public Long contatoConexao(){
        return service.contarConexoes();
    }
}
