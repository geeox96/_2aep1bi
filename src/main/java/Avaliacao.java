/**
 *
 * @author Geovanio Carnelosso
 * @author Pedro Azevedo
 *
 */

public class Avaliacao {
    private float nota;
    private Disciplina disciplina;
    private Aluno aluno;

    public void Avaliacao(Aluno aluno, Disciplina disciplina, float nota){
        if(nota<0 || nota>10){
            throw new RuntimeException("so eh permitido notas de 0 a 10");
        }else{
            this.nota = nota;
        }
        this.aluno = aluno;
        this.disciplina = disciplina;

    }

    public float getNota(){
        return this.nota;
    }

    public Disciplina getDisciplina(){
        return this.disciplina;
    }

    public Aluno getAluno(){
        return this.aluno;
    }
}
