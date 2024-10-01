package br.com.etechoracio.Pw3_Study.Service;

import br.com.etechoracio.Pw3_Study.repository.ConexaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConexaoService {

    @Autowired
    ConexaoRepository repository;

    public Long contarConexoes(){
        return repository.count();
    }
}
