
import java.util.Scanner;
public class Modulo2At  {
    
    public static void main (String[] args) {
        boolean repetir = true;
        while(repetir){
        
        System.out.println("|      MENU         |");        
        System.out.println("|    OPÇÕES         |");
        System.out.println("|       1 .OPÇÃO    |");
        System.out.println("|       2 .OPÇÃO    |");
        System.out.println("|       3 .OPÇÃO    |");
        Scanner menu = new Scanner(System.in);
        System.out.println("Selecione uma opção ");
        int opcao = menu.nextInt();

        if (opcao == 3 ){
            repetir = false;                                
        } else 
        {
            repetir = true;
        }
       
        
        switch (opcao) {
            case 1:
            System.out.println("Opcao 1 selecionada");
            break;
            case 2:
            System.out.println("Opcao 2 selecionada");
            break;
            case 3:
            System.out.println("Sair");
            break;
            default:
            System.out.println("inválido");
            break;
        }
            
        }
        

    }
    
}
