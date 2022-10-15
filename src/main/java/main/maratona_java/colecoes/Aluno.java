package main.maratona_java.colecoes;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Aluno implements Comparable<Aluno>{

    private Long id;
    private String nome;
    private String turma;

    @Override
    public int compareTo(Aluno aluno) {
        return this.nome.compareTo(aluno.getNome());
    }
}
