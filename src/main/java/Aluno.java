public class Aluno {
    private String nome;
    private int ra;

    public void Aluno(int ra, String nome){
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