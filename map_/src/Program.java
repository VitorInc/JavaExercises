import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();

        System.out.print("Digite o caminho do arquivo: ");
        String path = in.nextLine();


        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line = reader.readLine();
            while(line != null) {


                String [] fields  = line.split(",");
                String name = fields[0];
                Integer votes = Integer.parseInt(fields[1]);
                if (map.get(name) == null) {
                    map.put(name, votes);
                }
                else {
                    map.put(name, votes + map.get(name));

                }
                line = reader.readLine();;
            }

            for(String key: map.keySet()){
                System.out.println(key + ":" + map.get(key));
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        in.close();

    }
}
