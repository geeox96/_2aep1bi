/**
 *
 * @author Geovanio Carnelosso
 * @author Pedro Azevedo
 *
 */

public class App {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.Aluno(17029772, "juaum");
        System.out.println(aluno1.getRA());

        Disciplina disciplina1 = new Disciplina();
        disciplina1.Disciplina("Matematica");
        System.out.println(disciplina1.getNome());


    }
}