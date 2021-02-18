
package finalTask;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class PresenceList {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Map<String, Integer> lista = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos alunos são? ");
        int alunos = sc.nextInt();

        while (alunos > 0 ){
            int i = 0;
            System.out.println("Aluno:");
            String name = sc.next();
            System.out.println("Esse aluno esteve presente no primeiro dia?  sim aperte X");
            String presente = sc.next();
           if(presente.equalsIgnoreCase("x")){
               i+=1;
           }
            System.out.println("Esse aluno esteve presente no segundo dia?  sim aperte X");
           presente = sc.next();
           if(presente.equalsIgnoreCase("x")){
                i+=1;
            }
            System.out.println("Esse aluno esteve presente no terceiro dia?  sim aperte X");
            presente = sc.next();
            if(presente.equalsIgnoreCase("x")){
                i+=1;
            }
            System.out.println("Esse aluno esteve presente no quarto dia?  sim aperte X");
            presente = sc.next();
            if(presente.equalsIgnoreCase("x")){
                i+=1;
            }
            System.out.println("Esse aluno esteve presente no quinto dia?  sim aperte X");
            presente = sc.next();
            if(presente.equalsIgnoreCase("x")){
                i+=1;
            }
            System.out.println("Esse aluno esteve presente no sexto dia?  sim aperte X");
            presente = sc.next();
            if(presente.equalsIgnoreCase("x")){
                i+=1;
            }
            lista.put(name,i);
            alunos--;
            sc.close();
        }
        System.out.println(lista);
    }

}
