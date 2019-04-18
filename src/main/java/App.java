import java.util.ArrayList;

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
        System.out.println(aluno1.getNome());

        Disciplina diciplina1 = new Disciplina();
        diciplina1.Disciplina("Matematica");
        System.out.println(diciplina1.getNome());




    }
}