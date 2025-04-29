package dev.java.Cadastrodeninjas;

import jakarta.persistence.*;

@Entity // TRANSFORMA UMA CLASSE EM UMA ENTIDADE DO BANCO DE DADOS s
@Table (name = "tb_cadastro")
public class NinjaModel {


    @Id // ID E PARA MOSTRAR DA TABELA DQU O LONG ABAIXO E UM ID
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    long id;
    String nome ;
    String email;
    int idade;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
