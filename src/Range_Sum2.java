import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/*
* 시간제한 1초 백준 11660
*/
public class Range_Sum2 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //4
        int M = Integer.parseInt(st.nextToken());

        int A[][] = new int[N+1][N+1]; //5 5
        for(int i=1; i<=N; i++){ // 1 2 3 4
            st = new StringTokenizer(br.readLine());
        for(int j=1; j<=N; j++){ // 1 2 3 4
            A[i][j] = Integer.parseInt(st.nextToken());
        }
        }

//        int A[][] = new int[N+1][N+1]; //5 5
        for(int i=1; i<=N; i++){ //0 1 2 3 4
            System.out.println();
            for(int j=1; j<=N; j++){ // 1 2 3 4
                System.out.print(A[i][j]);
            }
        }


        int D[][] = new int[N+1][N+1]; //  2 2
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                // 구간 합 구하기
                D[i][j] =D[i][j-1] + D[i-1][j] - D[i-1][j-1] + A[i][j];// 00
            }
        }

        for(int i=0; i<M; i++){
            st =new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            // 구간 합 배열
            int result = D[x2][y2] - D[x1-1][y2] -D[x2][y1 -1] +D[x1-1][y1-1];
            System.out.println(result);

        }

    }
}
