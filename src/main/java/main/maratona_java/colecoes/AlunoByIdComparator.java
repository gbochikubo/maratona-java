package main.maratona_java.colecoes;

import java.util.Comparator;

public class AlunoByIdComparator implements Comparator<Aluno> {
    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        return aluno1.getId().compareTo(aluno2.getId());
    }
}
