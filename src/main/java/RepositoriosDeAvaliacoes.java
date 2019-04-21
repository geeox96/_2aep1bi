import java.util.ArrayList;

/**
 *
 * @author Geovanio Carnelosso
 * @author Pedro Azevedo
 *
 */

public class RepositoriosDeAvaliacoes {
    private ArrayList<Avaliacao> avaliacoes = new ArrayList <Avaliacao>();

    public void adicionar(Avaliacao avaliacao){
        this.avaliacoes.add(avaliacao);
    }

    public ArrayList obterAprovados(Disciplina disciplina){
        int contador=0;
        Avaliacao aux;
        ArrayList Alunos = new ArrayList();
        while(contador <= avaliacoes.size()){
            aux = avaliacoes.get(contador);
            if(aux.getDisciplina() == disciplina && aux.getNota() >= 7){

                Alunos.add(aux.getAluno());
                Alunos.add(aux.getNota());
                contador++;
            }
            contador++;
        }
        return Alunos;
    }
}
