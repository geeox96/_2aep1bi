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

        aluno0.Aluno(1, "Cleide");
        aluno1.Aluno(2, "Juaum");
        aluno2.Aluno(3, "Cleber");
        aluno3.Aluno(4, "Larissa");
        aluno4.Aluno(5, "Maria");
        aluno5.Aluno(6, "Douglas");
        aluno6.Aluno(7, "Jailson");
        aluno7.Aluno(8, "Lucas");
        aluno8.Aluno(9, "Marcos");
        aluno9.Aluno(10, "Diogo");

        Disciplina disciplina1 = new Disciplina();
        Disciplina disciplina2 = new Disciplina();
        Disciplina disciplina3 = new Disciplina();
        Disciplina disciplina4 = new Disciplina();
        Disciplina disciplina5 = new Disciplina();


        Avaliacao avaliacao1= new Avaliacao();
        Avaliacao avaliacao2= new Avaliacao();
        Avaliacao avaliacao3= new Avaliacao();
        Avaliacao avaliacao4= new Avaliacao();
        Avaliacao avaliacao5= new Avaliacao();
        Avaliacao avaliacao6= new Avaliacao();
        Avaliacao avaliacao7= new Avaliacao();
        Avaliacao avaliacao8= new Avaliacao();
        Avaliacao avaliacao9= new Avaliacao();
        Avaliacao avaliacao10= new Avaliacao();
        Avaliacao avaliacao11= new Avaliacao();
        Avaliacao avaliacao12= new Avaliacao();
        Avaliacao avaliacao13= new Avaliacao();
        Avaliacao avaliacao14= new Avaliacao();
        Avaliacao avaliacao15= new Avaliacao();
        Avaliacao avaliacao16= new Avaliacao();
        Avaliacao avaliacao17= new Avaliacao();
        Avaliacao avaliacao18= new Avaliacao();
        Avaliacao avaliacao19= new Avaliacao();
        Avaliacao avaliacao20= new Avaliacao();
        Avaliacao avaliacao21= new Avaliacao();
        Avaliacao avaliacao22= new Avaliacao();
        Avaliacao avaliacao23= new Avaliacao();
        Avaliacao avaliacao24= new Avaliacao();
        Avaliacao avaliacao25= new Avaliacao();




        RepositoriosDeAvaliacoes  repositorioAvalicacoes = new RepositoriosDeAvaliacoes();

        disciplina1.Disciplina("Matematica");
        disciplina2.Disciplina("Geografia");
        disciplina3.Disciplina("Ciencias");
        disciplina4.Disciplina("Portugues");
        disciplina5.Disciplina("Historia");

        avaliacao1.Avaliacao(aluno1, disciplina1, 6.0f);
        avaliacao2.Avaliacao(aluno8, disciplina1, 9.0f);
        avaliacao3.Avaliacao(aluno6, disciplina1, 7.0f);
        avaliacao4.Avaliacao(aluno3, disciplina1, 2.5f);
        avaliacao5.Avaliacao(aluno9, disciplina1, 10.0f);
        avaliacao6.Avaliacao(aluno0, disciplina2, 5.0f);
        avaliacao7.Avaliacao(aluno1, disciplina2, 7.0f);
        avaliacao8.Avaliacao(aluno1, disciplina2, 8.5f);
        avaliacao9.Avaliacao(aluno3, disciplina2, 6.5f);
        avaliacao10.Avaliacao(aluno2, disciplina2, 7.0f);
        avaliacao11.Avaliacao(aluno6, disciplina3, 9.0f);
        avaliacao12.Avaliacao(aluno7, disciplina3, 5.0f);
        avaliacao13.Avaliacao(aluno9, disciplina3, 6.0f);
        avaliacao14.Avaliacao(aluno1, disciplina3, 7.0f);
        avaliacao15.Avaliacao(aluno2, disciplina3, 9.5f);
        avaliacao16.Avaliacao(aluno3, disciplina4, 8.0f);
        avaliacao17.Avaliacao(aluno4, disciplina4, 1.0f);
        avaliacao18.Avaliacao(aluno5, disciplina4, 6.0f);
        avaliacao19.Avaliacao(aluno6, disciplina4, 7.5f);
        avaliacao20.Avaliacao(aluno7, disciplina4, 6.5f);
        avaliacao21.Avaliacao(aluno8, disciplina5, 4.5f);
        avaliacao22.Avaliacao(aluno9, disciplina5, 7.0f);
        avaliacao23.Avaliacao(aluno0, disciplina5, 9.0f);
        avaliacao24.Avaliacao(aluno6, disciplina5, 8.0f);
        avaliacao25.Avaliacao(aluno4, disciplina5, 9.0f);


        repositorioAvalicacoes.adicionar(avaliacao1);
        repositorioAvalicacoes.adicionar(avaliacao2);
        repositorioAvalicacoes.adicionar(avaliacao3);
        repositorioAvalicacoes.adicionar(avaliacao4);
        repositorioAvalicacoes.adicionar(avaliacao5);
        repositorioAvalicacoes.adicionar(avaliacao6);
        repositorioAvalicacoes.adicionar(avaliacao7);
        repositorioAvalicacoes.adicionar(avaliacao8);
        repositorioAvalicacoes.adicionar(avaliacao9);
        repositorioAvalicacoes.adicionar(avaliacao10);
        repositorioAvalicacoes.adicionar(avaliacao11);
        repositorioAvalicacoes.adicionar(avaliacao12);
        repositorioAvalicacoes.adicionar(avaliacao13);
        repositorioAvalicacoes.adicionar(avaliacao14);
        repositorioAvalicacoes.adicionar(avaliacao15);
        repositorioAvalicacoes.adicionar(avaliacao16);
        repositorioAvalicacoes.adicionar(avaliacao17);
        repositorioAvalicacoes.adicionar(avaliacao18);
        repositorioAvalicacoes.adicionar(avaliacao19);
        repositorioAvalicacoes.adicionar(avaliacao20);
        repositorioAvalicacoes.adicionar(avaliacao21);
        repositorioAvalicacoes.adicionar(avaliacao22);
        repositorioAvalicacoes.adicionar(avaliacao23);
        repositorioAvalicacoes.adicionar(avaliacao24);
        repositorioAvalicacoes.adicionar(avaliacao25);

        repositorioAvalicacoes.obterAprovados(disciplina1);




    }
}