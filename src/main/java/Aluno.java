/**
 *
 * @author Geovanio Carnelosso
 * @author Pedro Azevedo
 *
 */

public class Aluno {
    private String nome;
    private int ra;

    public Aluno(int ra, String nome){
        this.ra = ra;
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public int getRA(){
        return this.ra;
    }

}