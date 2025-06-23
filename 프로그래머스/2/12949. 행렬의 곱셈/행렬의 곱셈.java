class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int a1 = arr1.length;
        int b2 = arr2.length;
        int a = arr1[0].length;
        int b = arr2[0].length;
        
        int[][] answer = new int [a1][b];
        
        for(int i=0; i<a1; i++){
            for(int j=0; j<b; j++){
                for(int k=0; k<a; k++){
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                    
            
                 }
            
             }
            
        }  
        
        return answer;
    }
}