public class code3 {
    public static void main(String[] args) {
        String[] flores = {"Violeta", "Rosas", "Girassol", "Orquidea", "Lirio"};

        int[] quantidade = new int[5];

        quantidade[0] = 3;
        quantidade[1] = 4;
        quantidade[2] = 2;
        quantidade[3] = 8;
        quantidade[4] = 5;

        int maior = quantidade[0];
        int indiceMaior = 0; 

        for (int i = 0; i < flores.length; i++) {
            if (quantidade[i] > maior) {
                maior = quantidade[i];
                indiceMaior = i;
            }
        }

        System.out.println("A flor com maior quantidade é " + flores[indiceMaior] + " com " + maior + " unidades.");
    }
}