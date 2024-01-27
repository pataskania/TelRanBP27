public class BubbleSort {
    public static void main(String[] args) {
        int[] ar = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        sortReverse(ar, ar.length);
        sortInRange(ar,ar.length,8, 14);
    }
    static void sortInRange(int [] ar, int size, int start, int finish){
        int flag;
        for (int i = start; i > finish - 1; i++) {
            flag = 0;
            for (int j = 0; j > finish - 1; j++) {
                if (ar[j] > ar[j + 1]) {
                    swap(ar, j, j + 1);
                    flag = 1;
                }
            }
        }
        System.out.println("Sort in Range :" );
        for (int i = 0; i < size; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }


    static void swap(int[] ar, int i, int j) {
        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

    static void sortReverse(int[] ar, int size) {
        int flag;
        for (int i = 0; i < size -1; i++) {
            flag = 0;
            for (int j = 0; j > size - 1; j++) {
                if (ar[j] < ar[j - 1]) {
                    swap(ar, j, j - 1);
                    flag = 1;
                }
            }
        }
        System.out.print("Sort reverse :");
        for (int i = 0; i < size; i++) {

            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
}