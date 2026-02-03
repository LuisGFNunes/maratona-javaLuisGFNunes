package academy.devdojo.javaoneforall.introduction.exercicios;

import java.util.Random;
import java.util.Scanner;

public class MatrizQuadradoPerfeito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Informe o número de valores a serem gerados: ");
        int num = input.nextInt();
        System.out.print("Informe o valores que deseja gerar aleatoriamente de 0 a k: ");
        int k = input.nextInt();

        if (Math.sqrt(num) == (int) Math.sqrt(num)) {
            System.out.println("Quadrado perfeito; Matriz de Ordem " + (int) Math.sqrt(num) + "x" + (int) Math.sqrt(num));

            int[][] matriz = new int[(int) Math.sqrt(num)][(int) Math.sqrt(num)];
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = rand.nextInt(1,k + 1);
                }
            }

            System.out.print("M - ");
            for (int i = 0; i < matriz.length; i++) {

                if (i > 0) { System.out.print("    "); }

                System.out.print("|");
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.printf("%3d ", matriz[i][j]);
                }
                System.out.println("|");
            }

        } else if (num < 0) {
            System.out.println("Numero invalido dentro do Domínio da Função = sqrt(x)");
        } else {
            System.out.println("Não é um quadrado perfeito");
        }
    }
}
