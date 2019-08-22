package br.com.sindeaux.houseofbooks.entity;

import javax.persistence.*;

@Entity
@Table(name = "TB_USUARIO")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="CO_USUARIO")
    private Long id;

    @Column(name="DS_NOME" ,nullable = false)
    private String nome;

    @Column(name = "DS_EMAIL",nullable = false, unique = true)
    private String email;

    @Column(name = "DS_SENHA",nullable = false)
    private String senha;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
