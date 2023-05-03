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
        String linha = "";
        while (true) {
            if(buffReade.readLine() != null || buffReade2.readLine() != null) {
                linha = buffReade.readLine() + "" + buffReade2.readLine();
                System.out.println(linha);
                buffWrite.append(linha + "\n");
            }else
                break;
        }
        buffReade.close();
        buffWrite.close();
        buffReade2.close();
    }
}
