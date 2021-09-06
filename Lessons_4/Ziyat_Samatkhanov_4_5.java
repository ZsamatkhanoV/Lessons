/*Найти сумму элементов на главной диагонали матрицы n*n. Число n
пользователем вводится с клавиатуры.*/
import java.util.Scanner;
public class Ziyat_Samatkhanov_4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите n");
        int sum = 0;
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Элементы главной диагонали: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][i] + " ");
            sum += array[i][i];
        }
        System.out.println();
        System.out.println("Сумма " + sum);
    }
}
