/*Создать двухмерный квадратный массив, и заполнить его "бабочкой", т.е. таким образом:
                      1 1 1 1 1
                      0 1 1 1 0
                      0 0 1 0 0
                      0 1 1 1 0
                      1 1 1 1 1 */
import java.util.Scanner;
public class Ziyat_Samatkhanov_4_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите нечетную размерность матрицы");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("Введите нечетное число");
        }
        int[][] array = new int[n][n];
        int temp = 0;
        int check = 0;
        for (int i = 0; i < n; i++) {
            check = 0;
            for (int j = 0; j < n; j++) {
                temp = j - i;
                if (temp < 0 || temp >= n - 2 * i) {
                    array[i][j] = 0;
                    check++;
                } else {
                    array[i][j] = 1;
                }
            }
            if (check == n) {
                int m = 2;
                for (int k = i; k < n; k++) {
                    for (int j = 0; j < n; j++) {
                        array[k][j] = array[k - m][j];
                    }
                    m += 2;
                }
                break;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
