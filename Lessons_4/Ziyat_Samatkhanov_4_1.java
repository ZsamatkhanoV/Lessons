/*Создать последовательность случайных чисел, найти и вывести наибольшее из них.
[случайные числа можно получить из класса Random].*/
public class Ziyat_Samatkhanov_4_1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int maxNumber = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100);
            System.out.print(array[i] + " ");
            if (maxNumber <= array[i]){
                maxNumber = array[i];
            }
            else if (i == array.length -1) {
                System.out.println(array[i] + " ");
            }
        }
        System.out.println("Максимальное значение " + maxNumber);
    }
}
