package projeto_api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projeto_api.model.Endereco;
import projeto_api.repository.EnderecoRepository;


import java.util.List;

@RestController
@RequestMapping(value = "api/endereco")
public class EnderecoController {


    @Autowired
    EnderecoRepository enderecoRepository;

    @GetMapping(value = "/")
    public List<Endereco> getPessoa(){
        return enderecoRepository.findAll();
    }

}
