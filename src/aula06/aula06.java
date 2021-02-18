package aula06;

import java.util.HashMap;

public class aula06 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("C", "Carro");
        map.put("M", "Moto");
        map.put("B", "Bicicleta");
        System.out.println(map.get("B"));


    }
}
