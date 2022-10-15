package main.maratona_java.colecoes;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno(1L,"Guilherme Ochikubo","2-a"));
        alunos.add(new Aluno(5L,"Bruno Carvalho","2-a"));
        alunos.add(new Aluno(2L,"Ana","3-a"));
        alunos.add(new Aluno(4L,"Fulano de tal","1-c"));
        alunos.add(new Aluno(3L,"Raissa","2-b"));

        Collections.sort(alunos);

        System.out.println("Lista ordenada por nome");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
        System.out.println("-------------------------");

        alunos.sort(new AlunoByIdComparator());

        System.out.println("Lista ordenada por Id");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }
        System.out.println("-------------------------");

    }
}
