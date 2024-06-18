import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
* 1번째 줄에 수의 개수 N(1<=N<=100,000), 합을 구해야 하는 횟수 M(1<=M<=100,000), 2번째 줄에
* N개의 수가 주어진다. 각 수는 1,000보다 작거나 같은 자연수다. 3번째 줄부터는 M개의 줄에 합을
* 구해야 하는 구간 i와 j가 주어진다.
*/

// 제한 시간 0.5초
public class Range_Sum {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = // 100,000 개의 데이터를 받기위해 사용
                new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = //int형으로 변경하기 위해 값을 분리
                new StringTokenizer(bufferedReader.readLine());

        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());
        
        // 합 배열 만들기
        long[] S = new long[suNo + 1]; //+1를 한 이유 : 0번때 인덱스를 무시하기 위해

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 1; i <= suNo; i++) {
            S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        // 구간 합 공식
        for (int q = 0; q < quizNo; q++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i - 1]);
        }

    }

}
