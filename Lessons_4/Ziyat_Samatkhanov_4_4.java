/*Создать массив, заполнить его случайными элементами. Определите сумму элементов
одномерного массива, расположенных между минимальм и максимальным значениями.*/
public class Ziyat_Samatkhanov_4_4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int max = array[0];
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 15);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]) {
                max = array[i];
                indexMax = i;
            }
            else if(min > array[i]){
                min = array[i];
                indexMin = i;
            }
        }
        System.out.println("Мин " + min);
        System.out.println("Макс " + max);
        int sum = 0;
        for (int i = Math.min(indexMin, indexMax) + 1; i < Math.max(indexMin, indexMax); i++) {
            sum += array[i];
        }
        System.out.println("Сумма " + sum);
    }
}
