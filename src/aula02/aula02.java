package aula02;

import java.util.HashSet;

import java.util.Set;

public class aula02 {
    public static void main(String[] args) {
        Set<String> secondArray = new HashSet<>();
        secondArray.add("Zero");
        secondArray.add("Um");
        secondArray.add("Dois");
        secondArray.add("Três");
        secondArray.add("Quatro");
        secondArray.add("Cinco");
        System.out.println(secondArray.add("Zero"));
        System.out.println(secondArray.add("Um"));
        System.out.println(secondArray.add("Dois"));
        System.out.println(secondArray.add("Três"));
        System.out.println(secondArray.add("Quatro"));
        System.out.println(secondArray.add("Cinco"));

        for (String numeral: secondArray){
            System.out.println(numeral);

        }
    }

}
