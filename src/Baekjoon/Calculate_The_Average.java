package Baekjoon;
/*   문제] 세준이는 기말고사를 망쳤다. 그래서 점수를 조작해 집에 가져가기로 결심했다.
     세준이는 자기 점수중 최대값을 골랐다. 그런 다음 최대값을 M이라 할 때 모든 점수를 점수/M*100으로 고쳤다.
     예들 들어 세준이의 최고점이 70점, 수학 점수가 50점이라면 수학 점수는 50/70*100이므로 71.43점이다.
     세준이의 성적을 이 방법으로 계산했을 때 새로운 평균을 구하는 프로그램을 작성하시오.  */

import java.util.Arrays;
import java.util.Scanner;

public class Calculate_The_Average {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        if(!(count<=1000)){ //1000보다 작거나 같다
            return;
        }

        int save = 0;
        int[] score = new int[count];


        for(int i=0; i<count; i++){
             save = sc.nextInt();

             if( 0<save && save<=100){
                score[i] = save;
            }
        }
        
        
        int max = 0;
        int sum = 0;
        int result = 0;

        for(int y=0; y<count; y++){
            int tmp = score[y];

                sum +=tmp; // 합계
             if(tmp > max){
                 max = tmp; //최대값
             }

        }

       result = sum*100/max/count;

        System.out.println(result);



    }
}
