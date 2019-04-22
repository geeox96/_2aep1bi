import java.util.ArrayList;

/**
 *
 * @author Geovanio Carnelosso
 * @author Pedro Azevedo
 *
 */

public class App {
    public static void main(String[] args) {

        RepositoriosDeAvaliacoes  repositorioAvalicacoes = new RepositoriosDeAvaliacoes();

        Aluno aluno0 = new Aluno(1, "Cleide");
        Aluno aluno1 = new Aluno(2, "Juaum");
        Aluno aluno2 = new Aluno(3, "Cleber");
        Aluno aluno3 = new Aluno(4, "Larissa");
        Aluno aluno4 = new Aluno(5, "Maria");
        Aluno aluno5 = new Aluno(6, "Douglas");
        Aluno aluno6 = new Aluno(7, "Jailson");
        Aluno aluno7 = new Aluno(8, "Lucas");
        Aluno aluno8 = new Aluno(9, "Marcos");
        Aluno aluno9 = new Aluno(10, "Diogo");

        Disciplina disciplina1 = new Disciplina("Historia");
        Disciplina disciplina2 = new Disciplina("Geografia");
        Disciplina disciplina3 = new Disciplina("Ciencias");
        Disciplina disciplina4 = new Disciplina("Portugues");
        Disciplina disciplina5 = new Disciplina("Matematica");



        Avaliacao avaliacao1= new Avaliacao(aluno1, disciplina1, 6.0f);
        Avaliacao avaliacao2= new Avaliacao(aluno1, disciplina1, 8.0f);
        Avaliacao avaliacao3= new Avaliacao(aluno1, disciplina1, 9.0f);
        Avaliacao avaliacao4= new Avaliacao(aluno1, disciplina1, 5.0f);

        Avaliacao avaliacao5= new Avaliacao(aluno1, disciplina2, 7.0f);
        Avaliacao avaliacao6= new Avaliacao(aluno1, disciplina2, 5.0f);
        Avaliacao avaliacao7= new Avaliacao(aluno1, disciplina2, 6.0f);
        Avaliacao avaliacao8= new Avaliacao(aluno1, disciplina2, 9.0f);

        Avaliacao avaliacao9= new Avaliacao(aluno1, disciplina3, 3.0f);
        Avaliacao avaliacao10= new Avaliacao(aluno1, disciplina3, 9.0f);
        Avaliacao avaliacao11= new Avaliacao(aluno1, disciplina3, 8.0f);
        Avaliacao avaliacao12= new Avaliacao(aluno1, disciplina3, 9.0f);

        Avaliacao avaliacao13= new Avaliacao(aluno1, disciplina4, 6.5f);
        Avaliacao avaliacao14= new Avaliacao(aluno1, disciplina4, 8.0f);
        Avaliacao avaliacao15= new Avaliacao(aluno1, disciplina4, 6.0f);
        Avaliacao avaliacao16= new Avaliacao(aluno1, disciplina4, 10.0f);

        Avaliacao avaliacao17= new Avaliacao(aluno1, disciplina5, 6.0f);
        Avaliacao avaliacao18= new Avaliacao(aluno1, disciplina5, 5.0f);
        Avaliacao avaliacao19= new Avaliacao(aluno1, disciplina5, 6.5f);
        Avaliacao avaliacao20= new Avaliacao(aluno1, disciplina5, 6.5f);



        Avaliacao avaliacao21= new Avaliacao(aluno2, disciplina1, 4.0f);
        Avaliacao avaliacao22= new Avaliacao(aluno2, disciplina1, 5.0f);
        Avaliacao avaliacao23= new Avaliacao(aluno2, disciplina1, 6.0f);
        Avaliacao avaliacao24= new Avaliacao(aluno2, disciplina1, 6.0f);

        Avaliacao avaliacao25= new Avaliacao(aluno2, disciplina2, 7.0f);
        Avaliacao avaliacao26= new Avaliacao(aluno2, disciplina2, 8.0f);
        Avaliacao avaliacao27= new Avaliacao(aluno2, disciplina2, 6.5f);
        Avaliacao avaliacao28= new Avaliacao(aluno2, disciplina2, 5.0f);

        Avaliacao avaliacao29= new Avaliacao(aluno2, disciplina3, 9.0f);
        Avaliacao avaliacao30= new Avaliacao(aluno2, disciplina3, 9.5f);
        Avaliacao avaliacao31= new Avaliacao(aluno2, disciplina3, 8.0f);
        Avaliacao avaliacao32= new Avaliacao(aluno2, disciplina3, 6.0f);

        Avaliacao avaliacao33= new Avaliacao(aluno2, disciplina4, 9.0f);
        Avaliacao avaliacao34= new Avaliacao(aluno2, disciplina4, 4.0f);
        Avaliacao avaliacao35= new Avaliacao(aluno2, disciplina4, 6.0f);
        Avaliacao avaliacao36= new Avaliacao(aluno2, disciplina4, 9.0f);

        Avaliacao avaliacao37= new Avaliacao(aluno2, disciplina5, 5.0f);
        Avaliacao avaliacao38= new Avaliacao(aluno2, disciplina5, 2.0f);
        Avaliacao avaliacao39= new Avaliacao(aluno2, disciplina5, 3.0f);
        Avaliacao avaliacao40= new Avaliacao(aluno2, disciplina5, 5.5f);



        Avaliacao avaliacao41= new Avaliacao(aluno3, disciplina1, 9.0f);
        Avaliacao avaliacao42= new Avaliacao(aluno3, disciplina1, 8.0f);
        Avaliacao avaliacao43= new Avaliacao(aluno3, disciplina1, 7.5f);
        Avaliacao avaliacao44= new Avaliacao(aluno3, disciplina1, 5.0f);

        Avaliacao avaliacao45= new Avaliacao(aluno3, disciplina2, 4.0f);
        Avaliacao avaliacao46= new Avaliacao(aluno3, disciplina2, 2.5f);
        Avaliacao avaliacao47= new Avaliacao(aluno3, disciplina2, 3.0f);
        Avaliacao avaliacao48= new Avaliacao(aluno3, disciplina2, 5.0f);

        Avaliacao avaliacao49= new Avaliacao(aluno3, disciplina3, 2.0f);
        Avaliacao avaliacao50= new Avaliacao(aluno3, disciplina3, 3.5f);
        Avaliacao avaliacao51= new Avaliacao(aluno3, disciplina3, 4.0f);
        Avaliacao avaliacao52= new Avaliacao(aluno3, disciplina3, 6.0f);

        Avaliacao avaliacao53= new Avaliacao(aluno3, disciplina4, 1.0f);
        Avaliacao avaliacao54= new Avaliacao(aluno3, disciplina4, 2.5f);
        Avaliacao avaliacao55= new Avaliacao(aluno3, disciplina4, 5.0f);
        Avaliacao avaliacao56= new Avaliacao(aluno3, disciplina4, 8.0f);

        Avaliacao avaliacao57= new Avaliacao(aluno3, disciplina5, 2.0f);
        Avaliacao avaliacao58= new Avaliacao(aluno3, disciplina5, 6.0f);
        Avaliacao avaliacao59= new Avaliacao(aluno3, disciplina5, 3.0f);
        Avaliacao avaliacao60= new Avaliacao(aluno3, disciplina5, 1.5f);



        Avaliacao avaliacao61= new Avaliacao(aluno4, disciplina1, 5.5f);
        Avaliacao avaliacao62= new Avaliacao(aluno4, disciplina1, 8.0f);
        Avaliacao avaliacao63= new Avaliacao(aluno4, disciplina1, 9.0f);
        Avaliacao avaliacao64= new Avaliacao(aluno4, disciplina1, 9.0f);

        Avaliacao avaliacao65= new Avaliacao(aluno4, disciplina2, 8.0f);
        Avaliacao avaliacao66= new Avaliacao(aluno4, disciplina2, 1.0f);
        Avaliacao avaliacao67= new Avaliacao(aluno4, disciplina2, 2.0f);
        Avaliacao avaliacao68= new Avaliacao(aluno4, disciplina2, 1.5f);

        Avaliacao avaliacao69= new Avaliacao(aluno4, disciplina3, 5.0f);
        Avaliacao avaliacao70= new Avaliacao(aluno4, disciplina3, 2.5f);
        Avaliacao avaliacao71= new Avaliacao(aluno4, disciplina3, 1.0f);
        Avaliacao avaliacao72= new Avaliacao(aluno4, disciplina3, 6.0f);

        Avaliacao avaliacao73= new Avaliacao(aluno4, disciplina4, 6.0f);
        Avaliacao avaliacao74= new Avaliacao(aluno4, disciplina4, 2.0f);
        Avaliacao avaliacao75= new Avaliacao(aluno4, disciplina4, 3.0f);
        Avaliacao avaliacao76= new Avaliacao(aluno4, disciplina4, 6.5f);

        Avaliacao avaliacao77= new Avaliacao(aluno4, disciplina5, 5.0f);
        Avaliacao avaliacao78= new Avaliacao(aluno4, disciplina5, 5.0f);
        Avaliacao avaliacao79= new Avaliacao(aluno4, disciplina5, 5.0f);
        Avaliacao avaliacao80= new Avaliacao(aluno4, disciplina5, 5.0f);


        Avaliacao avaliacao81= new Avaliacao(aluno5, disciplina1, 7.0f);
        Avaliacao avaliacao82= new Avaliacao(aluno5, disciplina1, 6.0f);
        Avaliacao avaliacao83= new Avaliacao(aluno5, disciplina1, 7.0f);
        Avaliacao avaliacao84= new Avaliacao(aluno5, disciplina1, 9.0f);

        Avaliacao avaliacao85= new Avaliacao(aluno5, disciplina2, 8.5f);
        Avaliacao avaliacao86= new Avaliacao(aluno5, disciplina2, 9.0f);
        Avaliacao avaliacao87= new Avaliacao(aluno5, disciplina2, 5.0f);
        Avaliacao avaliacao88= new Avaliacao(aluno5, disciplina2, 6.5f);

        Avaliacao avaliacao89= new Avaliacao(aluno5, disciplina3, 5.0f);
        Avaliacao avaliacao90= new Avaliacao(aluno5, disciplina3, 8.0f);
        Avaliacao avaliacao91= new Avaliacao(aluno5, disciplina3, 1.5f);
        Avaliacao avaliacao92= new Avaliacao(aluno5, disciplina3, 1.0f);

        Avaliacao avaliacao93= new Avaliacao(aluno5, disciplina4, 2.0f);
        Avaliacao avaliacao94= new Avaliacao(aluno5, disciplina4, 5.5f);
        Avaliacao avaliacao95= new Avaliacao(aluno5, disciplina4, 1.5f);
        Avaliacao avaliacao96= new Avaliacao(aluno5, disciplina4, 6.5f);

        Avaliacao avaliacao97= new Avaliacao(aluno5, disciplina5, 4.0f);
        Avaliacao avaliacao98= new Avaliacao(aluno5, disciplina5, 2.0f);
        Avaliacao avaliacao99= new Avaliacao(aluno5, disciplina5, 3.5f);
        Avaliacao avaliacao100= new Avaliacao(aluno5, disciplina5, 5.5f);



        Avaliacao avaliacao101= new Avaliacao(aluno6, disciplina1, 9.0f);
        Avaliacao avaliacao102= new Avaliacao(aluno6, disciplina1, 8.5f);
        Avaliacao avaliacao103= new Avaliacao(aluno6, disciplina1, 7.0f);
        Avaliacao avaliacao104= new Avaliacao(aluno6, disciplina1, 4.0f);

        Avaliacao avaliacao105= new Avaliacao(aluno6, disciplina2, 9.0f);
        Avaliacao avaliacao106= new Avaliacao(aluno6, disciplina2, 6.0f);
        Avaliacao avaliacao107= new Avaliacao(aluno6, disciplina2, 7.0f);
        Avaliacao avaliacao108= new Avaliacao(aluno6, disciplina2, 5.0f);

        Avaliacao avaliacao109= new Avaliacao(aluno6, disciplina3, 9.5f);
        Avaliacao avaliacao110= new Avaliacao(aluno6, disciplina3, 8.5f);
        Avaliacao avaliacao111= new Avaliacao(aluno6, disciplina3, 5.0f);
        Avaliacao avaliacao112= new Avaliacao(aluno6, disciplina3, 7.5f);

        Avaliacao avaliacao113= new Avaliacao(aluno6, disciplina4, 5.0f);
        Avaliacao avaliacao114= new Avaliacao(aluno6, disciplina4, 4.5f);
        Avaliacao avaliacao115= new Avaliacao(aluno6, disciplina4, 2.0f);
        Avaliacao avaliacao116= new Avaliacao(aluno6, disciplina4, 2.05f);

        Avaliacao avaliacao117= new Avaliacao(aluno6, disciplina5, 5.0f);
        Avaliacao avaliacao118= new Avaliacao(aluno6, disciplina5, 3.5f);
        Avaliacao avaliacao119= new Avaliacao(aluno6, disciplina5, 2.0f);
        Avaliacao avaliacao120= new Avaliacao(aluno6, disciplina5, 6.0f);



        Avaliacao avaliacao121= new Avaliacao(aluno7, disciplina1, 8.0f);
        Avaliacao avaliacao122= new Avaliacao(aluno7, disciplina1, 4.0f);
        Avaliacao avaliacao123= new Avaliacao(aluno7, disciplina1, 7.0f);
        Avaliacao avaliacao124= new Avaliacao(aluno7, disciplina1, 5.0f);

        Avaliacao avaliacao125= new Avaliacao(aluno7, disciplina2, 4.0f);
        Avaliacao avaliacao126= new Avaliacao(aluno7, disciplina2, 8.0f);
        Avaliacao avaliacao127= new Avaliacao(aluno7, disciplina2, 7.0f);
        Avaliacao avaliacao128= new Avaliacao(aluno7, disciplina2, 6.0f);

        Avaliacao avaliacao129= new Avaliacao(aluno7, disciplina3, 5.0f);
        Avaliacao avaliacao130= new Avaliacao(aluno7, disciplina3, 6.0f);
        Avaliacao avaliacao131= new Avaliacao(aluno7, disciplina3, 8.0f);
        Avaliacao avaliacao132= new Avaliacao(aluno7, disciplina3, 8.0f);

        Avaliacao avaliacao133= new Avaliacao(aluno7, disciplina4, 7.0f);
        Avaliacao avaliacao134= new Avaliacao(aluno7, disciplina4, 9.0f);
        Avaliacao avaliacao135= new Avaliacao(aluno7, disciplina4, 9.0f);
        Avaliacao avaliacao136= new Avaliacao(aluno7, disciplina4, 9.0f);

        Avaliacao avaliacao137= new Avaliacao(aluno7, disciplina5, 9.0f);
        Avaliacao avaliacao138= new Avaliacao(aluno7, disciplina5, 5.0f);
        Avaliacao avaliacao139= new Avaliacao(aluno7, disciplina5, 8.0f);
        Avaliacao avaliacao140= new Avaliacao(aluno7, disciplina5, 7.0f);



        Avaliacao avaliacao141= new Avaliacao(aluno8, disciplina1, 8.0f);
        Avaliacao avaliacao142= new Avaliacao(aluno8, disciplina1, 6.0f);
        Avaliacao avaliacao143= new Avaliacao(aluno8, disciplina1, 7.5f);
        Avaliacao avaliacao144= new Avaliacao(aluno8, disciplina1, 5.5f);

        Avaliacao avaliacao145= new Avaliacao(aluno8, disciplina2, 5.0f);
        Avaliacao avaliacao146= new Avaliacao(aluno8, disciplina2, 7.5f);
        Avaliacao avaliacao147= new Avaliacao(aluno8, disciplina2, 8.5f);
        Avaliacao avaliacao148= new Avaliacao(aluno8, disciplina2, 7.5f);

        Avaliacao avaliacao149= new Avaliacao(aluno8, disciplina3, 7.0f);
        Avaliacao avaliacao150= new Avaliacao(aluno8, disciplina3, 7.5f);
        Avaliacao avaliacao151= new Avaliacao(aluno8, disciplina3, 7.5f);
        Avaliacao avaliacao152= new Avaliacao(aluno8, disciplina3, 8.0f);

        Avaliacao avaliacao153= new Avaliacao(aluno8, disciplina4, 7.5f);
        Avaliacao avaliacao154= new Avaliacao(aluno8, disciplina4, 6.0f);
        Avaliacao avaliacao155= new Avaliacao(aluno8, disciplina4, 5.0f);
        Avaliacao avaliacao156= new Avaliacao(aluno8, disciplina4, 5.5f);

        Avaliacao avaliacao157= new Avaliacao(aluno8, disciplina5, 8.5f);
        Avaliacao avaliacao158= new Avaliacao(aluno8, disciplina5, 5.0f);
        Avaliacao avaliacao159= new Avaliacao(aluno8, disciplina5, 2.0f);
        Avaliacao avaliacao160= new Avaliacao(aluno8, disciplina5, 10.0f);



        Avaliacao avaliacao161= new Avaliacao(aluno9, disciplina1, 7.0f);
        Avaliacao avaliacao162= new Avaliacao(aluno9, disciplina1, 9.0f);
        Avaliacao avaliacao163= new Avaliacao(aluno9, disciplina1, 8.0f);
        Avaliacao avaliacao164= new Avaliacao(aluno9, disciplina1, 10.0f);

        Avaliacao avaliacao165= new Avaliacao(aluno9, disciplina2, 9.0f);
        Avaliacao avaliacao166= new Avaliacao(aluno9, disciplina2, 8.0f);
        Avaliacao avaliacao167= new Avaliacao(aluno9, disciplina2, 5.0f);
        Avaliacao avaliacao168= new Avaliacao(aluno9, disciplina2, 8.5f);

        Avaliacao avaliacao169= new Avaliacao(aluno9, disciplina3, 5.0f);
        Avaliacao avaliacao170= new Avaliacao(aluno9, disciplina3, 2.5f);
        Avaliacao avaliacao171= new Avaliacao(aluno9, disciplina3, 2.0f);
        Avaliacao avaliacao172= new Avaliacao(aluno9, disciplina3, 7.5f);

        Avaliacao avaliacao173= new Avaliacao(aluno9, disciplina4, 5.0f);
        Avaliacao avaliacao174= new Avaliacao(aluno9, disciplina4, 6.5f);
        Avaliacao avaliacao175= new Avaliacao(aluno9, disciplina4, 6.0f);
        Avaliacao avaliacao176= new Avaliacao(aluno9, disciplina4, 1.0f);

        Avaliacao avaliacao177= new Avaliacao(aluno9, disciplina5, 8.0f);
        Avaliacao avaliacao178= new Avaliacao(aluno9, disciplina5, 5.0f);
        Avaliacao avaliacao179= new Avaliacao(aluno9, disciplina5, 5.5f);
        Avaliacao avaliacao180= new Avaliacao(aluno9, disciplina5, 8.0f);



        Avaliacao avaliacao181= new Avaliacao(aluno0, disciplina1, 10.0f);
        Avaliacao avaliacao182= new Avaliacao(aluno0, disciplina1, 2.0f);
        Avaliacao avaliacao183= new Avaliacao(aluno0, disciplina1, 3.5f);
        Avaliacao avaliacao184= new Avaliacao(aluno0, disciplina1, 9.0f);

        Avaliacao avaliacao185= new Avaliacao(aluno0, disciplina2, 10.0f);
        Avaliacao avaliacao186= new Avaliacao(aluno0, disciplina2, 6.0f);
        Avaliacao avaliacao187= new Avaliacao(aluno0, disciplina2, 4.0f);
        Avaliacao avaliacao188= new Avaliacao(aluno0, disciplina2, 5.5f);

        Avaliacao avaliacao189= new Avaliacao(aluno0, disciplina3, 10.0f);
        Avaliacao avaliacao190= new Avaliacao(aluno0, disciplina3, 9.0f);
        Avaliacao avaliacao191= new Avaliacao(aluno0, disciplina3, 3.0f);
        Avaliacao avaliacao192= new Avaliacao(aluno0, disciplina3, 6.0f);

        Avaliacao avaliacao193= new Avaliacao(aluno0, disciplina4, 8.0f);
        Avaliacao avaliacao194= new Avaliacao(aluno0, disciplina4, 5.0f);
        Avaliacao avaliacao195= new Avaliacao(aluno0, disciplina4, 7.5f);
        Avaliacao avaliacao196= new Avaliacao(aluno0, disciplina4, 6.0f);

        Avaliacao avaliacao197= new Avaliacao(aluno0, disciplina5, 1.0f);
        Avaliacao avaliacao198= new Avaliacao(aluno0, disciplina5, 6.0f);
        Avaliacao avaliacao199= new Avaliacao(aluno0, disciplina5, 5.0f);
        Avaliacao avaliacao200= new Avaliacao(aluno0, disciplina5, 2.0f);




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
        repositorioAvalicacoes.adicionar(avaliacao26);
        repositorioAvalicacoes.adicionar(avaliacao27);
        repositorioAvalicacoes.adicionar(avaliacao28);
        repositorioAvalicacoes.adicionar(avaliacao29);
        repositorioAvalicacoes.adicionar(avaliacao30);
        repositorioAvalicacoes.adicionar(avaliacao31);
        repositorioAvalicacoes.adicionar(avaliacao32);
        repositorioAvalicacoes.adicionar(avaliacao33);
        repositorioAvalicacoes.adicionar(avaliacao34);
        repositorioAvalicacoes.adicionar(avaliacao35);
        repositorioAvalicacoes.adicionar(avaliacao36);
        repositorioAvalicacoes.adicionar(avaliacao37);
        repositorioAvalicacoes.adicionar(avaliacao38);
        repositorioAvalicacoes.adicionar(avaliacao39);
        repositorioAvalicacoes.adicionar(avaliacao40);
        repositorioAvalicacoes.adicionar(avaliacao41);
        repositorioAvalicacoes.adicionar(avaliacao42);
        repositorioAvalicacoes.adicionar(avaliacao43);
        repositorioAvalicacoes.adicionar(avaliacao44);
        repositorioAvalicacoes.adicionar(avaliacao45);
        repositorioAvalicacoes.adicionar(avaliacao46);
        repositorioAvalicacoes.adicionar(avaliacao47);
        repositorioAvalicacoes.adicionar(avaliacao48);
        repositorioAvalicacoes.adicionar(avaliacao49);
        repositorioAvalicacoes.adicionar(avaliacao50);
        repositorioAvalicacoes.adicionar(avaliacao51);
        repositorioAvalicacoes.adicionar(avaliacao52);
        repositorioAvalicacoes.adicionar(avaliacao53);
        repositorioAvalicacoes.adicionar(avaliacao54);
        repositorioAvalicacoes.adicionar(avaliacao55);
        repositorioAvalicacoes.adicionar(avaliacao56);
        repositorioAvalicacoes.adicionar(avaliacao57);
        repositorioAvalicacoes.adicionar(avaliacao58);
        repositorioAvalicacoes.adicionar(avaliacao59);
        repositorioAvalicacoes.adicionar(avaliacao60);
        repositorioAvalicacoes.adicionar(avaliacao61);
        repositorioAvalicacoes.adicionar(avaliacao62);
        repositorioAvalicacoes.adicionar(avaliacao63);
        repositorioAvalicacoes.adicionar(avaliacao64);
        repositorioAvalicacoes.adicionar(avaliacao65);
        repositorioAvalicacoes.adicionar(avaliacao66);
        repositorioAvalicacoes.adicionar(avaliacao67);
        repositorioAvalicacoes.adicionar(avaliacao68);
        repositorioAvalicacoes.adicionar(avaliacao69);
        repositorioAvalicacoes.adicionar(avaliacao70);
        repositorioAvalicacoes.adicionar(avaliacao71);
        repositorioAvalicacoes.adicionar(avaliacao72);
        repositorioAvalicacoes.adicionar(avaliacao73);
        repositorioAvalicacoes.adicionar(avaliacao74);
        repositorioAvalicacoes.adicionar(avaliacao75);
        repositorioAvalicacoes.adicionar(avaliacao76);
        repositorioAvalicacoes.adicionar(avaliacao77);
        repositorioAvalicacoes.adicionar(avaliacao78);
        repositorioAvalicacoes.adicionar(avaliacao79);
        repositorioAvalicacoes.adicionar(avaliacao80);
        repositorioAvalicacoes.adicionar(avaliacao81);
        repositorioAvalicacoes.adicionar(avaliacao82);
        repositorioAvalicacoes.adicionar(avaliacao83);
        repositorioAvalicacoes.adicionar(avaliacao84);
        repositorioAvalicacoes.adicionar(avaliacao85);
        repositorioAvalicacoes.adicionar(avaliacao86);
        repositorioAvalicacoes.adicionar(avaliacao87);
        repositorioAvalicacoes.adicionar(avaliacao88);
        repositorioAvalicacoes.adicionar(avaliacao89);
        repositorioAvalicacoes.adicionar(avaliacao90);
        repositorioAvalicacoes.adicionar(avaliacao91);
        repositorioAvalicacoes.adicionar(avaliacao92);
        repositorioAvalicacoes.adicionar(avaliacao93);
        repositorioAvalicacoes.adicionar(avaliacao94);
        repositorioAvalicacoes.adicionar(avaliacao95);
        repositorioAvalicacoes.adicionar(avaliacao96);
        repositorioAvalicacoes.adicionar(avaliacao97);
        repositorioAvalicacoes.adicionar(avaliacao98);
        repositorioAvalicacoes.adicionar(avaliacao99);
        repositorioAvalicacoes.adicionar(avaliacao100);
        repositorioAvalicacoes.adicionar(avaliacao101);
        repositorioAvalicacoes.adicionar(avaliacao102);
        repositorioAvalicacoes.adicionar(avaliacao103);
        repositorioAvalicacoes.adicionar(avaliacao104);
        repositorioAvalicacoes.adicionar(avaliacao105);
        repositorioAvalicacoes.adicionar(avaliacao106);
        repositorioAvalicacoes.adicionar(avaliacao107);
        repositorioAvalicacoes.adicionar(avaliacao108);
        repositorioAvalicacoes.adicionar(avaliacao109);
        repositorioAvalicacoes.adicionar(avaliacao110);
        repositorioAvalicacoes.adicionar(avaliacao111);
        repositorioAvalicacoes.adicionar(avaliacao112);
        repositorioAvalicacoes.adicionar(avaliacao113);
        repositorioAvalicacoes.adicionar(avaliacao114);
        repositorioAvalicacoes.adicionar(avaliacao115);
        repositorioAvalicacoes.adicionar(avaliacao116);
        repositorioAvalicacoes.adicionar(avaliacao117);
        repositorioAvalicacoes.adicionar(avaliacao118);
        repositorioAvalicacoes.adicionar(avaliacao119);
        repositorioAvalicacoes.adicionar(avaliacao120);
        repositorioAvalicacoes.adicionar(avaliacao121);
        repositorioAvalicacoes.adicionar(avaliacao122);
        repositorioAvalicacoes.adicionar(avaliacao123);
        repositorioAvalicacoes.adicionar(avaliacao124);
        repositorioAvalicacoes.adicionar(avaliacao125);
        repositorioAvalicacoes.adicionar(avaliacao126);
        repositorioAvalicacoes.adicionar(avaliacao127);
        repositorioAvalicacoes.adicionar(avaliacao128);
        repositorioAvalicacoes.adicionar(avaliacao129);
        repositorioAvalicacoes.adicionar(avaliacao130);
        repositorioAvalicacoes.adicionar(avaliacao131);
        repositorioAvalicacoes.adicionar(avaliacao132);
        repositorioAvalicacoes.adicionar(avaliacao133);
        repositorioAvalicacoes.adicionar(avaliacao134);
        repositorioAvalicacoes.adicionar(avaliacao135);
        repositorioAvalicacoes.adicionar(avaliacao136);
        repositorioAvalicacoes.adicionar(avaliacao137);
        repositorioAvalicacoes.adicionar(avaliacao138);
        repositorioAvalicacoes.adicionar(avaliacao139);
        repositorioAvalicacoes.adicionar(avaliacao140);
        repositorioAvalicacoes.adicionar(avaliacao141);
        repositorioAvalicacoes.adicionar(avaliacao142);
        repositorioAvalicacoes.adicionar(avaliacao143);
        repositorioAvalicacoes.adicionar(avaliacao144);
        repositorioAvalicacoes.adicionar(avaliacao145);
        repositorioAvalicacoes.adicionar(avaliacao146);
        repositorioAvalicacoes.adicionar(avaliacao147);
        repositorioAvalicacoes.adicionar(avaliacao148);
        repositorioAvalicacoes.adicionar(avaliacao149);
        repositorioAvalicacoes.adicionar(avaliacao150);
        repositorioAvalicacoes.adicionar(avaliacao151);
        repositorioAvalicacoes.adicionar(avaliacao152);
        repositorioAvalicacoes.adicionar(avaliacao153);
        repositorioAvalicacoes.adicionar(avaliacao154);
        repositorioAvalicacoes.adicionar(avaliacao155);
        repositorioAvalicacoes.adicionar(avaliacao156);
        repositorioAvalicacoes.adicionar(avaliacao157);
        repositorioAvalicacoes.adicionar(avaliacao158);
        repositorioAvalicacoes.adicionar(avaliacao159);
        repositorioAvalicacoes.adicionar(avaliacao160);
        repositorioAvalicacoes.adicionar(avaliacao161);
        repositorioAvalicacoes.adicionar(avaliacao162);
        repositorioAvalicacoes.adicionar(avaliacao163);
        repositorioAvalicacoes.adicionar(avaliacao164);
        repositorioAvalicacoes.adicionar(avaliacao165);
        repositorioAvalicacoes.adicionar(avaliacao166);
        repositorioAvalicacoes.adicionar(avaliacao167);
        repositorioAvalicacoes.adicionar(avaliacao168);
        repositorioAvalicacoes.adicionar(avaliacao169);
        repositorioAvalicacoes.adicionar(avaliacao170);
        repositorioAvalicacoes.adicionar(avaliacao171);
        repositorioAvalicacoes.adicionar(avaliacao172);
        repositorioAvalicacoes.adicionar(avaliacao173);
        repositorioAvalicacoes.adicionar(avaliacao174);
        repositorioAvalicacoes.adicionar(avaliacao175);
        repositorioAvalicacoes.adicionar(avaliacao176);
        repositorioAvalicacoes.adicionar(avaliacao177);
        repositorioAvalicacoes.adicionar(avaliacao178);
        repositorioAvalicacoes.adicionar(avaliacao179);
        repositorioAvalicacoes.adicionar(avaliacao180);
        repositorioAvalicacoes.adicionar(avaliacao181);
        repositorioAvalicacoes.adicionar(avaliacao182);
        repositorioAvalicacoes.adicionar(avaliacao183);
        repositorioAvalicacoes.adicionar(avaliacao184);
        repositorioAvalicacoes.adicionar(avaliacao185);
        repositorioAvalicacoes.adicionar(avaliacao186);
        repositorioAvalicacoes.adicionar(avaliacao187);
        repositorioAvalicacoes.adicionar(avaliacao188);
        repositorioAvalicacoes.adicionar(avaliacao189);
        repositorioAvalicacoes.adicionar(avaliacao190);
        repositorioAvalicacoes.adicionar(avaliacao191);
        repositorioAvalicacoes.adicionar(avaliacao192);
        repositorioAvalicacoes.adicionar(avaliacao193);
        repositorioAvalicacoes.adicionar(avaliacao194);
        repositorioAvalicacoes.adicionar(avaliacao195);
        repositorioAvalicacoes.adicionar(avaliacao196);
        repositorioAvalicacoes.adicionar(avaliacao197);
        repositorioAvalicacoes.adicionar(avaliacao198);
        repositorioAvalicacoes.adicionar(avaliacao199);
        repositorioAvalicacoes.adicionar(avaliacao200);



        System.out.println(repositorioAvalicacoes.obterAprovados(disciplina5));

    }


}