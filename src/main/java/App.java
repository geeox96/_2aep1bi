import java.util.ArrayList;

/**
 *
 * @author Geovanio Carnelosso
 * @author Pedro Azevedo
 *
 */

public class App {
    public static void main(String[] args) {

        Aluno aluno0 = new Aluno();
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();
        Aluno aluno4 = new Aluno();
        Aluno aluno5 = new Aluno();
        Aluno aluno6 = new Aluno();
        Aluno aluno7 = new Aluno();
        Aluno aluno8 = new Aluno();
        Aluno aluno9 = new Aluno();

        aluno0.Aluno(47896547, "Cleide");
        aluno1.Aluno(17029772, "Juaum");
        aluno2.Aluno(96358910, "Cleber");
        aluno3.Aluno(70146247, "Larissa");
        aluno4.Aluno(62178520, "Maria");
        aluno5.Aluno(41255662, "Douglas");
        aluno6.Aluno(85205965, "Jailson");
        aluno7.Aluno(79584056, "Lucas");
        aluno8.Aluno(98985334, "Marcos");
        aluno9.Aluno(47894169, "Diogo");

        Disciplina disciplina2 = new Disciplina();
        Disciplina disciplina1 = new Disciplina();

        Avaliacao avaliacao1= new Avaliacao();
        Avaliacao avaliacao2= new Avaliacao();
        avaliacao1.Avaliacao(aluno0, disciplina1, 7.5F);
        avaliacao2.Avaliacao(aluno0, disciplina2, 2.8F);

        System.out.println(avaliacao1.getNota());
        System.out.println(avaliacao2.getNota());



    }
}