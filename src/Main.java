import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Projetos\\ArquivosNomes.txt";
        String path2 = "C:\\Projetos\\SobreNomes.txt";
        String path3 = "C:\\Projetos\\NomeESobreNome.txt";

        //ProjetoSerializacao.leitor(path);
        //ProjetoSerializacao.leitor(path2);

        ProjetoSerializacao.juntar(path, path2, path3);

    }

}
