package aula03;

public class aula03 {
    public static void main(String[] args) {
        int[] valore = new int[5];
        valore[0] = 55;
        valore[1] = 54;
        valore[2] = 53;
        valore[3] = 52;
        valore[4] = 51;

        for(int i = 0; i< valore.length; i++){
            System.out.println(valore[i]);
        }
        int[] valoreRevers = new int[valore.length];
        int posit = valore.length - 1;
        for(int i = posit; i>=0;i--){
            System.out.println(valore[i]);
        }
    }
}
