import java.util.ArrayList;

/**
 *
 * @author Geovanio Carnelosso
 * @author Pedro Azevedo
 *
 */

public class RepositoriosDeAvaliacoes {
    private ArrayList<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();

    public void Adicionar(Avaliacao avaliacao){
        this.avaliacoes.add(avaliacao);
    }

    public Aluno[] obterAprovados(Disciplina disciplina){
        Aluno[] aprovados = new Aluno[10];

        for( int i = 0 ; i <= avaliacoes.size(); i++){
            avaliacoes.listIterator();
        }

        return aprovados[];
    }
}