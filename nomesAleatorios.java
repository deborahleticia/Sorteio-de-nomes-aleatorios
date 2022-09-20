import java.util.Scanner;

public class nomesAleatorios {

    static String meuMetodo(int quantNum, String nomes[]){

        int numero = (int) (1 + (Math.random() * quantNum));
        
        String retorno = "O nome sorteado foi: " + nomes[numero] + "." ;
        return retorno;
        
    }
    public static void main(String[] args){

        Scanner A = new Scanner(System.in);
    
        System.out.println("Informe a quantidade de nomes que será sorteada: ");
        int quantNum = A.nextInt();
        A.nextLine(); // usei para limpar o buffer 
        
        String nomes[] = new String[100];
        
        for (int i=1; i<=quantNum; i++){
            System.out.println("Informe o " + i + "o nome: ");
            nomes[i] = A.nextLine();    
        }

        System.out.println("                                                                     ");
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println(meuMetodo(quantNum, nomes));
        System.out.println(" - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("                                                                     ");
    }
}
    