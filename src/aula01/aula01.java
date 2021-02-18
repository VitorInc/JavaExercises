package aula01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class aula01 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<String> firstArray = new LinkedList<>();
        firstArray.add("Zero");
        firstArray.add("Um");
        firstArray.add("Dois");
        firstArray.add("Três");
        firstArray.add("Quatro");
        firstArray.add("Cinco");
        firstArray.add("Zero");
        firstArray.add("Um");
        firstArray.add("Dois");
        firstArray.add("Três");
        firstArray.add("Quatro");
        firstArray.add("Cinco");

        System.out.println(firstArray);
        System.out.println(firstArray.get(0));
        System.out.println(firstArray.get(1));
        System.out.println(firstArray.get(2));
        System.out.println(firstArray.get(3));
        System.out.println(firstArray.get(4));
        System.out.println(firstArray.get(5));

        for (String numeral : firstArray) {
            System.out.println(numeral);
        }
        firstArray.remove(4);
        for (int i = 0; i<firstArray.size();i++){
            System.out.println(firstArray.get(i));
        }
    }
}
