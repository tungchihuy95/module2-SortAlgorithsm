package Sapxep;

public class SelectionSort {
    static double list[] = {3, 4.5, -2, -1.6, 5, 9, 6.8};
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
            /* Find the minimum in the list[i..list.length-1] */
            double currentMin = list[i];
            int currentMinIndex = i;

            //tim tu phan tu thu2 tro di...
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            /* Swap list[i] with list[currentMinIndex] if necessary, (neu ddungs vi tri thi khong can doi vi tri) */
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
        }
    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
    }

