package coding_test_book;


// 배열 정렬하기
/* 제약 조건 : 시간복잡도 O(NlongN)
 * 정수 배열 길이는 2이상 10^5 이하입니다
 * 정수 배열 각 데이터 값은 -100,000 이상 100,000 이하입니다.
 */

import java.util.Arrays;
import java.util.Scanner;

public class A1_array {

public static int[] solution(int[] array, int size){
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < size; i++) {
        array[i] = sc.nextInt();
    }

    int[] clone = array.clone();

    Arrays.sort(array);
    System.out.println("변경전 : "+Arrays.toString(clone));
    System.out.println("변경후 : "+Arrays.toString(array));

    return array;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("입력 길이를 입력해주세요");
        int size = sc.nextInt();
        int[] array = new int[size];
        solution(array,size);



    }
}
