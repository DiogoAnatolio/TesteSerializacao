import java.io.*;
import java.util.Scanner;

public class ProjetoSerializacao {

    public static void leitor(String path) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        while (true){
            if (linha != null){
                System.out.println(linha);
            }else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }

    public static void escritor(String path) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
        String linha = "";
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva algo: ");
        linha = in.nextLine();
        buffWrite.append(linha + "\n");
        buffWrite.close();
    }

    public static void juntar(String path, String path2, String path3) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path3));
        BufferedReader buffReade = new BufferedReader(new FileReader(path));
        BufferedReader buffReade2 = new BufferedReader(new FileReader(path2));

        String nome, sobrenome;

        while ((nome = buffReade.readLine()) != null && (sobrenome = buffReade2.readLine()) != null) {
            buffWrite.write(nome + " " + sobrenome);
            buffWrite.newLine();
        }
        buffReade.close();
        buffReade2.close();
        buffWrite.close();
    }
}
