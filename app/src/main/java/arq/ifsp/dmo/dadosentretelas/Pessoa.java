package arq.ifsp.dmo.dadosentretelas;

import java.io.Serializable;

public class Pessoa implements Serializable {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade(){
        return idade;
    }
}
