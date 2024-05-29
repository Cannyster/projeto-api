package projeto_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projeto_api.model.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, String> {
}
