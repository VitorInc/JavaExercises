package aula94;

public class aula04 {
    public static void main(String[] args) {
        int[][] calendario = new int [5][7];
        int dia =0;
        for(int i = 0; i < 7; i++){

            for (int x = 0;x<5;x++){
                dia ++;
                calendario[x][i] = dia;
            }

        }
        for(int i= 0; i < calendario.length;i++){
            for(int x = 0; x < calendario[i].length; x++){
                System.out.println(calendario[i][x] + " ");
            }
            System.out.println("");
        }
    }

}
