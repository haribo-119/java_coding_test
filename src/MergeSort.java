public class MergeSort {
    // 병합 정렬 함수
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // 중간 지점 계산
            int mid = (left + right) / 2;

            // 왼쪽 절반 정렬
            mergeSort(arr, left, mid);
            // 오른쪽 절반 정렬
            mergeSort(arr, mid + 1, right);

            // 두 절반을 병합
            merge(arr, left, mid, right);
        }
    }

    // 병합 함수
    public static void merge(int[] arr, int left, int mid, int right) {
        // 두 부분 배열의 크기 계산
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // 임시 배열 생성
        int[] L = new int[n1];
        int[] R = new int[n2];

        // 데이터 복사
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[mid + 1 + j];
        }

        // 임시 배열 병합
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // 남은 요소들 복사
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // 메인 함수
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Unsorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
