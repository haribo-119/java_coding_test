package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Summing_Numbers {
    public static void main(String[] args) {
        // Q) N개의 숫자가 공백 없이 써 있다. 이 숫자를 모두 합해 출력하는 프로그램을 작성하시오.

        // 1번째 줄에 숫자의 개수 N(1<= N <= 100), 2번째 줄에 숫자 N개가 공백 없이 주어진다.

        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();

        if(!(1<=first && first<=100)){
            System.out.println("입력을 다시하세요");
            return;
        }

        System.out.println(first);

        String second = sc.next();  // next() 공백을 제거
        // 1234 5678입력시 1234만 입력
        if(!(second.length() == first)){
            System.out.println("길이가 맞지 않습니다");
            return;
        }

        int sum = 0;


        for(int i=0; i< second.length(); i++){
            sum += second.charAt(i)-'0'; // char 정수로 -'0'
        }

        System.out.println(sum);


    }
}
