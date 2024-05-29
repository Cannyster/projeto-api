package projeto_api.model;

import jakarta.persistence.*;

@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 30, nullable = false)
    private String nome;

    @Column(length = 50, nullable = false)
    private String sobrenome;

    @Column(length = 30)
    private String email;

    @Column(length = 11)
    private String cpf;

    public Pessoa() {
    }

    public Pessoa(String nome, String sobrenome, String email, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.cpf = cpf;
    }

    public Long getId() { return id; }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getSobrenome() { return sobrenome; }

    public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email = email; }

    public String getCpf() { return cpf; }

    public void setCpf(String cpf) { this.cpf = cpf; }




}
