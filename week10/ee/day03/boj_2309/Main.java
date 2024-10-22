package boj_2309;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[9];

        for (int i = 0; i < 9; i++) {
            Scanner sc = new Scanner(System.in);

            array[i] = sc.nextInt();

        }
        System.out.println(array);
    }

}
