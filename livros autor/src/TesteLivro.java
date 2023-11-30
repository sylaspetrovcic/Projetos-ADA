import java.util.Arrays;

public class TesteLivro {
    public static void main(String[] args) {
        Livros[] livros = new Livros[2];
        Autor autor = new Autor("Érico Veríssimo");
        Livros livro = new Livros("Olhai os lirios do campo");
        Livros livro1 = new Livros("Incidente em Antares");
        livro.genero = "Romance";
        Livros[] Livros = new Livros[2];
        Livros[0] = livro;
        Livros[1] = livro1;
        System.out.println(autor.nome +"\nGênero: " + livro.genero + " "+ "\nLivros: \n"+ livro.nomeDoLivro +
               "\n"+ livro1.nomeDoLivro);



            
        }
    }

