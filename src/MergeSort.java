public class MergeSort {

    // 합병 정렬 메서드
    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return;
        }
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        // 배열을 두 부분으로 분할
        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        // 재귀적으로 정렬
        mergeSort(left);
        mergeSort(right);

        // 두 부분을 병합
        merge(array, left, right);
    }

    // 병합 메서드
    public static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // 두 부분 배열을 병합
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // 남은 원소 처리
        while (i < left.length) {
            array[k++] = left[i++];
        }
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    // 테스트 메서드
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};
        System.out.println("주어진 배열");
        printArray(array);

        mergeSort(array);

        System.out.println("정렬된 배열");
        printArray(array);
    }

    // 배열 출력 메서드
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
