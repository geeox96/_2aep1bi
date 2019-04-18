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
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.nota = nota;
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
