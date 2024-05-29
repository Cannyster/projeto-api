package projeto_api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import projeto_api.model.Pessoa;
import projeto_api.repository.PessoaRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "api/pessoa")
public class PessoaController {

    @Autowired
    PessoaRepository pessoaRepository;

    @GetMapping(value = "/")
    public List<Pessoa> getAll(){
       return pessoaRepository.findAll();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<Optional<Pessoa>> getById(@PathVariable(value = "id")  Long id){
        Optional<Pessoa> pessoa = pessoaRepository.findById(id);
        return ResponseEntity.ok().body(pessoa);
    }
}
