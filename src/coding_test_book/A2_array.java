package coding_test_book;


// 배열 제어하기
/* 제약조건 : 시간복잡도 O(NlogN)
 * 배열 길이는 2 이상 1,000 이하입니다
 * 각 배열의 데이터 값은 -100,000이상 100,000 이하입니다
 */

import java.util.*;

// Q) 정수 배열 하나만 받습니다. 배열의 중복값을 제거하고
// 배열 데이터를 내림차순으로 정렬해서 반환하는 solution(); 함수를 구현하세요
public class A2_array {

    public static LinkedHashSet<Integer> solution(Integer[] arr){
        Arrays.sort(arr,Collections.reverseOrder());
        LinkedHashSet<Integer> result = new LinkedHashSet(Arrays.asList(arr));
        return result;
    }

    public static void main(String[] args) {

        System.out.println(solution(new Integer[]{4,2,2,1,3,4}));
        System.out.println(solution(new Integer[]{2,1,1,3,2,5,4}));
    }
}
