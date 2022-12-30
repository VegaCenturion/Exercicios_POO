import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Pricipal {
    public static void main(String[] args) {
        Set s = LerArquivo.retornaString("c:/plantas.txt"); //le o arquivo e retorna um conjunto de plantas
        Map plantas = Utils.retornaDados(s); //retorna um mapa com as plantas
        Scanner sc = new Scanner(System.in); //sc é um scanner
        String id = sc.next(); //o proximo item lido e o id
        if (Utils.existe(plantas.values(),Planta.getId())){ //se o id existe no mapa
            System.out.println(Planta.getId(id)); //imprime o id
        } else {
            System.out.println("Planta com esse id ("+ Planta.getId() + ") nao existe" ); //imprime que nao existe
        }
    }
}

